package wade.com.dossier_patient.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import wade.com.dossier_patient.entities.Patient;
@CrossOrigin("*")
@RepositoryRestResource
public interface PatientRepository extends JpaRepository<Patient,Long>{
    @RestResource(path="/byNom")
    public Page<Patient> findByNom(@Param("mc") String nom, Pageable pageable);
}
