package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.EspecialidadVO;
import co.com.myproject.delivereatspersistence.vo.EstablecimientoVO;
import co.com.myproject.delivereatspersistence.vo.EstadoestablecimientoVO;
import co.com.myproject.delivereatspersistence.vo.TipoestablecimientoVO;

public class GestionEstablecimientoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private EstablecimientoVO establecimiento;
	private TipoestablecimientoVO tipoEstablecimiento;
	private EstadoestablecimientoVO estadoEstablecimiento;
	private EspecialidadVO especialidad;
	
	public EstablecimientoVO getEstablecimiento() {
		return establecimiento;
	}
	public void setEstablecimiento(EstablecimientoVO establecimiento) {
		this.establecimiento = establecimiento;
	}
	public TipoestablecimientoVO getTipoEstablecimiento() {
		return tipoEstablecimiento;
	}
	public void setTipoEstablecimiento(TipoestablecimientoVO tipoEstablecimiento) {
		this.tipoEstablecimiento = tipoEstablecimiento;
	}
	public EstadoestablecimientoVO getEstadoEstablecimiento() {
		return estadoEstablecimiento;
	}
	public void setEstadoEstablecimiento(EstadoestablecimientoVO estadoEstablecimiento) {
		this.estadoEstablecimiento = estadoEstablecimiento;
	}
	public EspecialidadVO getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(EspecialidadVO especialidad) {
		this.especialidad = especialidad;
	}
	
}
