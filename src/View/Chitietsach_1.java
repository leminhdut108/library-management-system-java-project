/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author hctha_000
 */
@Entity
@Table(name = "chitietsach", catalog = "quanlythuvien", schema = "")
@NamedQueries({
    @NamedQuery(name = "Chitietsach_1.findAll", query = "SELECT c FROM Chitietsach_1 c")
    , @NamedQuery(name = "Chitietsach_1.findByMaSach", query = "SELECT c FROM Chitietsach_1 c WHERE c.maSach = :maSach")
    , @NamedQuery(name = "Chitietsach_1.findByMaQuyen", query = "SELECT c FROM Chitietsach_1 c WHERE c.maQuyen = :maQuyen")
    , @NamedQuery(name = "Chitietsach_1.findByNgayNhap", query = "SELECT c FROM Chitietsach_1 c WHERE c.ngayNhap = :ngayNhap")
    , @NamedQuery(name = "Chitietsach_1.findByTrangThai", query = "SELECT c FROM Chitietsach_1 c WHERE c.trangThai = :trangThai")})
public class Chitietsach_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "MaSach")
    private String maSach;
    @Id
    @Basic(optional = false)
    @Column(name = "MaQuyen")
    private String maQuyen;
    @Column(name = "NgayNhap")
    @Temporal(TemporalType.DATE)
    private Date ngayNhap;
    @Column(name = "TrangThai")
    private String trangThai;

    public Chitietsach_1() {
    }

    public Chitietsach_1(String maQuyen) {
        this.maQuyen = maQuyen;
    }

    public Chitietsach_1(String maQuyen, String maSach) {
        this.maQuyen = maQuyen;
        this.maSach = maSach;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        String oldMaSach = this.maSach;
        this.maSach = maSach;
        changeSupport.firePropertyChange("maSach", oldMaSach, maSach);
    }

    public String getMaQuyen() {
        return maQuyen;
    }

    public void setMaQuyen(String maQuyen) {
        String oldMaQuyen = this.maQuyen;
        this.maQuyen = maQuyen;
        changeSupport.firePropertyChange("maQuyen", oldMaQuyen, maQuyen);
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        Date oldNgayNhap = this.ngayNhap;
        this.ngayNhap = ngayNhap;
        changeSupport.firePropertyChange("ngayNhap", oldNgayNhap, ngayNhap);
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        String oldTrangThai = this.trangThai;
        this.trangThai = trangThai;
        changeSupport.firePropertyChange("trangThai", oldTrangThai, trangThai);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maQuyen != null ? maQuyen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chitietsach_1)) {
            return false;
        }
        Chitietsach_1 other = (Chitietsach_1) object;
        if ((this.maQuyen == null && other.maQuyen != null) || (this.maQuyen != null && !this.maQuyen.equals(other.maQuyen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Chitietsach_1[ maQuyen=" + maQuyen + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
