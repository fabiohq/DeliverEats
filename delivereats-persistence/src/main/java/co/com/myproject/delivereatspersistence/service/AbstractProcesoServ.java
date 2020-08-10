package co.com.myproject.delivereatspersistence.service;

import org.springframework.beans.factory.annotation.Autowired;

import co.com.myproject.delivereatspersistence.helpers.AbstractUtil;

public abstract class AbstractProcesoServ extends AbstractUtil{

	@Autowired protected IPersonaServ personaServ;
	@Autowired protected ITipoPersonaServ tipoPersonaServ;
	@Autowired protected IEstadoPersonaServ estadoPersonaServ;
	@Autowired protected IPersonaEstadoTipoServ personaEstadoTipoServ;
	
	@Autowired protected IDocumentoServ documentoServ;
	@Autowired protected ITipoDocumentoServ tipoDocumentoServ;
	@Autowired protected IEstadoDocumentoServ estadoDocumentoServ;
	@Autowired protected IDocumentoEstadoTipoServ documentoEstadoTipoServ;
	
	@Autowired protected ITelefonoServ telefonoServ;
	@Autowired protected ITipoTelefonoServ tipoTelefonoServ;
	@Autowired protected IEstadoTelefonoServ estadoTelefonoServ;
	@Autowired protected ITelefonoEstadoTipoServ telefonoEstadoTipoServ;
	
	@Autowired protected IMailServ mailServ;
	@Autowired protected ITipoMailServ tipoMailServ;
	@Autowired protected IEstadoMailServ estadoMailServ;
	@Autowired protected IMailEstadoTipoServ mailEstadoTipoServ;
	
	@Autowired protected IRolServ rolServ;
	@Autowired protected ITipoRolServ tipoRolServ;
	@Autowired protected IEstadoRolServ estadoRolServ;
	@Autowired protected IRolEstadoTipoServ rolEstadoTipoServ;
	
	@Autowired protected IUbicacionServ ubicacionServ;
	@Autowired protected ITipoUbicacionServ tipoUbicacionServ;
	@Autowired protected IEstadoUbicacionServ estadoUbicacionServ;
	@Autowired protected IUbicacionEstadoTipoServ ubicacionEstadoTipoServ;
	
	@Autowired protected ICredencialesServ credencialesServ;
	@Autowired protected ITipoCredencialesServ tipoCredencialesServ;
	@Autowired protected IEstadoCredencialesServ estadoCredencialesServ;
	@Autowired protected ICredencialEstadoTipoServ credencialesEstadoTipoServ;
	
	@Autowired protected ITransporteServ transporteServ;
	@Autowired protected ITipoTransporteServ tipoTransporteServ;
	@Autowired protected IEstadoTransporteServ estadoTransporteServ;
	@Autowired protected ITransporteEstadoTipoServ transporteEstadoTipoServ;
	
	@Autowired protected ITurnoServ turnoServ;	
	@Autowired protected IEstadoTurnoServ estadoTurnoServ;
	@Autowired protected ITurnoEstadoServ turnoEstadoServ;
	
	@Autowired protected IPagoServ pagoServ;
	@Autowired protected ITipoPagoServ tipoPagoServ;
	@Autowired protected IEstadoPagoServ estadoPagoServ;
	@Autowired protected IPagoEstadoTipoServ pagoEstadoTipoServ;
	
	@Autowired protected ICategoriaServ categoriaServ;
	@Autowired protected ITipoCategoriaServ tipoCategoriaServ;
	@Autowired protected IEstadoCategoriaServ estadoCategoriaServ;
	@Autowired protected ICategoriaEstadotipoServ categoriaEstadoTipoServ;
	
	@Autowired protected IEstablecimientoServ establecimientoServ;
	@Autowired protected ITipoEstablecimientoServ tipoEstablecimientoServ;
	@Autowired protected IEstadoEstablecimientoServ estadoEstablecimientoServ;
	@Autowired protected IEstablecimientoEstadoTipoServ establecimientoEstadoTipoServ;
	@Autowired protected IEspecialidadServ especialidadServ;
	
	@Autowired protected IActorSistemaServ actorSistemaServ;
	@Autowired protected ITipoActorSistemaServ tipoActorSistemaServ;
	@Autowired protected IEstadoActorSistemaServ estadoActorSistemaServ;
	@Autowired protected IActorsistemaestadotipoServ actorSistemaEstadoTipoServ;
	
	//Faltan
	@Autowired protected IPedidoServ pedidoServ;
	@Autowired protected ITipoPedidoServ tipoPedidoServ;
	@Autowired protected IEstadoPedidoServ estadoPedidoServ;
	@Autowired protected IPedidoTipoEstadoServ pedidoTipoEsadoServ;
	
	@Autowired protected IFormaPagoServ formaPagoServ;
	@Autowired protected ITipoFormaPagoServ tipoFormaPagoServ;
	@Autowired protected IEstadoFormaPagoServ estadoFormaPagoServ;
	@Autowired protected IFormaPagoEstadoTipoServ formaPagoEstadoTipoServ;
	
	@Autowired protected ITarjetaServ tarjetaServ;
	@Autowired protected ITipoTarjetaServ tipoTarjetaServ;
	@Autowired protected IEstadoTarjetaServ estadoTarjetaServ;
	@Autowired protected ITarjetaEstadoTipoServ tarjetaEstadoTipoServ;
	
	@Autowired protected IProcesoPersonaServ procesoPersonaServ;
	
	@Autowired protected IProductoServ productoServ;
	@Autowired protected ITipoProductoServ tipoProductoServ;
	@Autowired protected IEstadoProductoServ estadoProductoServ;	
	@Autowired protected IAdicionesServ adicionesServ;
	@Autowired protected IComboServ comboServ;
	@Autowired protected IProductosAdicionesServ productosAdicionesServ;
	@Autowired protected IProductoComboServ productoComboServ;
	
}
