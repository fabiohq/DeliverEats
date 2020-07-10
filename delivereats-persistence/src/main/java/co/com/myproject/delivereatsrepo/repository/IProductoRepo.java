package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Producto;
import co.com.myproject.delivereatsrepo.entity.ProductoPK;

public interface IProductoRepo extends JpaRepository<Producto, ProductoPK>{

}
