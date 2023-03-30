package gr.iserveu.eshoplicence.service.base;

import java.util.Set;

public interface CrudService<T, ID> {

    T findByUid(ID id);

    T save(T object);

    Set<T> findAll();

    T update(ID id, T object);

    void deleteByUid(ID uid);
}
