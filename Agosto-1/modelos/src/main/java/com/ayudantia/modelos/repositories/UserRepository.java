package com.ayudantia.modelos.repositories;

import com.ayudantia.modelos.models.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  <S extends User> S save(S entity);

  List<User> findAll();

  Optional<User> findById(Long id);
}
