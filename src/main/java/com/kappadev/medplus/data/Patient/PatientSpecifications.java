package com.kappadev.medplus.data.Patient;

import com.kappadev.medplus.data.DB.disease.Disease;
import com.kappadev.medplus.data.DB.states.States;
import com.kappadev.medplus.utils.StringUtils;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
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

    public static Specification<Patient> peselIsLike(final String searchTerm) {
        return (Root<Patient> patientRoot, CriteriaQuery<?> cq, CriteriaBuilder cb) -> {
            String likePattern = StringUtils.getLikePattern(searchTerm);
            return cb.like(cb.lower(patientRoot.<String>get(Patient_.pesel.toString())), likePattern);
        };
    }

    public static Specification<Patient> phoneIsLike(final String searchTerm) {
        return (Root<Patient> patientRoot, CriteriaQuery<?> cq, CriteriaBuilder cb) -> {
            String likePattern = StringUtils.getLikePattern(searchTerm);
            return cb.like(cb.lower(patientRoot.<String>get(Patient_.phone)), likePattern);
        };
    }

    public static Specification<Patient> stateEq(final States states) {
        return (Root<Patient> patientRoot, CriteriaQuery<?> cq, CriteriaBuilder cb) -> {
            return cb.equal(patientRoot.get(Patient_.state), states);
        };
    }

    public static Specification<Patient> diseaseIn(final List<Disease> disease) {
        return new Specification<Patient>() {

            @Override
            public Predicate toPredicate(Root<Patient> patientRoot, CriteriaQuery<?> cq, CriteriaBuilder cb) {   
                Expression<Disease> exp = patientRoot.get("patientLog").<Disease>get("diseases");
                return cb.in(exp.in(disease));
            }
        };
    }
}
