package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;

import co.com.myproject.delivereatspersistence.dto.GestionFormaPagoDTO;
import co.com.myproject.delivereatspersistence.entity.Estadoformapago;
import co.com.myproject.delivereatspersistence.entity.Formapago;
import co.com.myproject.delivereatspersistence.entity.Formapagoestadotipo;
import co.com.myproject.delivereatspersistence.entity.FormapagoestadotipoPK;
import co.com.myproject.delivereatspersistence.entity.Tipoformapago;
import co.com.myproject.delivereatspersistence.vo.EstadoformapagoVO;
import co.com.myproject.delivereatspersistence.vo.FormapagoVO;
import co.com.myproject.delivereatspersistence.vo.TipoformapagoVO;

public class ProcesoGestionFormaPagoServImpl extends AbstractProcesoServ implements IProcesoGestionFormaPagoServ{

	@Override
	public GestionFormaPagoDTO crear(GestionFormaPagoDTO request) throws Exception {
		
		Logger log =util.getLoggger(ProcesoGestionFormaPagoServImpl.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Forma Pago\n");
		util.getStringBuilder().append(request.getFormaPago()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		
		FormapagoVO formaPagoVO = request.getFormaPago();
		Formapago formapago = new Formapago();
		formapago.setFechafin(formaPagoVO.getFechafin());
		formapago.setFechaini(formaPagoVO.getFechaini());
		formapago.setNombre(formaPagoVO.getNombre());
		formapago.setObservacion(formaPagoVO.getObservacion());
		formapago = formaPagoServ.save(formapago);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Tipo Forma Pago\n");
		util.getStringBuilder().append(request.getTipoFormaPago());
		util.pintarLog(log, util.getStringBuilder().toString());
		TipoformapagoVO tipoformapagoVO = request.getTipoFormaPago();
		Tipoformapago tipoFormaPago = new Tipoformapago();
		tipoFormaPago.setNombre(tipoformapagoVO.getNombre());
		tipoFormaPago.setObservacion(tipoformapagoVO.getObservacion());
		tipoFormaPago = tipoFormaPagoServ.save(tipoFormaPago);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Estado Forma Pago\n");
		util.getStringBuilder().append(request.getEstadoformapago());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		EstadoformapagoVO estadoFormaPagoVO = request.getEstadoformapago();
		Estadoformapago estadoFormapago = new Estadoformapago();
		estadoFormapago.setCodigo(estadoFormaPagoVO.getCodigo());
		estadoFormapago.setNombre(estadoFormaPagoVO.getNombre());
		estadoFormapago = estadoFormaPagoServ.save(estadoFormapago);
		
		Formapagoestadotipo formaPagoEstadoTipo = new Formapagoestadotipo();
		FormapagoestadotipoPK formapagoestadotipoPK = new FormapagoestadotipoPK();
		formapagoestadotipoPK.setIdestadoformapago(estadoFormapago.getIdestadoformapago());
		formapagoestadotipoPK.setIdformapago(formapago.getIdformapago());
		formapagoestadotipoPK.setIdtipoformapago(tipoFormaPago.getIdtipoformapago());
		formaPagoEstadoTipo.setFormapagoestadotipoPK(formapagoestadotipoPK);
		formaPagoEstadoTipo = formaPagoEstadoTipoServ.save(formaPagoEstadoTipo);
		GestionFormaPagoDTO response = request;
		response.getEstadoformapago().setIdestadoformapago(estadoFormapago.getIdestadoformapago());
		response.getFormaPago().setIdformapago(formapago.getIdformapago());
		response.getTipoFormaPago().setIdtipoformapago(tipoFormaPago.getIdtipoformapago());
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin gestion Forma Pago CREAR Parametro response\n");
		util.getStringBuilder().append("==> Forma Pago Response\n");
		util.getStringBuilder().append(response.getFormaPago());
		util.getStringBuilder().append("\n==> Tipo Forma Pago Response\n");
		util.getStringBuilder().append(response.getTipoFormaPago());
		util.getStringBuilder().append("\n==> Estado Forma Pago Response\n");
		util.getStringBuilder().append(response.getEstadoformapago());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		return response;
	}

}
