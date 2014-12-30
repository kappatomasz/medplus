package com.kappadev.medplus.data.DB.disease.service;

import com.kappadev.medplus.data.DB.disease.entity.Disease;
import com.kappadev.medplus.data.DB.disease.repository.DiseaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class DiseaseServiceImpl implements DiseaseService {

    @Autowired
    DiseaseRepository diseaseRepository;

    @Transactional
    @Override
    public void saveDisease(Disease disease) {
        diseaseRepository.save(disease);
    }

    @Transactional
    @Override
    public void removeDisease(Disease disease) {
        diseaseRepository.delete(disease);
    }

    @Override
    public Iterable<Disease> getAllDiseases() {
        return diseaseRepository.findAll();
    }

    @Override
    public Disease getDiseaseWithId(Long id) {
        return diseaseRepository.findOne(id);
    }
}
