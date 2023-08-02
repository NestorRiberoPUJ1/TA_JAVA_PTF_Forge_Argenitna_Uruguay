package com.ayudantia.modelos.services;

import com.ayudantia.modelos.models.User;
import com.ayudantia.modelos.repositories.UserRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User crearUser(User b) {
    return userRepository.save(b);
  }

  public List<User> obtenerUsers() {
    return userRepository.findAll();
  }

  public User buscarUser(Long id) {
    Optional<User> optionalUser = userRepository.findById(id);
    if (optionalUser.isPresent()) {
      return optionalUser.get();
    } else {
      return null;
    }
  }
}
