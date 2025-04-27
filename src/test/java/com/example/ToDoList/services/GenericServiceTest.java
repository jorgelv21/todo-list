package com.example.ToDoList.services;

import com.example.ToDoList.model.GenericClass;
import com.example.ToDoList.repositories.GenericRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class GenericServiceTest <T extends GenericClass, L extends Number> {


    @Mock
    private GenericService<T, Long> genericService;

    @Mock
    GenericRepository<T, Long> genericRepository;

    @Captor
    private ArgumentCaptor<T> captor;


    private GenericClass genericClass;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
        genericClass = new GenericClass(1L, false, new Date(), null);
    }


    @Test
    void getAllData() {

        List<T> arraylist = new ArrayList<>();

        when(genericService.getAllData()).thenReturn(arraylist);

        assertNotNull(genericService.getAllData());
        assertTrue(genericService.getAllData().isEmpty());

    }


    @SuppressWarnings(value = "unchecked")
    @Test
    void getDataById() {
        when(genericService.getDataById(1L)).thenReturn((T) genericClass);

        GenericClass result = genericService.getDataById(1L);
        assertNotNull(result);
        assertEquals(1L, result.getId());
    }

    @Test
    void createData() {
    }

    @Test
    void updateData() {
        Long id = 1L;
        GenericClass payload = new GenericClass(id, true, new Date(), null);

        Map<String, Object> update = new HashMap<>();

        when(genericService.getDataById(id)).thenReturn((T) genericClass);

        genericService.updateData(update, id);

        verify(genericRepository).saveAndFlush(captor.capture());
        GenericClass updated = captor.getValue();

        assertTrue(updated.isDeleted());
    }

    @Test
    void deleteDataLogically() {
        Long id = 1L;
        GenericClass entity = new GenericClass(id, false, new Date(), null);

        when(genericService.getDataById(id)).thenReturn((T) entity);

        genericService.deleteDataLogically(id);

        verify(genericRepository).saveAndFlush(captor.capture());
        GenericClass deletedObject = captor.getValue();

        assertTrue(deletedObject.isDeleted());
    }

    @Test
    void deleteDataPhysically() {
        Long id = 1L;

        // Chama o método
        genericService.deleteDataPhysically(id);

        // Verifica se o método deleteById foi chamado com o ID correto
        verify(genericRepository, times(1)).deleteById(id);
    }
}