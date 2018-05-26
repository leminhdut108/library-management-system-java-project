/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author hctha_000
 */
@Entity
@Table(name = "sach", catalog = "quanlythuvien", schema = "")
@NamedQueries({
    @NamedQuery(name = "Sach.findAll", query = "SELECT s FROM Sach s")
    , @NamedQuery(name = "Sach.findByMaSach", query = "SELECT s FROM Sach s WHERE s.maSach = :maSach")
    , @NamedQuery(name = "Sach.findByTenSach", query = "SELECT s FROM Sach s WHERE s.tenSach = :tenSach")
    , @NamedQuery(name = "Sach.findByGia", query = "SELECT s FROM Sach s WHERE s.gia = :gia")
    , @NamedQuery(name = "Sach.findByNxb", query = "SELECT s FROM Sach s WHERE s.nxb = :nxb")
    , @NamedQuery(name = "Sach.findByNamXB", query = "SELECT s FROM Sach s WHERE s.namXB = :namXB")
    , @NamedQuery(name = "Sach.findByTacGia", query = "SELECT s FROM Sach s WHERE s.tacGia = :tacGia")
    , @NamedQuery(name = "Sach.findByTheLoai", query = "SELECT s FROM Sach s WHERE s.theLoai = :theLoai")
    , @NamedQuery(name = "Sach.findBySoTrang", query = "SELECT s FROM Sach s WHERE s.soTrang = :soTrang")})
public class Sach implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaSach")
    private String maSach;
    @Basic(optional = false)
    @Column(name = "TenSach")
    private String tenSach;
    @Column(name = "Gia")
    private Integer gia;
    @Column(name = "Nxb")
    private String nxb;
    @Column(name = "NamXB")
    private Integer namXB;
    @Column(name = "TacGia")
    private String tacGia;
    @Column(name = "TheLoai")
    private String theLoai;
    @Column(name = "SoTrang")
    private Integer soTrang;

    public Sach() {
    }

    public Sach(String maSach) {
        this.maSach = maSach;
    }

    public Sach(String maSach, String tenSach) {
        this.maSach = maSach;
        this.tenSach = tenSach;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        String oldMaSach = this.maSach;
        this.maSach = maSach;
        changeSupport.firePropertyChange("maSach", oldMaSach, maSach);
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        String oldTenSach = this.tenSach;
        this.tenSach = tenSach;
        changeSupport.firePropertyChange("tenSach", oldTenSach, tenSach);
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        Integer oldGia = this.gia;
        this.gia = gia;
        changeSupport.firePropertyChange("gia", oldGia, gia);
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        String oldNxb = this.nxb;
        this.nxb = nxb;
        changeSupport.firePropertyChange("nxb", oldNxb, nxb);
    }

    public Integer getNamXB() {
        return namXB;
    }

    public void setNamXB(Integer namXB) {
        Integer oldNamXB = this.namXB;
        this.namXB = namXB;
        changeSupport.firePropertyChange("namXB", oldNamXB, namXB);
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        String oldTacGia = this.tacGia;
        this.tacGia = tacGia;
        changeSupport.firePropertyChange("tacGia", oldTacGia, tacGia);
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        String oldTheLoai = this.theLoai;
        this.theLoai = theLoai;
        changeSupport.firePropertyChange("theLoai", oldTheLoai, theLoai);
    }

    public Integer getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(Integer soTrang) {
        Integer oldSoTrang = this.soTrang;
        this.soTrang = soTrang;
        changeSupport.firePropertyChange("soTrang", oldSoTrang, soTrang);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maSach != null ? maSach.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sach)) {
            return false;
        }
        Sach other = (Sach) object;
        if ((this.maSach == null && other.maSach != null) || (this.maSach != null && !this.maSach.equals(other.maSach))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Sach[ maSach=" + maSach + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
