package co.com.myproject.delivereatspersistence.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.myproject.delivereatspersistence.dto.GestionPersonaDTO;
import co.com.myproject.delivereatspersistence.service.IProcesoGestionPersonaServ;

@RestController
@RequestMapping("/gestionPersona")
public class ProcesoGestionPersonaCtrl extends AbstractConroller{

	private Logger log = util.getLoggger(ProcesoGestionPersonaCtrl.class.getName()); 
	@Autowired private IProcesoGestionPersonaServ gestionPersona;
	
	@PutMapping("/crear")
	public GestionPersonaDTO crear(@RequestBody GestionPersonaDTO request) throws Exception{
		util.getStringBuilder().append("==> Proceso gestionPersona CREAR\n");
		util.getStringBuilder().append("==> Parametro request recibido:\n");
		util.getStringBuilder().append(request);
		util.pintarLog(log, util.getStringBuilder().toString());
		util.getStringBuilder().setLength(0);
		return gestionPersona.crear(request);
	}
	
}
