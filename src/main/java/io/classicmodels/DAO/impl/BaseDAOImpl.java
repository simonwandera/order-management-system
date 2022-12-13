package io.classicmodels.DAO.impl;

import io.classicmodels.DAO.BaseDAO;

import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@TransactionManagement(TransactionManagementType.CONTAINER)
public class BaseDAOImpl<T, ID> implements BaseDAO<T, ID> {

    private final Class<T> entityClass;

    @PersistenceContext
    EntityManager entityManager;

    protected BaseDAOImpl(Class<T> entityClass) {
        this.entityClass = entityClass;
    }


    @Override
    public Long getCountOfEntity() {
        return (long) this.listAll().size();
    }

    public T insert(T entity) {
        return entityManager.merge(entity);
    }

    @Override
    public List<T> listAll() {
        return (List<T>) entityManager.createQuery("SELECT t FROM " + entityClass.getSimpleName() + " t", entityClass)

                .getResultList();
    }

    @Override
    public T read(ID id) {
        return entityManager.find(entityClass, id);
    }

    @Override
    public boolean delete(T entity) {
        entityManager.merge(entity);
        entityManager.remove(entity);
        return true;
    }

    public boolean deleteById(ID id) {
        return this.delete(
                this.read(id)
        );
    }
}
