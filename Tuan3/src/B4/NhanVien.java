package B4;

public abstract class NhanVien  {

    private String tenNV;
    private double luong;

    public NhanVien(String tenNV) {
        this.tenNV = tenNV;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getTenNV() {
        return tenNV;
    }


    public abstract void tinhLuong();

}


