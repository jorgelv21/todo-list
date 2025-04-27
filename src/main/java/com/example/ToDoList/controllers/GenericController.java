package com.example.ToDoList.controllers;

import com.example.ToDoList.model.GenericClass;
import com.example.ToDoList.repositories.GenericRepository;
import com.example.ToDoList.services.GenericService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class GenericController<T extends GenericClass, L extends Number> extends GenericService<T, L> {
    /**
     * Generic Service Constructor
     *
     * @param genericRepository - Generic Repository
     */
    protected GenericController(GenericRepository<T, L> genericRepository) {
        super(genericRepository);
    }

    @GetMapping
    @PreAuthorize("Authorization::hasRole('USER')")
    public ResponseEntity<List<T>> findAll(){
        return new ResponseEntity<>(getAllData(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    @PreAuthorize("Authorization::hasRole('USER')")
    public ResponseEntity<T> findById(@PathVariable("id") L id){
        return new ResponseEntity<>(getDataById(id), HttpStatus.OK);
    }

    @PostMapping
    @PreAuthorize("Authorization::hasRole('USER')")
    public ResponseEntity<T> create(@RequestBody T payload){
        return new ResponseEntity<>(createData(payload), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @PreAuthorize("Authorization::hasRole('USER')")
    public ResponseEntity<Void> update (@PathVariable("id") L id,
                                        @RequestBody Map<String, Object> updates){
        updateData(updates, id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/logically/{id}")
    @PreAuthorize("Authorization::hasRole('USER')")
    public ResponseEntity<Void> deleteLogically (@PathVariable("id") L id){
        this.deleteDataLogically(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/physically/{id}")
    @PreAuthorize("Authorization::hasRole('USER')")
    public ResponseEntity<Void> deletePhysically (@PathVariable("id") L id){
        this.deleteDataPhysically(id);
        return ResponseEntity.ok().build();
    }
}
