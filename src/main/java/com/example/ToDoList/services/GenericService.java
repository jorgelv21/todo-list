package com.example.ToDoList.services;

import com.example.ToDoList.exceptions.NotFoundException;
import com.example.ToDoList.model.GenericClass;
import com.example.ToDoList.repositories.GenericRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Generic Service.
 * @param <T> - Generic Class
 * @param <L> - Generic Number
 */
@Service
public abstract class GenericService<T extends GenericClass, L extends Number> {

    /**
     * Generic repository instance
     */
    @Autowired
    private final GenericRepository<T, L> genericRepository;

    /**
     * Generic Service Constructor
     * @param genericRepository - Generic Repository
     */
    protected GenericService(GenericRepository<T, L> genericRepository) {
        this.genericRepository = genericRepository;
    }

    /**
     * Find all data method
     * @return Data list.
     */
    public List<T> getAllData(){
        return genericRepository.findAll();
    }

    /**
     * Find data by id method.
     * @param id - Data id
     * @return Data
     */
    public T getDataById(L id){
        return genericRepository.findById(id).orElseThrow(() -> new NotFoundException("Object Not Found"));
    }

    /**
     * Create data method.
     * @param payload - Data payload
     * @return New data
     */
    public T createData(T payload){
        return genericRepository.save(payload);
    }

    /**
     * Update data method
     * @param payload Data payload
     * @param id - Data id
     */
    public void updateData(T payload, L id){
        T object = getDataById(id);
        BeanUtils.copyProperties(payload, object, "id");
        genericRepository.saveAndFlush(object);
    }

    /**
     * Delete data logically method
     * @param id - Data id.
     */
    public void deleteDataLogically(L id){
        T object = getDataById(id);
        object.setDeleted(true);
        genericRepository.saveAndFlush(object);
    }

    /**
     * Delete Physically method.
     * @param id - Data id.
     */
    public void deleteDataPhysically(L id){
    T object = getDataById(id);
    genericRepository.delete(object);
    }
}
