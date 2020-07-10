package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Productoadiciones;
import co.com.myproject.delivereatspersistence.entity.ProductoadicionesPK;

public interface IProductosAdicionesRepo extends JpaRepository<Productoadiciones, ProductoadicionesPK>{

}
