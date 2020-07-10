package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Producto;
import co.com.myproject.delivereatspersistence.entity.ProductoPK;

public interface IProductoRepo extends JpaRepository<Producto, ProductoPK>{

}
