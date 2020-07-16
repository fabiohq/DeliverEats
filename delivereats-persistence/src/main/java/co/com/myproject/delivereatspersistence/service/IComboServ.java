package co.com.myproject.delivereatspersistence.service;

import java.util.List;

import co.com.myproject.delivereatspersistence.entity.Combo;

public interface IComboServ {

	public List<Combo> saveAll(List<Combo> entities) throws Exception;
	
	public Combo update(Combo entity) throws Exception;
	
	public List<Combo> updateAll(List<Combo> entities) throws Exception;
	
	public void delete(Combo entity) throws Exception;
	
	public void deleteAll(List<Combo> entities) throws Exception;
}
