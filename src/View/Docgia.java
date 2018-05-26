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
@Table(name = "docgia", catalog = "quanlythuvien", schema = "")
@NamedQueries({
    @NamedQuery(name = "Docgia.findAll", query = "SELECT d FROM Docgia d")
    , @NamedQuery(name = "Docgia.findByMaDocGia", query = "SELECT d FROM Docgia d WHERE d.maDocGia = :maDocGia")
    , @NamedQuery(name = "Docgia.findByTenDocGia", query = "SELECT d FROM Docgia d WHERE d.tenDocGia = :tenDocGia")
    , @NamedQuery(name = "Docgia.findByMssv", query = "SELECT d FROM Docgia d WHERE d.mssv = :mssv")
    , @NamedQuery(name = "Docgia.findByLop", query = "SELECT d FROM Docgia d WHERE d.lop = :lop")
    , @NamedQuery(name = "Docgia.findByKhoa", query = "SELECT d FROM Docgia d WHERE d.khoa = :khoa")
    , @NamedQuery(name = "Docgia.findByGioiTinh", query = "SELECT d FROM Docgia d WHERE d.gioiTinh = :gioiTinh")
    , @NamedQuery(name = "Docgia.findByNgaySinh", query = "SELECT d FROM Docgia d WHERE d.ngaySinh = :ngaySinh")
    , @NamedQuery(name = "Docgia.findBySdt", query = "SELECT d FROM Docgia d WHERE d.sdt = :sdt")
    , @NamedQuery(name = "Docgia.findByDiaChi", query = "SELECT d FROM Docgia d WHERE d.diaChi = :diaChi")
    , @NamedQuery(name = "Docgia.findByNgayTao", query = "SELECT d FROM Docgia d WHERE d.ngayTao = :ngayTao")})
public class Docgia implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MaDocGia")
    private String maDocGia;
    @Basic(optional = false)
    @Column(name = "TenDocGia")
    private String tenDocGia;
    @Basic(optional = false)
    @Column(name = "Mssv")
    private int mssv;
    @Basic(optional = false)
    @Column(name = "Lop")
    private String lop;
    @Basic(optional = false)
    @Column(name = "Khoa")
    private String khoa;
    @Basic(optional = false)
    @Column(name = "GioiTinh")
    private String gioiTinh;
    @Basic(optional = false)
    @Column(name = "NgaySinh")
    @Temporal(TemporalType.DATE)
    private Date ngaySinh;
    @Column(name = "Sdt")
    private Integer sdt;
    @Column(name = "DiaChi")
    private String diaChi;
    @Column(name = "NgayTao")
    @Temporal(TemporalType.DATE)
    private Date ngayTao;

    public Docgia() {
    }

    public Docgia(String maDocGia) {
        this.maDocGia = maDocGia;
    }

    public Docgia(String maDocGia, String tenDocGia, int mssv, String lop, String khoa, String gioiTinh, Date ngaySinh) {
        this.maDocGia = maDocGia;
        this.tenDocGia = tenDocGia;
        this.mssv = mssv;
        this.lop = lop;
        this.khoa = khoa;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String getMaDocGia() {
        return maDocGia;
    }

    public void setMaDocGia(String maDocGia) {
        String oldMaDocGia = this.maDocGia;
        this.maDocGia = maDocGia;
        changeSupport.firePropertyChange("maDocGia", oldMaDocGia, maDocGia);
    }

    public String getTenDocGia() {
        return tenDocGia;
    }

    public void setTenDocGia(String tenDocGia) {
        String oldTenDocGia = this.tenDocGia;
        this.tenDocGia = tenDocGia;
        changeSupport.firePropertyChange("tenDocGia", oldTenDocGia, tenDocGia);
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        int oldMssv = this.mssv;
        this.mssv = mssv;
        changeSupport.firePropertyChange("mssv", oldMssv, mssv);
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        String oldLop = this.lop;
        this.lop = lop;
        changeSupport.firePropertyChange("lop", oldLop, lop);
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        String oldKhoa = this.khoa;
        this.khoa = khoa;
        changeSupport.firePropertyChange("khoa", oldKhoa, khoa);
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        String oldGioiTinh = this.gioiTinh;
        this.gioiTinh = gioiTinh;
        changeSupport.firePropertyChange("gioiTinh", oldGioiTinh, gioiTinh);
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        Date oldNgaySinh = this.ngaySinh;
        this.ngaySinh = ngaySinh;
        changeSupport.firePropertyChange("ngaySinh", oldNgaySinh, ngaySinh);
    }

    public Integer getSdt() {
        return sdt;
    }

    public void setSdt(Integer sdt) {
        Integer oldSdt = this.sdt;
        this.sdt = sdt;
        changeSupport.firePropertyChange("sdt", oldSdt, sdt);
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        String oldDiaChi = this.diaChi;
        this.diaChi = diaChi;
        changeSupport.firePropertyChange("diaChi", oldDiaChi, diaChi);
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        Date oldNgayTao = this.ngayTao;
        this.ngayTao = ngayTao;
        changeSupport.firePropertyChange("ngayTao", oldNgayTao, ngayTao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maDocGia != null ? maDocGia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Docgia)) {
            return false;
        }
        Docgia other = (Docgia) object;
        if ((this.maDocGia == null && other.maDocGia != null) || (this.maDocGia != null && !this.maDocGia.equals(other.maDocGia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Docgia[ maDocGia=" + maDocGia + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
