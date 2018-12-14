package pk.edu.iba.rh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pk.edu.iba.rh.model.Skill;

import java.util.List;

/**
 * Created by ADMIN on 12/14/2018.
 */
@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
    List<Skill> findAllByOrderBySkillIdDesc();
}
