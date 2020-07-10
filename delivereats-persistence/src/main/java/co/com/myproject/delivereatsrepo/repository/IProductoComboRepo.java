package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Productocombo;
import co.com.myproject.delivereatsrepo.entity.ProductocomboPK;

public interface IProductoComboRepo extends JpaRepository<Productocombo, ProductocomboPK>{

}
