/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.DB.attachment.repository;

import com.kappadev.medplus.data.DB.attachment.entity.Attachment;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author tburzynski
 */
public interface AttachmentRepository extends CrudRepository<Attachment, Long>{

    /**
     *
     * @param id
     * @return
     */
    public List<Attachment> findAllAttachmentsByPatientId(Long id);
}
