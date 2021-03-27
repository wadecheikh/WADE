package wade.com.dossier_patient.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="P1",types = Patient.class)
public interface PatientProjection {
    public String getNom();
    public String getPrenom();
}
