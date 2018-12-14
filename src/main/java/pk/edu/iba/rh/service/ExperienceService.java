package pk.edu.iba.rh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pk.edu.iba.rh.model.Experience;
import pk.edu.iba.rh.repository.ExperienceRepository;
import pk.edu.iba.rh.utill.CrudOperation;

import java.util.List;

/**
 * Created by ADMIN on 12/14/2018.
 */

@Service
public class ExperienceService implements CrudOperation<Experience>{

    @Autowired
    private ExperienceRepository experienceRepository;

    @Override
    public void save(Experience experience) {
        experienceRepository.save(experience);
    }

    @Override
    public void delete(Experience experience) {
        experienceRepository.delete(experience);
    }

    @Override
    public Experience findById(Long id) {
        return experienceRepository.findById(id).isPresent() ? experienceRepository.findById(id).get() : null;
    }

    @Override
    public List<Experience> findAll() {
        return experienceRepository.findAllByOrderByExperienceIdDesc();
    }
}
