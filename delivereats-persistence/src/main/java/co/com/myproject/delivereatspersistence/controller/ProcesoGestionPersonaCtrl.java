package co.com.myproject.delivereatspersistence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.myproject.delivereatspersistence.dto.GestionPersonaDTO;
import co.com.myproject.delivereatspersistence.service.IProcesoGestionPersonaServ;

@RestController
@RequestMapping("/gestionPersona")
public class ProcesoGestionPersonaCtrl {

	@Autowired private IProcesoGestionPersonaServ gestionPersona;
	
	@PutMapping("/crear")
	public GestionPersonaDTO crear(@RequestBody GestionPersonaDTO request) throws Exception{
		return gestionPersona.crear(request);
	}
	
}
