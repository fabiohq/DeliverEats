/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.myproject.delivereatsrepo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author fabio
 */
@Entity
@Table(name = "categoriaestadotipo")
@NamedQueries({
    @NamedQuery(name = "Categoriaestadotipo.findAll", query = "SELECT c FROM Categoriaestadotipo c"),
    @NamedQuery(name = "Categoriaestadotipo.findByIdestadocategoria", query = "SELECT c FROM Categoriaestadotipo c WHERE c.categoriaestadotipoPK.idestadocategoria = :idestadocategoria"),
    @NamedQuery(name = "Categoriaestadotipo.findByIdtipocategoria", query = "SELECT c FROM Categoriaestadotipo c WHERE c.categoriaestadotipoPK.idtipocategoria = :idtipocategoria"),
    @NamedQuery(name = "Categoriaestadotipo.findByIdcategoria", query = "SELECT c FROM Categoriaestadotipo c WHERE c.categoriaestadotipoPK.idcategoria = :idcategoria"),
    @NamedQuery(name = "Categoriaestadotipo.findByIdespecialidad", query = "SELECT c FROM Categoriaestadotipo c WHERE c.idespecialidad = :idespecialidad"),
    @NamedQuery(name = "Categoriaestadotipo.findByIdtipoestadoestablecimiento", query = "SELECT c FROM Categoriaestadotipo c WHERE c.idtipoestadoestablecimiento = :idtipoestadoestablecimiento"),
    @NamedQuery(name = "Categoriaestadotipo.findByIdestadoestablecimiento", query = "SELECT c FROM Categoriaestadotipo c WHERE c.idestadoestablecimiento = :idestadoestablecimiento"),
    @NamedQuery(name = "Categoriaestadotipo.findByIdestablecimiento", query = "SELECT c FROM Categoriaestadotipo c WHERE c.idestablecimiento = :idestablecimiento")})
public class Categoriaestadotipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CategoriaestadotipoPK categoriaestadotipoPK;
    @Column(name = "idespecialidad")
    private Integer idespecialidad;
    @Column(name = "idtipoestadoestablecimiento")
    private Integer idtipoestadoestablecimiento;
    @Column(name = "idestadoestablecimiento")
    private Integer idestadoestablecimiento;
    @Column(name = "idestablecimiento")
    private Integer idestablecimiento;

    public Categoriaestadotipo() {
    }

    public Categoriaestadotipo(CategoriaestadotipoPK categoriaestadotipoPK) {
        this.categoriaestadotipoPK = categoriaestadotipoPK;
    }

    public Categoriaestadotipo(int idestadocategoria, int idtipocategoria, int idcategoria) {
        this.categoriaestadotipoPK = new CategoriaestadotipoPK(idestadocategoria, idtipocategoria, idcategoria);
    }

    public CategoriaestadotipoPK getCategoriaestadotipoPK() {
        return categoriaestadotipoPK;
    }

    public void setCategoriaestadotipoPK(CategoriaestadotipoPK categoriaestadotipoPK) {
        this.categoriaestadotipoPK = categoriaestadotipoPK;
    }

    public Integer getIdespecialidad() {
        return idespecialidad;
    }

    public void setIdespecialidad(Integer idespecialidad) {
        this.idespecialidad = idespecialidad;
    }

    public Integer getIdtipoestadoestablecimiento() {
        return idtipoestadoestablecimiento;
    }

    public void setIdtipoestadoestablecimiento(Integer idtipoestadoestablecimiento) {
        this.idtipoestadoestablecimiento = idtipoestadoestablecimiento;
    }

    public Integer getIdestadoestablecimiento() {
        return idestadoestablecimiento;
    }

    public void setIdestadoestablecimiento(Integer idestadoestablecimiento) {
        this.idestadoestablecimiento = idestadoestablecimiento;
    }

    public Integer getIdestablecimiento() {
        return idestablecimiento;
    }

    public void setIdestablecimiento(Integer idestablecimiento) {
        this.idestablecimiento = idestablecimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoriaestadotipoPK != null ? categoriaestadotipoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoriaestadotipo)) {
            return false;
        }
        Categoriaestadotipo other = (Categoriaestadotipo) object;
        if ((this.categoriaestadotipoPK == null && other.categoriaestadotipoPK != null) || (this.categoriaestadotipoPK != null && !this.categoriaestadotipoPK.equals(other.categoriaestadotipoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.myproject.delivereatsrepo.entity.Categoriaestadotipo[ categoriaestadotipoPK=" + categoriaestadotipoPK + " ]";
    }
    
}
