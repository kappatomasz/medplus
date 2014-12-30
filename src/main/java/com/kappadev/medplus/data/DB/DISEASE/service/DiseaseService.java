package com.kappadev.medplus.data.DB.disease.service;

import com.kappadev.medplus.data.DB.disease.entity.Disease;

public interface DiseaseService {

    public void saveDisease(Disease disease);

    public void removeDisease(Disease disease);

    public Iterable<Disease> getAllDiseases();

    public Disease getDiseaseWithId(Long id);
}
