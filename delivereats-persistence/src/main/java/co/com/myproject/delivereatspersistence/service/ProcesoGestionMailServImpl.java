package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;

import co.com.myproject.delivereatspersistence.dto.GestionMailDTO;
import co.com.myproject.delivereatspersistence.entity.Estadomail;
import co.com.myproject.delivereatspersistence.entity.Mail;
import co.com.myproject.delivereatspersistence.entity.Mailestadotipo;
import co.com.myproject.delivereatspersistence.entity.MailestadotipoPK;
import co.com.myproject.delivereatspersistence.entity.Tipomail;
import co.com.myproject.delivereatspersistence.vo.EstadomailVO;
import co.com.myproject.delivereatspersistence.vo.MailVO;
import co.com.myproject.delivereatspersistence.vo.TipomailVO;

public class ProcesoGestionMailServImpl extends AbstractProcesoServ implements IProcesoGestionMailServ{

	@Override
	public GestionMailDTO crear(GestionMailDTO request) throws Exception {
		
		Logger log =util.getLoggger(ProcesoGestionMailServImpl	.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Mail\n");
		util.getStringBuilder().append(request.getMail()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		
		MailVO mailVO= request.getMail();
		Mail mail = new Mail();
		mail.setFechafin(mailVO.getFechafin());
		mail.setFechaini(mailVO.getFechaini());
		mail.setMail(mailVO.getMail());
		mail.setObservaciones(mailVO.getObservaciones());
		mail = mailServ.save(mail);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Tipo Mail\n");
		util.getStringBuilder().append(request.getTipoMail());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		TipomailVO tipoMailVO = request.getTipoMail();
		Tipomail tipoMail = new Tipomail();
		tipoMail.setNombre(tipoMailVO.getNombre());
		tipoMail.setObservacion(tipoMailVO.getObservacion());
		tipoMail = tipoMailServ.save(tipoMail);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Estado Mail\n");
		util.getStringBuilder().append(request.getEstadoMail());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		EstadomailVO estadoMailVO = request.getEstadoMail();
		Estadomail estadoMail = new Estadomail();
		estadoMail.setCodigo(estadoMailVO.getCodigo());
		estadoMail.setNombre(estadoMailVO.getNombre());
		estadoMail = estadoMailServ.save(estadoMail);
		
		Mailestadotipo mailEstadoTipo = new Mailestadotipo();
		MailestadotipoPK mailEstadotipoPK = new MailestadotipoPK();
		mailEstadotipoPK.setIdestadomail(estadoMail.getIdestadomail());
		mailEstadotipoPK.setIdmail(mail.getIdmail());
		mailEstadotipoPK.setIdtipomail(tipoMail.getIdtipomail());		
		mailEstadoTipo.setMailestadotipoPK(mailEstadotipoPK);
		mailEstadoTipoServ.save(mailEstadoTipo);
		
		GestionMailDTO response = request;
		response.getEstadoMail().setIdestadomail(estadoMail.getIdestadomail());;
		response.getMail().setIdmail(mail.getIdmail());;
		response.getTipoMail().setIdtipomail(tipoMail.getIdtipomail());;
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin gestion Mail CREAR Parametro response\n");
		util.getStringBuilder().append("==> Mail Response\n");
		util.getStringBuilder().append(response.getMail());
		util.getStringBuilder().append("\n==> Tipo Mail Response\n");
		util.getStringBuilder().append(response.getTipoMail());
		util.getStringBuilder().append("\n==> Estado Mail Response\n");
		util.getStringBuilder().append(response.getEstadoMail());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		return response;
	}

}
