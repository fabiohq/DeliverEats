/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatspersistence.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author fabio
 */
@Entity
@Table(name = "pedidotipoestado")
@NamedQueries({
    @NamedQuery(name = "Pedidotipoestado.findAll", query = "SELECT p FROM Pedidotipoestado p"),
    @NamedQuery(name = "Pedidotipoestado.findByIdestadopedido", query = "SELECT p FROM Pedidotipoestado p WHERE p.pedidotipoestadoPK.idestadopedido = :idestadopedido"),
    @NamedQuery(name = "Pedidotipoestado.findByIdpedido", query = "SELECT p FROM Pedidotipoestado p WHERE p.pedidotipoestadoPK.idpedido = :idpedido"),
    @NamedQuery(name = "Pedidotipoestado.findByIdtipopedido", query = "SELECT p FROM Pedidotipoestado p WHERE p.pedidotipoestadoPK.idtipopedido = :idtipopedido"),
    @NamedQuery(name = "Pedidotipoestado.findByIdestadoproducto", query = "SELECT p FROM Pedidotipoestado p WHERE p.idestadoproducto = :idestadoproducto"),
    @NamedQuery(name = "Pedidotipoestado.findByIdtipoproducto", query = "SELECT p FROM Pedidotipoestado p WHERE p.idtipoproducto = :idtipoproducto"),
    @NamedQuery(name = "Pedidotipoestado.findByIdproducto", query = "SELECT p FROM Pedidotipoestado p WHERE p.idproducto = :idproducto"),
    @NamedQuery(name = "Pedidotipoestado.findByIdcombo", query = "SELECT p FROM Pedidotipoestado p WHERE p.idcombo = :idcombo"),
    @NamedQuery(name = "Pedidotipoestado.findByIdproductocombo", query = "SELECT p FROM Pedidotipoestado p WHERE p.idproductocombo = :idproductocombo"),
    @NamedQuery(name = "Pedidotipoestado.findByIdadiciones", query = "SELECT p FROM Pedidotipoestado p WHERE p.idadiciones = :idadiciones"),
    @NamedQuery(name = "Pedidotipoestado.findByIdproductoadiciones", query = "SELECT p FROM Pedidotipoestado p WHERE p.idproductoadiciones = :idproductoadiciones"),
    @NamedQuery(name = "Pedidotipoestado.findByIdestadoactorsistema", query = "SELECT p FROM Pedidotipoestado p WHERE p.idestadoactorsistema = :idestadoactorsistema"),
    @NamedQuery(name = "Pedidotipoestado.findByIdtipoactorsistema", query = "SELECT p FROM Pedidotipoestado p WHERE p.idtipoactorsistema = :idtipoactorsistema"),
    @NamedQuery(name = "Pedidotipoestado.findByIdactorsistema", query = "SELECT p FROM Pedidotipoestado p WHERE p.idactorsistema = :idactorsistema"),
    @NamedQuery(name = "Pedidotipoestado.findByIdestadopago", query = "SELECT p FROM Pedidotipoestado p WHERE p.idestadopago = :idestadopago"),
    @NamedQuery(name = "Pedidotipoestado.findByIdtipopago", query = "SELECT p FROM Pedidotipoestado p WHERE p.idtipopago = :idtipopago"),
    @NamedQuery(name = "Pedidotipoestado.findByIdpago", query = "SELECT p FROM Pedidotipoestado p WHERE p.idpago = :idpago")})
