package B4;

import java.util.ArrayList;
import java.util.Random;

public class NhanVienPartTime extends NhanVien {

    private int gioLV;

    public NhanVienPartTime(String tenNV, int gioLV) {
        super(tenNV);
        this.gioLV = gioLV;
    }

    public void tinhLuong(){
        super.setLuong(40000*gioLV);
    }

    public static void main(String[] args) {
        ArrayList<NhanVien> nv = new ArrayList<NhanVien>();
        Random generator = new Random();
        for (int i = 0; i < 5; i++) {
            int value = generator.nextInt(100) + 1;


            if (value % 2 != 0) {
                int ngayLamViec = generator.nextInt(11) + 15;
//                System.out.println(ngayLamViec);
                nv.add(new NhanVienFullTime("NhanVienFullTime"+i+":",ngayLamViec));

            } else {
                int gioLamViec = generator.nextInt(121) + 80;
                nv.add(new NhanVienPartTime("NhanVienPartTime"+i+":",gioLamViec));

            }
            nv.get(i).tinhLuong();
            System.out.println(nv.get(i).getTenNV()+nv.get(i).getLuong());


        }

    }

}
