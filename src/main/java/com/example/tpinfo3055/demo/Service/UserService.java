package com.example.tpinfo3055.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tpinfo3055.demo.Repository.UserRepository;
import com.example.tpinfo3055.demo.Model.User;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User saveUser(User user) {
        return repository.save(user);
    }

    public List<User> saveUsers(List<User> users) {
        return repository.saveAll(users);
    }

    public User getUserById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Optional<User> getUserByUserName(String username) {
        return repository.findUserByUsername(username);
    }

    public List<User> getUsers() {
        return repository.findAll();
    }

    public User updateUser(User user) {
        User existingUser = repository.findById(user.getId()).orElse(null);
        existingUser.setNom(user.getNom());
        existingUser.setPrenom(user.getPrenom());
        existingUser.setUsername(user.getUsername());
        existingUser.setVille(user.getVille());
        return repository.save(existingUser);
    }

    public String deleteUser(Long userId) {
        repository.deleteById(userId);
        return "User with id " + userId + " deleted";
    }
}
