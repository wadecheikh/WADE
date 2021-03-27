package wade.com.dossier_patient.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Dossier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idD;
    private Date dateEntré;
    private Date dateSortie;
    private String motifConsultation;
    private String antecedants;
    private String cte_mesurations;
    private String examenAppareil;
    private String resume;
    private String HD;
    private  String CAT;
    private Patient patient;
    private Medecin medecin;
}
