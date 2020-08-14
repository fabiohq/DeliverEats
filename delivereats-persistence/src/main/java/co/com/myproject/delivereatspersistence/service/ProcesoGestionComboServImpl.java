package co.com.myproject.delivereatspersistence.service;

import org.slf4j.Logger;

import co.com.myproject.delivereatspersistence.dto.GestionComboDTO;
import co.com.myproject.delivereatspersistence.entity.Combo;
import co.com.myproject.delivereatspersistence.entity.Productocombo;
import co.com.myproject.delivereatspersistence.entity.ProductocomboPK;
import co.com.myproject.delivereatspersistence.vo.ComboVO;

public class ProcesoGestionComboServImpl extends AbstractProcesoServ implements IProcesoGestionComboServ{

	@Override
	public GestionComboDTO crear(GestionComboDTO request) throws Exception {
		
		Logger log =util.getLoggger(ProcesoGestionComboServImpl.class.getName()); 
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("\n==> Creando Combo\n");
		util.getStringBuilder().append(request.getCombo()); 
		util.pintarLog(log,util.getStringBuilder().toString());
		
		ComboVO comboVO = request.getCombo();
		Combo combo = new Combo();
		combo.setAdiciones(comboVO.getAdiciones());
		combo.setDescripcion(comboVO.getDescripcion());
		combo.setIdestadoproducto(comboVO.getIdestadoproducto());
		combo.setIdproducto(comboVO.getIdproducto());
		combo.setIdtipoproducto(comboVO.getIdtipoproducto());
		combo.setNombre(comboVO.getNombre());
		combo = comboServ.save(combo);
		
		Productocombo productoCombo = new Productocombo();
		ProductocomboPK productocomboPK = new ProductocomboPK();
		productocomboPK.setIdcombo(combo.getIdcombo());
		productoCombo.setProductocomboPK(productocomboPK);
		
		GestionComboDTO response = request;
		response.getCombo().setIdcombo(combo.getIdcombo());
		
		util.getStringBuilder().setLength(0);
		util.getStringBuilder().append("==> Fin gestion Combo CREAR Parametro response\n");
		util.getStringBuilder().append("==> Combo Response\n");
		util.getStringBuilder().append(response.getCombo());
		util.pintarLog(log, util.getStringBuilder().toString());
		
		return response;
	}

}
