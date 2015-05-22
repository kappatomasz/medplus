package com.kappadev.medplus.data.DB.attachment;

import java.util.List;

public interface AttachmentService {

    public void updateAttachment(Attachment attachment);

    public void saveAttachment(Attachment attachment);

    public void removeAttachment(Attachment attachment);

    public void removeAttachmentList(List<Attachment> attachment);

    public List<Attachment> getAttachmentListByPatientLogId(Long id);
}
