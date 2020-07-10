package co.com.myproject.delivereatspersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatspersistence.entity.Combo;

public interface IComboRepo extends JpaRepository<Combo, Integer>{

}
