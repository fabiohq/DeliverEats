package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;

import co.com.myproject.delivereatspersistence.dto.GestionCredencialesDTO;
import co.com.myproject.delivereatspersistence.entity.Credenciales;
import co.com.myproject.delivereatspersistence.entity.Credencialesestadotipo;
import co.com.myproject.delivereatspersistence.entity.CredencialesestadotipoPK;
import co.com.myproject.delivereatspersistence.entity.Estadocredenciales;
import co.com.myproject.delivereatspersistence.entity.Tipocredenciales;
import co.com.myproject.delivereatspersistence.vo.CredencialesVO;
import co.com.myproject.delivereatspersistence.vo.EstadocredencialesVO;
import co.com.myproject.delivereatspersistence.vo.TipocredencialesVO;

public class ProcesoGestionCredencialesServImpl extends AbstractProcesoServ implements IProcesoGestionCredencialesServ{

	@Override
	public GestionCredencialesDTO crear(GestionCredencialesDTO request) throws Exception {
		
		Logger log =util.getLoggger(ProcesoGestionCredencialesServImpl.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Credenciales\n");
		util.getStringBuilder().append(request.getCredenciales()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		
		CredencialesVO credencialesVO = request.getCredenciales();
		Credenciales credenciales = new Credenciales();
		credenciales.setClave(credencialesVO.getClave());
		credenciales.setFechafin(credencialesVO.getFechafin());
		credenciales.setFechaini(credencialesVO.getFechaini());
		credenciales.setUsuario(credencialesVO.getUsuario());
		credenciales=credencialesServ.save(credenciales);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Tipo Credenciales\n");
		util.getStringBuilder().append(request.getTipoCredenciales());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		TipocredencialesVO tipoCredencialesVO = request.getTipoCredenciales();
		Tipocredenciales tipoCredenciales = new Tipocredenciales();
		tipoCredenciales.setCodigo(tipoCredencialesVO.getCodigo());
		tipoCredenciales.setNombre(tipoCredencialesVO.getNombre());
		tipoCredenciales=tipoCredencialesServ.save(tipoCredenciales);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Estado Credenciales\n");
		util.getStringBuilder().append(request.getEstadoCredenciales());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		EstadocredencialesVO estadoCredencialesVO = request.getEstadoCredenciales();
		Estadocredenciales estadocredenciales = new Estadocredenciales();
		estadocredenciales.setCodigo(estadoCredencialesVO.getCodigo());
		estadocredenciales.setNombre(estadoCredencialesVO.getNombre());
		estadocredenciales=estadoCredencialesServ.save(estadocredenciales);
		
		Credencialesestadotipo credencialesEstadoTipo = new Credencialesestadotipo();
		CredencialesestadotipoPK credencialesestadotipoPK = new CredencialesestadotipoPK();
		credencialesestadotipoPK.setIdcredenciales(credenciales.getIdcredenciales());
		credencialesestadotipoPK.setIdestadocredenciales(estadocredenciales.getIdestadocredenciales());
		credencialesestadotipoPK.setIdtipocredenciales(tipoCredenciales.getIdtipocredenciales());
		credencialesEstadoTipo.setCredencialesestadotipoPK(credencialesestadotipoPK);
		credencialesEstadoTipo=credencialesEstadoTipoServ.save(credencialesEstadoTipo);
		
		GestionCredencialesDTO response = request;
		response.getCredenciales().setIdcredenciales(credenciales.getIdcredenciales());
		response.getEstadoCredenciales().setIdestadocredenciales(estadocredenciales.getIdestadocredenciales());
		response.getTipoCredenciales().setIdtipocredenciales(tipoCredenciales.getIdtipocredenciales());
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin gestion Credenciales CREAR Parametro response\n");
		util.getStringBuilder().append("==> Credenciales Response\n");
		util.getStringBuilder().append(response.getCredenciales());
		util.getStringBuilder().append("\n==> Tipo Credenciales Response\n");
		util.getStringBuilder().append(response.getTipoCredenciales());
		util.getStringBuilder().append("\n==> Estado Credenciales Response\n");
		util.getStringBuilder().append(response.getEstadoCredenciales());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		return response;
	}

}
