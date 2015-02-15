package com.kappadev.medplus.data.DB.attachment.service;

import com.kappadev.medplus.data.DB.attachment.entity.Attachment;
import com.kappadev.medplus.data.DB.attachment.repository.AttachmentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AttachmentServiceImpl implements AttachmentService {

    @Autowired
    AttachmentRepository attachmentRepository;

    @Transactional
    @Override
    public void saveAttachment(Attachment attachment) {
        attachmentRepository.save(attachment);
    }

    @Transactional
    @Override
    public void removeAttachment(Attachment attachment) {
        attachmentRepository.delete(attachment);
    }

    @Transactional
    @Override
    public List<Attachment> getAttachmentListByPatientId(Long id) {
        return attachmentRepository.findAllAttachmentsByPatientId(id);
    }

    @Transactional
    @Override
    public void updateAttachment(Attachment attachment) {
        Attachment atch = attachmentRepository.findOne(attachment.getId());
        atch.setBlob(attachment.getBlob());
        atch.setDisease(attachment.getDisease());
        atch.setFileName(attachment.getFileName());
        atch.setPatient(attachment.getPatient());
        atch.setContentType(attachment.getContentType());
        attachmentRepository.save(atch);
    }
}
