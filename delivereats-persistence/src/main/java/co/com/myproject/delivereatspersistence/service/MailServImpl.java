package co.com.myproject.delivereatspersistence.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.myproject.delivereatspersistence.entity.Mail;
import co.com.myproject.delivereatspersistence.repository.IMailRepo;

@Service
public class MailServImpl implements IMailServ{
	@Autowired
	private IMailRepo repo;
	
	public List<Mail> findAll() {
		return repo.findAll();
	}
	
	public Optional<Mail> findById(Integer id) {
		return repo.findById(id);
	}
	
	public Mail getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public Mail save(Mail entity) {
		return repo.save(entity);
	}
	
	public List<Mail> saveAll(List<Mail> entities) {
		return repo.saveAll(entities);
	}
	
	public Mail update(Mail entity) {
		return repo.save(entity);
	}
	
	public List<Mail> updateAll(List<Mail> entities) {
		return repo.saveAll(entities);
	}
	public void delete(Mail entity) {
		repo.delete(entity);
	}
	
	public void deleteAll(List<Mail> entities) {
		repo.deleteAll(entities);
	}
}
