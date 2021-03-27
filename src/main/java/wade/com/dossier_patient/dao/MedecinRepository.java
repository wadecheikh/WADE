package wade.com.dossier_patient.dao;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import wade.com.dossier_patient.entities.Medecin;

import java.util.List;

@RepositoryRestResource
public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    @RestResource(path="/byNomMedecin")
    public List<Medecin> findByNomMedecinContains(@Param("mc") String nom, Pageable pageable);

}
