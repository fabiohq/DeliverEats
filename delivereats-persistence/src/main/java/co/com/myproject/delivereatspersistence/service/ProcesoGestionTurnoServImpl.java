package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;

import co.com.myproject.delivereatspersistence.dto.GestionTurnoDTO;
import co.com.myproject.delivereatspersistence.entity.Estadoturno;
import co.com.myproject.delivereatspersistence.entity.Turno;
import co.com.myproject.delivereatspersistence.entity.Turnoestado;
import co.com.myproject.delivereatspersistence.entity.TurnoestadoPK;
import co.com.myproject.delivereatspersistence.vo.EstadoturnoVO;
import co.com.myproject.delivereatspersistence.vo.TurnoVO;

public class ProcesoGestionTurnoServImpl extends AbstractProcesoServ implements IProcesoGestionTurnoServ {

	@Override
	public GestionTurnoDTO crear(GestionTurnoDTO request) throws Exception {
		
		Logger log =util.getLoggger(ProcesoGestionTurnoServImpl.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Turno\n");
		util.getStringBuilder().append(request.getTurno()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		
		TurnoVO turnoVO = request.getTurno();
		Turno turno = new Turno();
		turno.setFechafin(turnoVO.getFechafin());
		turno.setFechaini(turnoVO.getFechaini());
		turno.setNombre(turnoVO.getNombre());
		turno.setObservaciones(turnoVO.getObservaciones());
		turno = turnoServ.save(turno);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Estado Turno\n");
		util.getStringBuilder().append(request.getEstadoTurno());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		EstadoturnoVO estadoTurnoVO = request.getEstadoTurno();
		Estadoturno estadoTurno = new Estadoturno();
		estadoTurno.setCodigo(estadoTurnoVO.getCodigo());
		estadoTurno.setNombre(estadoTurnoVO.getNombre());
		estadoTurno = estadoTurnoServ.save(estadoTurno);
		
		Turnoestado turnoEstado = new Turnoestado();
		TurnoestadoPK turnoestadoPK = new TurnoestadoPK();
		turnoestadoPK.setIdestadoturno(estadoTurno.getIdestadoturno());
		turnoestadoPK.setIdturno(turno.getIdturno());
		turnoEstado.setTurnoestadoPK(turnoestadoPK);
		turnoEstado = turnoEstadoServ.save(turnoEstado);
		
		GestionTurnoDTO response = request;
		response.getEstadoTurno().setIdestadoturno(estadoTurno.getIdestadoturno());
		response.getTurno().setIdturno(turno.getIdturno());
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin Gestion Turno CREAR Parametro Response\n");
		util.getStringBuilder().append("==> Turno Response\n");
		util.getStringBuilder().append(response.getTurno());
		util.getStringBuilder().append("\n==> Estado Turno Response\n");
		util.getStringBuilder().append(response.getEstadoTurno());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		return response;
	}

}
