package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Pedido;

public interface IPedidoRepo extends JpaRepository<Pedido, Integer>{

}
