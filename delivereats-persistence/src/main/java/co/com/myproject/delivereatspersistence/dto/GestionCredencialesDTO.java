package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.CredencialesVO;
import co.com.myproject.delivereatspersistence.vo.EstadocredencialesVO;
import co.com.myproject.delivereatspersistence.vo.EstadotransporteVO;
import co.com.myproject.delivereatspersistence.vo.ProcesopersonaVO;
import co.com.myproject.delivereatspersistence.vo.TipocredencialesVO;
import co.com.myproject.delivereatspersistence.vo.TipotransporteVO;
import co.com.myproject.delivereatspersistence.vo.TransporteVO;

public class GestionCredencialesDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private CredencialesVO credenciales;
	private TipocredencialesVO tipoCredenciales;
	private EstadocredencialesVO estadoCredenciales;
	private ProcesopersonaVO procesoPersona;
		
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
	public ProcesopersonaVO getProcesoPersona() {
		return procesoPersona;
	}
	public void setProcesoPersona(ProcesopersonaVO procesoPersona) {
		this.procesoPersona = procesoPersona;
	}	
}