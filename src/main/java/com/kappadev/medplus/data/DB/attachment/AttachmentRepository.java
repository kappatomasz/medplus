package com.kappadev.medplus.data.DB.attachment;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author tburzynski
 */
public interface AttachmentRepository extends JpaRepository<Attachment, Long> {

    /**
     *
     * @param id
     * @return
     */
    public List<Attachment> findAllAttachmentsByPatientLogId(Long id);

}
