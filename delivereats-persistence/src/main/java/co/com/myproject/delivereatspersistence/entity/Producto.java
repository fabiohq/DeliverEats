/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatspersistence.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author fabio
 */
@Entity
@Table(name = "producto")
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p"),
    @NamedQuery(name = "Producto.findByIdproducto", query = "SELECT p FROM Producto p WHERE p.productoPK.idproducto = :idproducto"),
    @NamedQuery(name = "Producto.findByIdtipoproducto", query = "SELECT p FROM Producto p WHERE p.productoPK.idtipoproducto = :idtipoproducto"),
    @NamedQuery(name = "Producto.findByIdestadoproducto", query = "SELECT p FROM Producto p WHERE p.productoPK.idestadoproducto = :idestadoproducto"),
    @NamedQuery(name = "Producto.findByIdcategoria", query = "SELECT p FROM Producto p WHERE p.idcategoria = :idcategoria"),
    @NamedQuery(name = "Producto.findByIdtipocategoria", query = "SELECT p FROM Producto p WHERE p.idtipocategoria = :idtipocategoria"),
    @NamedQuery(name = "Producto.findByIdestadocategoria", query = "SELECT p FROM Producto p WHERE p.idestadocategoria = :idestadocategoria"),
    @NamedQuery(name = "Producto.findByNombre", query = "SELECT p FROM Producto p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Producto.findByObservacion", query = "SELECT p FROM Producto p WHERE p.observacion = :observacion"),
    @NamedQuery(name = "Producto.findByFechaini", query = "SELECT p FROM Producto p WHERE p.fechaini = :fechaini"),
    @NamedQuery(name = "Producto.findByFechafin", query = "SELECT p FROM Producto p WHERE p.fechafin = :fechafin"),
    @NamedQuery(name = "Producto.findByValor", query = "SELECT p FROM Producto p WHERE p.valor = :valor"),
    @NamedQuery(name = "Producto.findByDescripcion", query = "SELECT p FROM Producto p WHERE p.descripcion = :descripcion")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductoPK productoPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcategoria")
    private int idcategoria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipocategoria")
    private int idtipocategoria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idestadocategoria")
    private int idestadocategoria;
    @Size(max = 500)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 500)
    @Column(name = "observacion")
    private String observacion;
    @Size(max = 20)
    @Column(name = "fechaini")
    private String fechaini;
    @Size(max = 20)
    @Column(name = "fechafin")
    private String fechafin;
    @Column(name = "valor")
    private Integer valor;
    @Size(max = 1000)
    @Column(name = "descripcion")
    private String descripcion;

    public Producto() {
    }

    public Producto(ProductoPK productoPK) {
        this.productoPK = productoPK;
    }

    public Producto(ProductoPK productoPK, int idcategoria, int idtipocategoria, int idestadocategoria) {
        this.productoPK = productoPK;
        this.idcategoria = idcategoria;
        this.idtipocategoria = idtipocategoria;
        this.idestadocategoria = idestadocategoria;
    }

    public Producto(int idproducto, int idtipoproducto, int idestadoproducto) {
        this.productoPK = new ProductoPK(idproducto, idtipoproducto, idestadoproducto);
    }

    public ProductoPK getProductoPK() {
        return productoPK;
    }

    public void setProductoPK(ProductoPK productoPK) {
        this.productoPK = productoPK;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public int getIdtipocategoria() {
        return idtipocategoria;
    }

    public void setIdtipocategoria(int idtipocategoria) {
        this.idtipocategoria = idtipocategoria;
    }

    public int getIdestadocategoria() {
        return idestadocategoria;
    }

    public void setIdestadocategoria(int idestadocategoria) {
        this.idestadocategoria = idestadocategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getFechaini() {
        return fechaini;
    }

    public void setFechaini(String fechaini) {
        this.fechaini = fechaini;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productoPK != null ? productoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.productoPK == null && other.productoPK != null) || (this.productoPK != null && !this.productoPK.equals(other.productoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatspersistence.entity.Producto[ productoPK=" + productoPK + " ]";
    }
    
}
