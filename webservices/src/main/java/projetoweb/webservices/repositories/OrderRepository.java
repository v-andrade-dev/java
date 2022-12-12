package projetoweb.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetoweb.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
