package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Pedidotipoestado;
import co.com.myproject.delivereatsrepo.entity.PedidotipoestadoPK;

public interface IPedidoTipoEstadoRepo extends JpaRepository<Pedidotipoestado, PedidotipoestadoPK>{

}
