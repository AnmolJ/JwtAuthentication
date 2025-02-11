package com.jwt.Example.JwtExample33.service;

import com.jwt.Example.JwtExample33.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();
    public  UserService()
    {
        store.add(new User(UUID.randomUUID().toString(),"Anmol","anmol@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Anmol2","anmol@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Anmol3","anmol@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Anmol4","anmol@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Anmol5","anmol@gmail.com"));


    }
    public List<User> getUser()
    {
        return this.store;
    }


}
