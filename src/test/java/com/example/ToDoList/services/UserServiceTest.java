package com.example.ToDoList.services;

import com.example.ToDoList.model.User;
import com.example.ToDoList.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@MockitoSettings
class UserServiceTest {

    @Mock
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllData() {
        List<User> user = new ArrayList<>();

        Mockito.when(userService.getAllData()).thenReturn(user);

        List<User> result = userService.getAllData();

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void getDataById() {


        User user = new User("Test", null, "test", "test");
        user.setId(1L);

        Mockito.when(userService.getDataById(user.getId())).thenReturn(user);

        User result = userService.getDataById(user.getId());

        assertNotNull(result);
        assertEquals(1L, result.getId());

    }

    @Test
    void createData() {
        User payload = new User("Test", null, "test", "test");
        User result = userService.createData(payload);

        assertNotNull(result.getName());

    }

    @Test
    void updateData() {
    }

    @Test
    void deleteDataLogically() {
    }

    @Test
    void deleteDataPhysically() {
    }
}