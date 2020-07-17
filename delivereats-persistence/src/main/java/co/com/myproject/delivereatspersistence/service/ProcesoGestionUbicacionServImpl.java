package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;

import co.com.myproject.delivereatspersistence.dto.GestionUbicacionDTO;
import co.com.myproject.delivereatspersistence.entity.Estadoubicacion;
import co.com.myproject.delivereatspersistence.entity.Tipoubicacion;
import co.com.myproject.delivereatspersistence.entity.Ubicacion;
import co.com.myproject.delivereatspersistence.entity.Ubicacionestadotipo;
import co.com.myproject.delivereatspersistence.entity.UbicacionestadotipoPK;
import co.com.myproject.delivereatspersistence.vo.EstadoubicacionVO;
import co.com.myproject.delivereatspersistence.vo.TipoubicacionVO;
import co.com.myproject.delivereatspersistence.vo.UbicacionVO;

public class ProcesoGestionUbicacionServImpl extends AbstractProcesoServ implements IProcesoGestionUbicacionServ{

	@Override
	public GestionUbicacionDTO crear(GestionUbicacionDTO request) throws Exception {
		
		Logger log =util.getLoggger(ProcesoGestionUbicacionServImpl.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Ubicacion\n");
		util.getStringBuilder().append(request.getUbicacion()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		
		UbicacionVO ubicaconVO = request.getUbicacion();
		Ubicacion ubicacion = new Ubicacion();
		ubicacion.setCodpostal(ubicaconVO.getCodpostal());
		ubicacion.setDescripcion(ubicaconVO.getDescripcion());
		ubicacion.setLatitud(ubicaconVO.getLatitud());
		ubicacion.setLongitud(ubicaconVO.getLongitud());
		ubicacion.setNombre(ubicaconVO.getNombre());
		ubicacion=ubicacionServ.save(ubicacion);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Tipo Ubicacion\n");
		util.getStringBuilder().append(request.getTipoUbicacion());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		TipoubicacionVO tipoUbicacionVO = request.getTipoUbicacion();
		Tipoubicacion tipoUbicacion = new Tipoubicacion();
		tipoUbicacion.setNombre(tipoUbicacionVO.getNombre());
		tipoUbicacion.setObservaacion(tipoUbicacionVO.getObservaacion());
		tipoUbicacion=tipoUbicacionServ.save(tipoUbicacion);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Estado Ubicacion\n");
		util.getStringBuilder().append(request.getEstadoUbicacion());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		EstadoubicacionVO estadoUbicacionVO = request.getEstadoUbicacion();
		Estadoubicacion estadoUbicacion = new Estadoubicacion();
		estadoUbicacion.setCodigo(estadoUbicacionVO.getCodigo());
		estadoUbicacion.setNombre(estadoUbicacionVO.getNombre());
		estadoUbicacion=estadoUbicacionServ.save(estadoUbicacion);
		
		Ubicacionestadotipo ubicacionEstadoTipo = new Ubicacionestadotipo();
		UbicacionestadotipoPK ubicacionestadotipoPK = new UbicacionestadotipoPK();
		ubicacionestadotipoPK.setIdestadoubicacion(estadoUbicacion.getIdestadoubicacion());
		ubicacionestadotipoPK.setIdtipoubicacion(tipoUbicacion.getIdtipoubicacion());
		ubicacionestadotipoPK.setIdubicacion(ubicacion.getIdubicacion());
		ubicacionEstadoTipo.setUbicacionestadotipoPK(ubicacionestadotipoPK);
		
		GestionUbicacionDTO response = request;
		response.getEstadoUbicacion().setIdestadoubicacion(estadoUbicacion.getIdestadoubicacion());
		response.getEstadoUbicacion().setIdestadoubicacion(tipoUbicacion.getIdtipoubicacion());
		response.getUbicacion().setIdubicacion(ubicacion.getIdubicacion());
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin gestion Ubicacion CREAR Parametro response\n");
		util.getStringBuilder().append("==> Telefono Response\n");
		util.getStringBuilder().append(response.getUbicacion());
		util.getStringBuilder().append("\n==> Tipo Telefono Response\n");
		util.getStringBuilder().append(response.getTipoUbicacion());
		util.getStringBuilder().append("\n==> Estado Telefono Response\n");
		util.getStringBuilder().append(response.getEstadoUbicacion());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		return response;
	}

}
