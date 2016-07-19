package com.kappadev.medplus.data.DB.disease2patientLog;

import com.kappadev.medplus.data.DB.disease.Disease;
import com.kappadev.medplus.data.PatientLog.PatientLog;
import java.util.List;

/**
 *
 * @author tburzynski
 */
public interface Disease2PatientLogService {

    public List<PatientLog> getPatientLogsByDisease(Disease disease);

    public void mapDiseaseToPatientLog(Disease disease, PatientLog patientLog);

    public void removeDiseaseToPatientLogMapping(Disease disease, PatientLog patientLog);

    public List<Disease> getDiseasesByPatientLog(PatientLog patientLog);

}
