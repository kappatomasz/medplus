package com.kappadev.medplus.data.DB.attachment.service;

import com.kappadev.medplus.data.DB.attachment.entity.Attachment;
import com.kappadev.medplus.data.DB.attachment.repository.AttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    public Iterable<Attachment> getAttachmentListByPatientId(Long id) {
        return attachmentRepository.findAllAttachmentsByPatientId(id);
    }
}
