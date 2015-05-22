package com.kappadev.medplus.data.DB.attachment;

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
    public void removeAttachmentList(List<Attachment> attachmentList){
        attachmentRepository.delete(attachmentList);
    }

    @Transactional
    @Override
    public List<Attachment> getAttachmentListByPatientLogId(Long id) {
        return attachmentRepository.findAllAttachmentsByPatientLogId(id);
    }

    @Transactional
    @Override
    public void updateAttachment(Attachment attachment) {
        Attachment atch = attachmentRepository.findOne(attachment.getId());
        atch.setBlob(attachment.getBlob());
        atch.setFileName(attachment.getFileName());
        atch.setContentType(attachment.getContentType());
        attachmentRepository.save(atch);
    }
}
