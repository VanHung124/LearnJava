package tlu.khmt.A34734.B1;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien> {

    private String maSV,tenSV;
    private double diem;

    public SinhVien(String maSV, String tenSV, double diem) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return maSV.equals(sinhVien.maSV);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSV);
    }

    @Override
    public int compareTo(SinhVien o) {
        if(diem>o.getDiem()){
            return -1;
        }
        if(diem==o.getDiem()){
            return 0;
        }
        return 1;
    }

}


