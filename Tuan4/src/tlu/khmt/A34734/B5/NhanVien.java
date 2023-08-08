package tlu.khmt.A34734.B5;

import java.util.Objects;

public class NhanVien {

    private int MaNV;
    private String tenNV;
    private double luong;

    public NhanVien(int maNV, String tenNV, double luong) {
        MaNV = maNV;
        this.tenNV = tenNV;
        this.luong = luong;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int maNV) {
        MaNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NhanVien nhanVien = (NhanVien) o;
        return MaNV == nhanVien.MaNV;
    }

    @Override
    public int hashCode() {
        return Objects.hash(MaNV);
    }
}
