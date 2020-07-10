package co.com.myproject.delivereatsrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.myproject.delivereatsrepo.entity.Credenciales;

public interface ICredencialesRepo extends JpaRepository<Credenciales, Integer>{

}
