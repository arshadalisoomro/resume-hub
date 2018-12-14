package pk.edu.iba.rh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pk.edu.iba.rh.model.Education;

import java.util.List;

/**
 * Created by ADMIN on 12/14/2018.
 */

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {
    List<Education> findAllByOrderByEducationIdDesc();
}
