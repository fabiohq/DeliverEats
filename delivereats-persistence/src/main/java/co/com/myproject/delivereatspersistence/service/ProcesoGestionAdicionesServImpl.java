package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;

import co.com.myproject.delivereatspersistence.dto.GestionAdicionesDTO;
import co.com.myproject.delivereatspersistence.entity.Adiciones;
import co.com.myproject.delivereatspersistence.entity.Productoadiciones;
import co.com.myproject.delivereatspersistence.entity.ProductoadicionesPK;
import co.com.myproject.delivereatspersistence.vo.AdicionesVO;

public class ProcesoGestionAdicionesServImpl extends AbstractProcesoServ implements IProcesoGestionAdicionesServ{

	@Override
	public GestionAdicionesDTO crear(GestionAdicionesDTO request) throws Exception {
		
		Logger log =util.getLoggger(ProcesoGestionAdicionesServImpl.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Adiciones\n");
		util.getStringBuilder().append(request.getAdiciones()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		
		AdicionesVO adicionesVO = request.getAdiciones();
		Adiciones adiciones = new Adiciones();
		adiciones.setAdiciones(adicionesVO.getAdiciones());
		adiciones.setDescripcion(adicionesVO.getDescripcion());
		adiciones.setIdestadoproducto(adicionesVO.getIdestadoproducto());
		adiciones.setIdproducto(adicionesVO.getIdproducto());
		adiciones.setIdtipoproducto(adicionesVO.getIdtipoproducto());
		adiciones.setNombre(adicionesVO.getNombre());
		adiciones = adicionesServ.save(adiciones);
		
		Productoadiciones productoAdiciones = new Productoadiciones();
		ProductoadicionesPK productoadicionesPK = new ProductoadicionesPK();
		productoadicionesPK.setIdadiciones(adiciones.getIdadiciones());
		//productoadicionesPK.setIdproductoadiciones(idproductoadiciones);
		productoAdiciones.setProductoadicionesPK(productoadicionesPK);
		
		GestionAdicionesDTO response = request;
		response.getAdiciones().setIdadiciones(adiciones.getIdadiciones());
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin gestion Adiciones CREAR Parametro response\n");
		util.getStringBuilder().append("==> Adiciones Response\n");
		util.getStringBuilder().append(response.getAdiciones());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		return response;
	}

}
