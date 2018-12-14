package pk.edu.iba.rh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pk.edu.iba.rh.model.Education;
import pk.edu.iba.rh.repository.EducationRepository;
import pk.edu.iba.rh.utill.CrudOperation;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by ADMIN on 12/14/2018.
 */

@Service
@Transactional
public class EducationService implements CrudOperation<Education>{

    @Autowired
    private EducationRepository educationRepository;

    @Override
    public void save(Education education) {
        educationRepository.save(education);
    }

    @Override
    public void delete(Education education) {
        educationRepository.delete(education);
    }

    @Override
    public Education findById(Long id) {
        return educationRepository.findById(id).isPresent() ? educationRepository.findById(id).get() : null ;
    }

    @Override
    public List<Education> findAll() {
        return educationRepository.findAllByOrderByEducationIdDesc();
    }
}
