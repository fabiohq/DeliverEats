package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Estadopedido;

public interface IEstadoPedidoRepo extends JpaRepository<Estadopedido, Integer>{

}
