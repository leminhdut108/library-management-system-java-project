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
@Table(name = "muontra", catalog = "quanlythuvien", schema = "")
@NamedQueries({
    @NamedQuery(name = "Muontra.findAll", query = "SELECT m FROM Muontra m")
    , @NamedQuery(name = "Muontra.findByMaMuonTra", query = "SELECT m FROM Muontra m WHERE m.maMuonTra = :maMuonTra")
    , @NamedQuery(name = "Muontra.findByMaDocGia", query = "SELECT m FROM Muontra m WHERE m.maDocGia = :maDocGia")
    , @NamedQuery(name = "Muontra.findByNgayMuon", query = "SELECT m FROM Muontra m WHERE m.ngayMuon = :ngayMuon")
    , @NamedQuery(name = "Muontra.findByDatCoc", query = "SELECT m FROM Muontra m WHERE m.datCoc = :datCoc")
    , @NamedQuery(name = "Muontra.findByGhiChu", query = "SELECT m FROM Muontra m WHERE m.ghiChu = :ghiChu")})
public class Muontra implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaMuonTra")
    private String maMuonTra;
    @Basic(optional = false)
    @Column(name = "MaDocGia")
    private String maDocGia;
    @Basic(optional = false)
    @Column(name = "NgayMuon")
    @Temporal(TemporalType.DATE)
    private Date ngayMuon;
    @Basic(optional = false)
    @Column(name = "DatCoc")
    private int datCoc;
    @Column(name = "GhiChu")
    private String ghiChu;

    public Muontra() {
    }

    public Muontra(String maMuonTra) {
        this.maMuonTra = maMuonTra;
    }

    public Muontra(String maMuonTra, String maDocGia, Date ngayMuon, int datCoc) {
        this.maMuonTra = maMuonTra;
        this.maDocGia = maDocGia;
        this.ngayMuon = ngayMuon;
        this.datCoc = datCoc;
    }

    public String getMaMuonTra() {
        return maMuonTra;
    }

    public void setMaMuonTra(String maMuonTra) {
        String oldMaMuonTra = this.maMuonTra;
        this.maMuonTra = maMuonTra;
        changeSupport.firePropertyChange("maMuonTra", oldMaMuonTra, maMuonTra);
    }

    public String getMaDocGia() {
        return maDocGia;
    }

    public void setMaDocGia(String maDocGia) {
        String oldMaDocGia = this.maDocGia;
        this.maDocGia = maDocGia;
        changeSupport.firePropertyChange("maDocGia", oldMaDocGia, maDocGia);
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date ngayMuon) {
        Date oldNgayMuon = this.ngayMuon;
        this.ngayMuon = ngayMuon;
        changeSupport.firePropertyChange("ngayMuon", oldNgayMuon, ngayMuon);
    }

    public int getDatCoc() {
        return datCoc;
    }

    public void setDatCoc(int datCoc) {
        int oldDatCoc = this.datCoc;
        this.datCoc = datCoc;
        changeSupport.firePropertyChange("datCoc", oldDatCoc, datCoc);
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        String oldGhiChu = this.ghiChu;
        this.ghiChu = ghiChu;
        changeSupport.firePropertyChange("ghiChu", oldGhiChu, ghiChu);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maMuonTra != null ? maMuonTra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Muontra)) {
            return false;
        }
        Muontra other = (Muontra) object;
        if ((this.maMuonTra == null && other.maMuonTra != null) || (this.maMuonTra != null && !this.maMuonTra.equals(other.maMuonTra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Muontra[ maMuonTra=" + maMuonTra + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
