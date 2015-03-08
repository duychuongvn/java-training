package vn.smartdev.tdd.dao.repository;

import java.io.Serializable;

public interface BaseRepository<T, Id extends Serializable> {

    T findById(Id id);
    T save(T entity);
    void delete(T entity);
}
