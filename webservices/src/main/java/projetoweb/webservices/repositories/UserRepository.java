package projetoweb.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetoweb.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
