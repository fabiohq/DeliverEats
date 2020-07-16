package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;

import co.com.myproject.delivereatspersistence.dto.GestionDocumentoDTO;
import co.com.myproject.delivereatspersistence.entity.Documento;
import co.com.myproject.delivereatspersistence.entity.Documentoestadotipo;
import co.com.myproject.delivereatspersistence.entity.DocumentoestadotipoPK;
import co.com.myproject.delivereatspersistence.entity.Estadodocumento;
import co.com.myproject.delivereatspersistence.entity.Tipodocumento;
import co.com.myproject.delivereatspersistence.vo.DocumentoVO;
import co.com.myproject.delivereatspersistence.vo.EstadodocumentoVO;
import co.com.myproject.delivereatspersistence.vo.TipodocumentoVO;

public class ProcesoGestionDocumentoServImpl extends AbstractProcesoServ implements IProcesoGestionDocumentoServ{

	@Override
	public GestionDocumentoDTO crear(GestionDocumentoDTO request) throws Exception {
		
		Logger log =util.getLoggger(ProcesoGestionDocumentoServImpl.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Documento\n");
		util.getStringBuilder().append(request.getDocumento()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		
		DocumentoVO documentoVO = request.getDocumento();
		Documento documento = new Documento();
		documento.setFechafin(documentoVO.getFechafin());
		documento.setFechaini(documentoVO.getFechaini());
		documento.setNombre(documentoVO.getNombre());
		documento.setObservaciones(documentoVO.getObservaciones());
		documento=documentoServ.save(documento);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Tipo Documento\n");
		util.getStringBuilder().append(request.getTipodocumento());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		TipodocumentoVO tipoDocumentoVO = request.getTipodocumento();
		Tipodocumento tipoDocumento = new Tipodocumento();		
		tipoDocumento.setNombre(tipoDocumentoVO.getNombre());
		tipoDocumento.setObservacion(tipoDocumentoVO.getObservacion());
		tipoDocumento=tipoDocumentoServ.save(tipoDocumento);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Estado Documento\n");
		util.getStringBuilder().append(request.getEstadoDocumento());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		EstadodocumentoVO estadoDocumentoVO = request.getEstadoDocumento();
		Estadodocumento estadoDocumento = new Estadodocumento();
		estadoDocumento.setCodigo(estadoDocumentoVO.getCodigo());
		estadoDocumento.setNombre(estadoDocumentoVO.getNombre());
		estadoDocumento = estadoDocumentoServ.save(estadoDocumento);
		
		Documentoestadotipo documentoEstadoTipo = new Documentoestadotipo();
		DocumentoestadotipoPK documentoestadotipoPK = new DocumentoestadotipoPK();
		documentoestadotipoPK.setIddocumento(documento.getIddocumento());
		documentoestadotipoPK.setIdestadodocumento(estadoDocumento.getIdestadodocumento());
		documentoestadotipoPK.setIdtipodocumento(tipoDocumento.getIdtipodocumento());
		documentoEstadoTipo.setDocumentoestadotipoPK(documentoestadotipoPK);
		documentoEstadoTipo= documentoEstadoTipoServ.save(documentoEstadoTipo);
		
		documentoVO.setIddocumento(documento.getIddocumento());
		tipoDocumentoVO.setIdtipodocumento(tipoDocumento.getIdtipodocumento());
		estadoDocumentoVO.setIdestadodocumento(estadoDocumento.getIdestadodocumento());
		GestionDocumentoDTO response = new GestionDocumentoDTO();
		response.setDocumento(documentoVO);
		response.setEstadoDocumento(estadoDocumentoVO);
		response.setTipodocumento(tipoDocumentoVO);
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin gestion Documento CREAR Parametro response\n");
		util.getStringBuilder().append("==> Documento Response\n");
		util.getStringBuilder().append(response.getDocumento());
		util.getStringBuilder().append("\n==> Tipo Documento Response\n");
		util.getStringBuilder().append(response.getTipodocumento());
		util.getStringBuilder().append("\n==> Estado Documento Response\n");
		util.getStringBuilder().append(response.getEstadoDocumento());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		return response;
	}

}
