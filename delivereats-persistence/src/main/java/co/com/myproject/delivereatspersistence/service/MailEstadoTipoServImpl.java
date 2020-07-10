package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Mailestadotipo;
import co.com.myproject.delivereatspersistence.entity.MailestadotipoPK;
import co.com.myproject.delivereatspersistence.repository.IMailEstadoTipoRepo;

@Service
public class MailEstadoTipoServImpl implements IMailEstadoTipoServ{
	@Autowired
	private IMailEstadoTipoRepo repo;
	
	public List<Mailestadotipo> findAll() {
		return repo.findAll();
	}
	
	public Optional<Mailestadotipo> findById(MailestadotipoPK id) {
		return repo.findById(id);
	}
	
	public Mailestadotipo getOne(MailestadotipoPK id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(MailestadotipoPK id) {
		return repo.existsById(id);
	}
	
	public Mailestadotipo save(Mailestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Mailestadotipo> saveAll(List<Mailestadotipo> entities) {
		return repo.saveAll(entities);
	}
	
	public Mailestadotipo update(Mailestadotipo entity) {
		return repo.save(entity);
	}
	
	public List<Mailestadotipo> updateAll(List<Mailestadotipo> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Mailestadotipo entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Mailestadotipo> entities) {
		repo.deleteAll(entities);
	}
}
