package projetoweb.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetoweb.webservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
