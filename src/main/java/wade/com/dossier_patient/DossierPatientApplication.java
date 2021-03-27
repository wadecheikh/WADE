package wade.com.dossier_patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import wade.com.dossier_patient.dao.PatientRepository;
import wade.com.dossier_patient.entities.Patient;

@SpringBootApplication
public class DossierPatientApplication implements CommandLineRunner {
    @Autowired
    //private MedecinRepository medecinRepository;
    private PatientRepository patientRepository;
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(DossierPatientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*
        medecinRepository.save(new Medecin(1,"Racky","wade","pediatre"));
        medecinRepository.save(new Medecin(2,"Oumou","diallo","pediatre"));
        medecinRepository.save(new Medecin(3,"Djiby","Ndiaye","pediatre"));
medecinRepository.findAll().forEach(p->{
    System.out.println(p.toString());
});*/
        repositoryRestConfiguration.exposeIdsFor(Patient.class);
patientRepository.save(new Patient(null,"Fatou","Diop","771583053","dakar",4));
patientRepository.save(new Patient(null,"Matar","Diop","771584043","diourbel",1));
patientRepository.save(new Patient(null,"Fallou","Ndiaye","771584055","dakar",12));
patientRepository.save(new Patient(null,"Fama","Fall","771584053","Louga",3));
   patientRepository.findAll().forEach(p -> {
       System.out.println(p.toString());

   });
    }
}
