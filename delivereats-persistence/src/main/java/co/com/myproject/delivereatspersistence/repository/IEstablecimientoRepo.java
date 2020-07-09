package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Establecimiento;

public interface IEstablecimientoRepo extends JpaRepository<Establecimiento, Integer>{

}
