package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Mail;

public interface IMailServ {
	
	public Mail getOne(Integer id) throws Exception;
	
	public boolean existsById(Integer id) throws Exception;
	
	public Mail save(Mail entity) throws Exception;
	
	public List<Mail> saveAll(List<Mail> entities) throws Exception;
	
	public Mail update(Mail entity) throws Exception;
	
	public List<Mail> updateAll(List<Mail> entities) throws Exception;
	
	public void delete(Mail entity) throws Exception;
	
	public void deleteAll(List<Mail> entities) throws Exception;
}
