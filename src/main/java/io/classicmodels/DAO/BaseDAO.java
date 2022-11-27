package io.classicmodels.DAO;

import java.util.List;
import java.util.stream.Stream;

public interface BaseDAO<T, ID> {

    Long getCountOfEntity();

    T insert(T entity);

    List<T> listAll();

    T read(ID id);

    boolean delete(T entity);

    boolean deleteById(ID id);


}
