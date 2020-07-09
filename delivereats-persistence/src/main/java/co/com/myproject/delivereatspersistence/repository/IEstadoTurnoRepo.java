package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Estadoturno;

public interface IEstadoTurnoRepo extends JpaRepository<Estadoturno, Integer>{

}
