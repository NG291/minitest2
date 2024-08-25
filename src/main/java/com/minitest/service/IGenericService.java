package com.minitest.service;

public interface IGenericService<T> {
    T findById(Long id);
    void save(T t);
    void delete(T t);
}
