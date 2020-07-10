package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Pedidotipoestado;
import co.com.myproject.delivereatspersistence.entity.PedidotipoestadoPK;

public interface IPedidoTipoEstadoRepo extends JpaRepository<Pedidotipoestado, PedidotipoestadoPK>{

}
