package co.com.myproject.delivereatspersistence.service;

import org.springframework.beans.factory.annotation.Autowired;

import co.com.myproject.delivereatspersistence.helpers.AbstractUtil;

public abstract class AbstractProcesoServ extends AbstractUtil{

	@Autowired protected IPersonaServ personaServ;
	@Autowired protected ITipoPersonaServ tipoPersonaServ;
	@Autowired protected IEstadoPersonaServ estadoPersonaServ;
	@Autowired protected IPersonaEstadoTipoServ personaEstadoTipoServ;
	
	@Autowired protected IDocumentoServ documentoServ;
	@Autowired protected ITipoDocumentoServ tipoDocumentoServ;
	@Autowired protected IEstadoDocumentoServ estadoDocumentoServ;
	@Autowired protected IDocumentoEstadoTipoServ documentoEstadoTipoServ;
	
	@Autowired protected ITelefonoServ telefonoServ;
	@Autowired protected ITipoTelefonoServ tipoTelefonoServ;
	@Autowired protected IEstadoTelefonoServ estadoTelefonoServ;
	@Autowired protected ITelefonoEstadoTipoServ telefonoEstadoTipoServ;
	
	@Autowired protected IMailServ mailServ;
	@Autowired protected ITipoMailServ tipoMailServ;
	@Autowired protected IEstadoMailServ estadoMailServ;
	@Autowired protected IMailEstadoTipoServ mailEstadoTipoServ;
	
	@Autowired protected IRolServ rolServ;
	@Autowired protected ITipoRolServ tipoRolServ;
	@Autowired protected IEstadoRolServ estadoRolServ;
	@Autowired protected IRolEstadoTipoServ rolEstadoTipoServ;
	
}