public class Pedidotipoestado implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PedidotipoestadoPK pedidotipoestadoPK;
    @Column(name = "idestadoproducto")
    private Integer idestadoproducto;
    @Column(name = "idtipoproducto")
    private Integer idtipoproducto;
    @Column(name = "idproducto")
    private Integer idproducto;
    @Size(max = 20)
    @Column(name = "idcombo")
    private String idcombo;
    @Size(max = 20)
    @Column(name = "idproductocombo")
    private String idproductocombo;
    @Size(max = 20)
    @Column(name = "idadiciones")
    private String idadiciones;
    @Size(max = 20)
    @Column(name = "idproductoadiciones")
    private String idproductoadiciones;
    @Column(name = "idestadoactorsistema")
    private Integer idestadoactorsistema;
    @Column(name = "idtipoactorsistema")
    private Integer idtipoactorsistema;
    @Column(name = "idactorsistema")
    private Integer idactorsistema;
    @Column(name = "idestadopago")
    private Integer idestadopago;
    @Column(name = "idtipopago")
    private Integer idtipopago;
    @Column(name = "idpago")
    private Integer idpago;

    public Pedidotipoestado() {
    }

    public Pedidotipoestado(PedidotipoestadoPK pedidotipoestadoPK) {
        this.pedidotipoestadoPK = pedidotipoestadoPK;
    }

    public Pedidotipoestado(int idestadopedido, int idpedido, int idtipopedido) {
        this.pedidotipoestadoPK = new PedidotipoestadoPK(idestadopedido, idpedido, idtipopedido);
    }

    public PedidotipoestadoPK getPedidotipoestadoPK() {
        return pedidotipoestadoPK;
    }

    public void setPedidotipoestadoPK(PedidotipoestadoPK pedidotipoestadoPK) {
        this.pedidotipoestadoPK = pedidotipoestadoPK;
    }

    public Integer getIdestadoproducto() {
        return idestadoproducto;
    }

    public void setIdestadoproducto(Integer idestadoproducto) {
        this.idestadoproducto = idestadoproducto;
    }

    public Integer getIdtipoproducto() {
        return idtipoproducto;
    }

    public void setIdtipoproducto(Integer idtipoproducto) {
        this.idtipoproducto = idtipoproducto;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getIdcombo() {
        return idcombo;
    }

    public void setIdcombo(String idcombo) {
        this.idcombo = idcombo;
    }

    public String getIdproductocombo() {
        return idproductocombo;
    }

    public void setIdproductocombo(String idproductocombo) {
        this.idproductocombo = idproductocombo;
    }

    public String getIdadiciones() {
        return idadiciones;
    }

    public void setIdadiciones(String idadiciones) {
        this.idadiciones = idadiciones;
    }

    public String getIdproductoadiciones() {
        return idproductoadiciones;
    }

    public void setIdproductoadiciones(String idproductoadiciones) {
        this.idproductoadiciones = idproductoadiciones;
    }

    public Integer getIdestadoactorsistema() {
        return idestadoactorsistema;
    }

    public void setIdestadoactorsistema(Integer idestadoactorsistema) {
        this.idestadoactorsistema = idestadoactorsistema;
    }

    public Integer getIdtipoactorsistema() {
        return idtipoactorsistema;
    }

    public void setIdtipoactorsistema(Integer idtipoactorsistema) {
        this.idtipoactorsistema = idtipoactorsistema;
    }

    public Integer getIdactorsistema() {
        return idactorsistema;
    }

    public void setIdactorsistema(Integer idactorsistema) {
        this.idactorsistema = idactorsistema;
    }

    public Integer getIdestadopago() {
        return idestadopago;
    }

    public void setIdestadopago(Integer idestadopago) {
        this.idestadopago = idestadopago;
    }

    public Integer getIdtipopago() {
        return idtipopago;
    }

    public void setIdtipopago(Integer idtipopago) {
        this.idtipopago = idtipopago;
    }

    public Integer getIdpago() {
        return idpago;
    }

    public void setIdpago(Integer idpago) {
        this.idpago = idpago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedidotipoestadoPK != null ? pedidotipoestadoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidotipoestado)) {
            return false;
        }
        Pedidotipoestado other = (Pedidotipoestado) object;
        if ((this.pedidotipoestadoPK == null && other.pedidotipoestadoPK != null) || (this.pedidotipoestadoPK != null && !this.pedidotipoestadoPK.equals(other.pedidotipoestadoPK))) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return "Pedidotipoestado [pedidotipoestadoPK=" + pedidotipoestadoPK + ", idestadoproducto=" + idestadoproducto
				+ ", idtipoproducto=" + idtipoproducto + ", idproducto=" + idproducto + ", idcombo=" + idcombo
				+ ", idproductocombo=" + idproductocombo + ", idadiciones=" + idadiciones + ", idproductoadiciones="
				+ idproductoadiciones + ", idestadoactorsistema=" + idestadoactorsistema + ", idtipoactorsistema="
				+ idtipoactorsistema + ", idactorsistema=" + idactorsistema + ", idestadopago=" + idestadopago
				+ ", idtipopago=" + idtipopago + ", idpago=" + idpago + "]";
	}

    
}
