package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Turno;

public interface ITurnoRepo extends JpaRepository<Turno, Integer>{

}
