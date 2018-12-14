package pk.edu.iba.rh.utill;

import java.util.List;

/**
 * Created by ADMIN on 12/14/2018.
 */
public interface CrudOperation<T> {
    void save(T t);
    void delete(T t);
    T findById(Long id);
    List<T> findAll();
}
