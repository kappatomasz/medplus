/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.DB.attachment.repository.impl;

import com.kappadev.medplus.data.DB.attachment.repository.AttachmentCustomRepository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author tburzynski
 */
public class AttachmentCustomRepositoryImpl implements AttachmentCustomRepository {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    private EntityManager entityManager = entityManagerFactory.createEntityManager();

}
