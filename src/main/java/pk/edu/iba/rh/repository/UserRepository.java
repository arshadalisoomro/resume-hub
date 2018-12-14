package pk.edu.iba.rh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pk.edu.iba.rh.model.User;

import java.util.List;

/**
 * Created by ADMIN on 12/14/2018.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    List<User> findAllByOrderByUserIdDesc();
}
