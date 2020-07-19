package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;

import co.com.myproject.delivereatspersistence.dto.GestionPagoDTO;
import co.com.myproject.delivereatspersistence.entity.Estadopago;
import co.com.myproject.delivereatspersistence.entity.Pago;
import co.com.myproject.delivereatspersistence.entity.Pagoestadotipo;
import co.com.myproject.delivereatspersistence.entity.PagoestadotipoPK;
import co.com.myproject.delivereatspersistence.entity.Tipopago;
import co.com.myproject.delivereatspersistence.vo.EstadopagoVO;
import co.com.myproject.delivereatspersistence.vo.PagoVO;
import co.com.myproject.delivereatspersistence.vo.TipopagoVO;

public class ProcesoGestionPagoServImpl extends AbstractProcesoServ implements IProcesoGestionPagoServ{

	@Override
	public GestionPagoDTO crear(GestionPagoDTO request) throws Exception {
		Logger log =util.getLoggger(ProcesoGestionPagoServImpl.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Pago\n");
		util.getStringBuilder().append(request.getPago()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		
		PagoVO pagoVO = request.getPago();
		Pago pago = new Pago();
		pago.setFecha(pagoVO.getFecha());
		pago.setValor(pagoVO.getValor());
		pago=pagoServ.save(pago);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Tipo Pago\n");
		util.getStringBuilder().append(request.getTipoPago());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		TipopagoVO tipoPagoVO = request.getTipoPago();
		Tipopago tipoPago = new Tipopago();
		tipoPago.setNombre(tipoPagoVO.getNombre());
		tipoPago.setObservacion(tipoPagoVO.getObservacion());
		tipoPago=tipoPagoServ.save(tipoPago);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Estado Pago\n");
		util.getStringBuilder().append(request.getEstadoPago());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		EstadopagoVO estadoPagoVO = request.getEstadoPago();
		Estadopago estadoPago = new Estadopago();
		estadoPago.setCodigo(estadoPagoVO.getCodigo());
		estadoPago.setNombre(estadoPagoVO.getNombre());
		estadoPago=estadoPagoServ.save(estadoPago);
		
		Pagoestadotipo pagoEstadoTipo = new Pagoestadotipo();
		PagoestadotipoPK pagoestadotipoPK = new PagoestadotipoPK();
		pagoestadotipoPK.setIdestadopago(estadoPago.getIdestadopago());
		pagoestadotipoPK.setIdpago(pago.getIdpago());
		pagoestadotipoPK.setIdtipopago(tipoPago.getIdtipopago());
		pagoEstadoTipo.setPagoestadotipoPK(pagoestadotipoPK);
		
		GestionPagoDTO response = request;
		response.getEstadoPago().setIdestadopago(estadoPago.getIdestadopago());;
		response.getPago().setIdpago(pago.getIdpago());;
		response.getTipoPago().setIdtipopago(tipoPago.getIdtipopago());;
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin gestion Pago CREAR Parametro response\n");
		util.getStringBuilder().append("==> Pago Response\n");
		util.getStringBuilder().append(response.getPago());
		util.getStringBuilder().append("\n==> Tipo Telefono Response\n");
		util.getStringBuilder().append(response.getTipoPago());
		util.getStringBuilder().append("\n==> Estado Telefono Response\n");
		util.getStringBuilder().append(response.getEstadoPago());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		return response;
	}

	
}
