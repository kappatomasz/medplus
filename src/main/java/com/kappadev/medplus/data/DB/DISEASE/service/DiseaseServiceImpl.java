package com.kappadev.medplus.data.DB.DISEASE.service;

import com.kappadev.medplus.data.DB.disease.entity.Disease;
import com.kappadev.medplus.data.DB.disease.repository.DiseaseRepository;
import java.util.List;
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
    public List<Disease> getAllDiseases() {
        return diseaseRepository.findAll();
    }

    @Override
    public Disease getDiseaseWithId(Long id) {
        return diseaseRepository.findOne(id);
    }

    @Override
    public void updateDisease(Disease disease) {
        Disease dis = diseaseRepository.findOne(disease.getId());
        dis.setDescription(disease.getDescription());
        dis.setName(disease.getName());
        diseaseRepository.save(dis);
    }
}
