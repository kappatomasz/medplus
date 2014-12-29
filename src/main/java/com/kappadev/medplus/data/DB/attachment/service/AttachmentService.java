package com.kappadev.medplus.data.DB.attachment.service;

import com.kappadev.medplus.data.DB.attachment.entity.Attachment;

public interface AttachmentService {

    public void saveAttachment(Attachment attachment);

    public void removeAttachment(Attachment attachment);

    public Iterable<Attachment> getAttachmentListByPatientId(Long id);
}
