package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;

import co.com.myproject.delivereatspersistence.dto.GestionEstablecimientoDTO;
import co.com.myproject.delivereatspersistence.entity.Especialidad;
import co.com.myproject.delivereatspersistence.entity.Establecimiento;
import co.com.myproject.delivereatspersistence.entity.Establecimientoestadotipo;
import co.com.myproject.delivereatspersistence.entity.EstablecimientoestadotipoPK;
import co.com.myproject.delivereatspersistence.entity.Estadoestablecimiento;
import co.com.myproject.delivereatspersistence.entity.Tipoestablecimiento;
import co.com.myproject.delivereatspersistence.vo.EspecialidadVO;
import co.com.myproject.delivereatspersistence.vo.EstablecimientoVO;
import co.com.myproject.delivereatspersistence.vo.EstadoestablecimientoVO;
import co.com.myproject.delivereatspersistence.vo.TipoestablecimientoVO;

public class ProcesoGestionEstablecimientoServImpl extends AbstractProcesoServ implements IProcesoGestionEstablecimientoServ{

	@Override
	public GestionEstablecimientoDTO crear(GestionEstablecimientoDTO request) throws Exception {
		
		Logger log =util.getLoggger(ProcesoGestionEstablecimientoServImpl.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Establecimiento\n");
		util.getStringBuilder().append(request.getEstablecimiento()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		
		EstablecimientoVO establecimientoVO = request.getEstablecimiento();
		Establecimiento establecimiento = new Establecimiento();
		establecimiento.setFechafin(establecimientoVO.getFechafin());
		establecimiento.setFechaini(establecimientoVO.getFechaini());
		establecimiento.setNombre(establecimientoVO.getNombre());
		establecimiento.setObservacion(establecimientoVO.getObservacion());
		establecimiento =establecimientoServ.save(establecimiento);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Tipo Establecimiento\n");
		util.getStringBuilder().append(request.getTipoEstablecimiento());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		TipoestablecimientoVO tipoEstablecimientoVO = request.getTipoEstablecimiento();
		Tipoestablecimiento tipoEstablecimiento = new Tipoestablecimiento();
		tipoEstablecimiento.setNombre(tipoEstablecimientoVO.getNombre());
		tipoEstablecimiento.setObservacion(tipoEstablecimientoVO.getObservacion());
		tipoEstablecimiento=tipoEstablecimientoServ.save(tipoEstablecimiento);
				
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Estado Establecimiento\n");
		util.getStringBuilder().append(request.getEstadoEstablecimiento());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		EstadoestablecimientoVO estadoEstablecimientoVO = request.getEstadoEstablecimiento();
		Estadoestablecimiento estadoEstablecimiento = new Estadoestablecimiento();
		estadoEstablecimiento.setCodigo(estadoEstablecimientoVO.getCodigo());
		estadoEstablecimiento.setNombre(estadoEstablecimientoVO.getNombre());
		estadoEstablecimiento=estadoEstablecimientoServ.save(estadoEstablecimiento);
				
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Especialidad Establecimiento\n");
		util.getStringBuilder().append(request.getEspecialidad());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		EspecialidadVO especialidadVO = request.getEspecialidad();
		Especialidad especialidad = new Especialidad();
		especialidad.setNombre(especialidadVO.getNombre());
		especialidad.setObservacion(especialidadVO.getObservacion());
		especialidad = especialidadServ.save(especialidad);
		
		Establecimientoestadotipo establecimientoestadotipo = new Establecimientoestadotipo();
		EstablecimientoestadotipoPK establecimientoestadotipoPK = new EstablecimientoestadotipoPK();
		establecimientoestadotipoPK.setIdespecialidad(especialidad.getIdespecialidad());
		establecimientoestadotipoPK.setIdestablecimiento(establecimiento.getIdestablecimiento());
		establecimientoestadotipoPK.setIdestadoestablecimiento(estadoEstablecimiento.getIdestadoestablecimiento());
		establecimientoestadotipoPK.setIdtipoestadoestablecimiento(tipoEstablecimiento.getIdtipoestadoestablecimiento());
		establecimientoestadotipo.setEstablecimientoestadotipoPK(establecimientoestadotipoPK);
		establecimientoestadotipo = establecimientoEstadoTipoServ.save(establecimientoestadotipo);
		
		GestionEstablecimientoDTO response = request;
		response.getEspecialidad().setIdespecialidad(especialidad.getIdespecialidad());
		response.getEstablecimiento().setIdestablecimiento(establecimiento.getIdestablecimiento());
		response.getEstadoEstablecimiento().setIdestadoestablecimiento(estadoEstablecimiento.getIdestadoestablecimiento());
		response.getTipoEstablecimiento().setIdtipoestadoestablecimiento(tipoEstablecimiento.getIdtipoestadoestablecimiento());
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin gestion Establecimiento CREAR Parametro response\n");
		util.getStringBuilder().append("==> Establecimiento\n");
		util.getStringBuilder().append(response.getEstablecimiento());
		util.getStringBuilder().append("\n==> Tipo Establecimiento Response\n");
		util.getStringBuilder().append(response.getTipoEstablecimiento());
		util.getStringBuilder().append("\n==> Estado Establecimiento Response\n");
		util.getStringBuilder().append(response.getEstadoEstablecimiento());
		util.getStringBuilder().append("\n==> Especialidad Establecimiento Response\n");
		util.getStringBuilder().append(response.getEspecialidad());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		return response;
	}

}
