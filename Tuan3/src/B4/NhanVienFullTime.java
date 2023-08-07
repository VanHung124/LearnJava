package B4;

public class NhanVienFullTime extends NhanVien {

    private int ngayLV;

    public NhanVienFullTime(String tenNV, int ngayLV) {
        super(tenNV);
        this.ngayLV = ngayLV;
    }

    public void tinhLuong(){
        super.setLuong(500000*ngayLV);
    }

}
