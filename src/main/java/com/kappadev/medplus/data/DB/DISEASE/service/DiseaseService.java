package com.kappadev.medplus.data.DB.DISEASE.service;

import com.kappadev.medplus.data.DB.disease.entity.Disease;
import java.util.List;

public interface DiseaseService {

    public void saveDisease(Disease disease);

    public void removeDisease(Disease disease);

    public List<Disease> getAllDiseases();

    public Disease getDiseaseWithId(Long id);
}
