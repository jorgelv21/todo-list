package com.example.ToDoList.services;

import com.example.ToDoList.exceptions.NotFoundException;
import com.example.ToDoList.model.GenericClass;
import com.example.ToDoList.repositories.GenericRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class GenericService<T extends GenericClass, L extends Number> {

    @Autowired
    private final GenericRepository<T, L> genericRepository;

    protected GenericService(GenericRepository<T, L> genericRepository) {
        this.genericRepository = genericRepository;
    }

    public List<?> getAllData(){
        return genericRepository.findAll();
    }

    public T getDataById(L id){
        return genericRepository.findById(id).orElseThrow(() -> new NotFoundException("Object Not Found"));
    }

    public T createData(T payload){
        return genericRepository.save(payload);
    }

    public void updateData(T payload, L id){
        T object = getDataById(id);
        BeanUtils.copyProperties(payload, object, "id");
        genericRepository.saveAndFlush(object);
    }

    public void deleteDataLogically(L id){
        T object = getDataById(id);
        object.setDeleted(true);
        genericRepository.saveAndFlush(object);
    }

    public void deleteDataPhysically(L id){
    T object = getDataById(id);
    genericRepository.delete(object);
    }
}
