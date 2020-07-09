package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Productocombo;
import co.com.myproject.delivereatspersistence.entity.ProductocomboPK;

public interface IProductoComboRepo extends JpaRepository<Productocombo, ProductocomboPK>{

}
