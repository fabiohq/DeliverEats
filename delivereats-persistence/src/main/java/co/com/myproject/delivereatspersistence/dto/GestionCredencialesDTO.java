package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.CredencialesVO;
import co.com.myproject.delivereatspersistence.vo.EstadocredencialesVO;
import co.com.myproject.delivereatspersistence.vo.TipocredencialesVO;

public class GestionCredencialesDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private CredencialesVO credenciales;
	private TipocredencialesVO tipoCredenciales;
	private EstadocredencialesVO estadoCredenciales;
	
	public CredencialesVO getCredenciales() {
		return credenciales;
	}
	public void setCredenciales(CredencialesVO credenciales) {
		this.credenciales = credenciales;
	}
	public TipocredencialesVO getTipoCredenciales() {
		return tipoCredenciales;
	}
	public void setTipoCredenciales(TipocredencialesVO tipoCredenciales) {
		this.tipoCredenciales = tipoCredenciales;
	}
	public EstadocredencialesVO getEstadoCredenciales() {
		return estadoCredenciales;
	}
	public void setEstadoCredenciales(EstadocredencialesVO estadoCredenciales) {
		this.estadoCredenciales = estadoCredenciales;
	}
}
