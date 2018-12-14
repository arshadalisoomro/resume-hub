package pk.edu.iba.rh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pk.edu.iba.rh.model.User;
import pk.edu.iba.rh.repository.UserRepository;
import pk.edu.iba.rh.utill.CrudOperation;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by ADMIN on 12/14/2018.
 */

@Service
@Transactional
public class UserService implements CrudOperation<User>{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).isPresent() ? userRepository.findById(id).get() : null;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAllByOrderByUserIdDesc();
    }
}
