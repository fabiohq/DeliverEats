package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Productoadiciones;
import co.com.myproject.delivereatsrepo.entity.ProductoadicionesPK;

public interface IProductosAdicionesRepo extends JpaRepository<Productoadiciones, ProductoadicionesPK>{

}
