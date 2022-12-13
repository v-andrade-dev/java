package projetoweb.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetoweb.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
