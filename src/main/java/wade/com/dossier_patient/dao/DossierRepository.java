package wade.com.dossier_patient.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import wade.com.dossier_patient.entities.Dossier;

@RepositoryRestResource
public interface DossierRepository extends JpaRepository<Dossier,Long>{
   // public Page<Patient> findById(@Param("mc") Integer id, Pageable pageable);
}
