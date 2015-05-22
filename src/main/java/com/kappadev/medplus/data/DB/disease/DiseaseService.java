package com.kappadev.medplus.data.DB.disease;

import com.kappadev.medplus.data.DB.disease.Disease;
import java.util.List;

public interface DiseaseService {
    
    public void updateDisease(Disease disease);

    public void saveDisease(Disease disease);

    public void removeDisease(Disease disease);

    public List<Disease> getAllDiseases();

    public Disease getDiseaseWithId(Long id);
}
