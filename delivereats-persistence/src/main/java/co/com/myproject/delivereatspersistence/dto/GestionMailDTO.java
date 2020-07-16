package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.EstadomailVO;
import co.com.myproject.delivereatspersistence.vo.MailVO;
import co.com.myproject.delivereatspersistence.vo.TipomailVO;

public class GestionMailDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private MailVO mail;
	private TipomailVO tipoMail;
	private EstadomailVO estadoMail;
	
	public MailVO getMail() {
		return mail;
	}
	public void setMail(MailVO mail) {
		this.mail = mail;
	}
	public TipomailVO getTipoMail() {
		return tipoMail;
	}
	public void setTipoMail(TipomailVO tipoMail) {
		this.tipoMail = tipoMail;
	}
	public EstadomailVO getEstadoMail() {
		return estadoMail;
	}
	public void setEstadoMail(EstadomailVO estadoMail) {
		this.estadoMail = estadoMail;
	}
	
	
}
