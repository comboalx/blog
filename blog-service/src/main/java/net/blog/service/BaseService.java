package net.blog.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T, I> {

    T byId(I id);
    Serializable save(T object);
    void update(T object);
    void delete(T object);
    List<T> list();
}

