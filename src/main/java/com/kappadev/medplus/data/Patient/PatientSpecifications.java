/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kappadev.medplus.data.Patient;

import com.kappadev.medplus.data.Patient.entity.Patient;
import com.kappadev.medplus.utils.StringUtils;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

/**
 *
 * @author tburzynski
 */
public class PatientSpecifications {

    public static Specification<Patient> nameIsLike(final String searchTerm) {
        return (Root<Patient> patientRoot, CriteriaQuery<?> cq, CriteriaBuilder cb) -> {
            String likePattern = StringUtils.getLikePattern(searchTerm);
            return cb.like(cb.lower(patientRoot.<String>get(Patient_.name)), likePattern);
        };
    }

    public static Specification<Patient> secondNameIsLike(final String searchTerm) {
        return (Root<Patient> patientRoot, CriteriaQuery<?> cq, CriteriaBuilder cb) -> {
            String likePattern = StringUtils.getLikePattern(searchTerm);
            return cb.like(cb.lower(patientRoot.<String>get(Patient_.secondName)), likePattern);
        };
    }

    public static Specification<Patient> surnameIsLike(final String searchTerm) {
        return (Root<Patient> patientRoot, CriteriaQuery<?> cq, CriteriaBuilder cb) -> {
            String likePattern = StringUtils.getLikePattern(searchTerm);
            return cb.like(cb.lower(patientRoot.<String>get(Patient_.surname)), likePattern);
        };
    }

    public static Specification<Patient> streetIsLike(final String searchTerm) {
        return (Root<Patient> patientRoot, CriteriaQuery<?> cq, CriteriaBuilder cb) -> {
            String likePattern = StringUtils.getLikePattern(searchTerm);
            return cb.like(cb.lower(patientRoot.<String>get(Patient_.street)), likePattern);
        };
    }

    public static Specification<Patient> houseNoIsLike(final String searchTerm) {
        return (Root<Patient> patientRoot, CriteriaQuery<?> cq, CriteriaBuilder cb) -> {
            String likePattern = StringUtils.getLikePattern(searchTerm);
            return cb.like(cb.lower(patientRoot.<String>get(Patient_.houseNo)), likePattern);
        };
    }

    public static Specification<Patient> flatNoIsLike(final String searchTerm) {
        return (Root<Patient> patientRoot, CriteriaQuery<?> cq, CriteriaBuilder cb) -> {
            String likePattern = StringUtils.getLikePattern(searchTerm);
            return cb.like(cb.lower(patientRoot.<String>get(Patient_.flatNo)), likePattern);
        };
    }

    public static Specification<Patient> cityIsLike(final String searchTerm) {
        return (Root<Patient> patientRoot, CriteriaQuery<?> cq, CriteriaBuilder cb) -> {
            String likePattern = StringUtils.getLikePattern(searchTerm);
            return cb.like(cb.lower(patientRoot.<String>get(Patient_.city)), likePattern);
        };
    }

    public static Specification<Patient> postCodeIsLike(final String searchTerm) {
        return (Root<Patient> patientRoot, CriteriaQuery<?> cq, CriteriaBuilder cb) -> {
            String likePattern = StringUtils.getLikePattern(searchTerm);
            return cb.like(cb.lower(patientRoot.<String>get(Patient_.postCode)), likePattern);
        };
    }

    public static Specification<Patient> idIsLike(final String searchTerm) {
        return (Root<Patient> patientRoot, CriteriaQuery<?> cq, CriteriaBuilder cb) -> {
            String likePattern = StringUtils.getLikePattern(searchTerm);
            return cb.like(cb.lower(patientRoot.<String>get(Patient_.id.toString())), likePattern);
        };
    }

    public static Specification<Patient> phoneIsLike(final String searchTerm) {
        return (Root<Patient> patientRoot, CriteriaQuery<?> cq, CriteriaBuilder cb) -> {
            String likePattern = StringUtils.getLikePattern(searchTerm);
            return cb.like(cb.lower(patientRoot.<String>get(Patient_.phone)), likePattern);
        };
    }

    //TODO(tburzynski) debug check is it works ?
    public static Specification<Patient> stateIsLike(final String searchTerm) {
        return (Root<Patient> patientRoot, CriteriaQuery<?> cq, CriteriaBuilder cb) -> {
            String likePattern = StringUtils.getLikePattern(searchTerm);
            return cb.like(cb.lower(patientRoot.<String>get(Patient_.state.toString())), likePattern);
        };
    }

    //TODO(tburzynski) debug check is it works ?
    public static Specification<Patient> diseaseIsLike(final String searchTerm) {
        return (Root<Patient> patientRoot, CriteriaQuery<?> cq, CriteriaBuilder cb) -> {
            String likePattern = StringUtils.getLikePattern(searchTerm);
            return cb.like(cb.lower(patientRoot.<String>get(Patient_.disease.toString())), likePattern);
        };
    }
}
