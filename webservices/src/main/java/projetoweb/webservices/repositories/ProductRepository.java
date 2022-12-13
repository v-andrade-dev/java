package projetoweb.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetoweb.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
