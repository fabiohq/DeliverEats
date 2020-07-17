package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.EstadoturnoVO;
import co.com.myproject.delivereatspersistence.vo.TurnoVO;

public class GestionTurnoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private TurnoVO turno;
	private EstadoturnoVO estadoTurno;
	
	public TurnoVO getTurno() {
		return turno;
	}
	public void setTurno(TurnoVO turno) {
		this.turno = turno;
	}
	public EstadoturnoVO getEstadoTurno() {
		return estadoTurno;
	}
	public void setEstadoTurno(EstadoturnoVO estadoTurno) {
		this.estadoTurno = estadoTurno;
	}	
}
