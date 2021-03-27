package wade.com.dossier_patient.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wade.com.dossier_patient.dao.PatientRepository;

import java.util.List;
@RestController
public class PatientRestServices {
    @Autowired
    private PatientRepository patientRepository;
    @GetMapping(value = "/listPatients")
    public List<Patient>listPatients(){
        return patientRepository.findAll();
    }
    @GetMapping(value = "/listPatients{idP}")
    public Patient patient(@PathVariable(name = "idP") Long idP){
        return patientRepository.findById(idP).get();
    }
    @PutMapping(value = "/listPatients{idP}")
    public Patient update(@PathVariable(name = "idP") Long idP, @RequestBody Patient p){
        p.setIdP(idP);
        return patientRepository.save(p);
    }
    @PostMapping(value = "/listPatients")
    public Patient save(@RequestBody Patient p){
        return patientRepository.save(p);
    }
    @DeleteMapping(value = "/listPatients{idP}")
    public void delete(@PathVariable(name = "idP")Long idP){
        patientRepository.deleteById(idP);
    }

}
