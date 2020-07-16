package co.com.myproject.delivereatspersistence.dto;

import java.io.Serializable;

import co.com.myproject.delivereatspersistence.vo.DocumentoVO;
import co.com.myproject.delivereatspersistence.vo.EstadodocumentoVO;
import co.com.myproject.delivereatspersistence.vo.TipodocumentoVO;

public class GestionDocumentoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private DocumentoVO documento;
	private TipodocumentoVO tipodocumento;
	private EstadodocumentoVO estadoDocumento;

	public DocumentoVO getDocumento() {
		return documento;
	}
	public void setDocumento(DocumentoVO documento) {
		this.documento = documento;
	}	
	public TipodocumentoVO getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(TipodocumentoVO tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public EstadodocumentoVO getEstadoDocumento() {
		return estadoDocumento;
	}
	public void setEstadoDocumento(EstadodocumentoVO estadoDocumento) {
		this.estadoDocumento = estadoDocumento;
	}
	
	
}
