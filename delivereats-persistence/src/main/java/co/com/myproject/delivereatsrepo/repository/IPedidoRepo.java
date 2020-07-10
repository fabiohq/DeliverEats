package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Pedido;

public interface IPedidoRepo extends JpaRepository<Pedido, Integer>{

}
