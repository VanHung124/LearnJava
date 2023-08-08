import tlu.khmt.A34734.B1.*;
import tlu.khmt.A34734.B1.HashSet;
import tlu.khmt.A34734.B1.SinhVien;
import tlu.khmt.A34734.B4.Point;
import tlu.khmt.A34734.B4.PointHashSet;
import tlu.khmt.A34734.B5.NVHashSet;
import tlu.khmt.A34734.B5.NhanVien;

public class Main {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        System.out.println("Bai1");
        hs.add(new SinhVien("A34734","Hung",2));
        hs.add(new SinhVien("A34734","Hung1",5));
        hs.add(new SinhVien("A34733","Hung3",2));
        hs.hienThi();

        System.out.println("Bai2");

        TreeSet ts = new TreeSet();
        ts.add(new SinhVien("A34734","Hung",10));
        ts.add(new SinhVien("A34734","Hung1",7));
        ts.add(new SinhVien("A34733","Hung2",9));
        ts.add(new SinhVien("A34739","Hung3",1));
        ts.add(new SinhVien("A34739","Hung3",3));
        ts.hienThi();
        System.out.println("Bai4");
        PointHashSet phs = new PointHashSet();
        phs.add(new Point(3,4));
        phs.add(new Point(3,5));
        phs.add(new Point(3,4));
        phs.add(new Point(8,4));
        phs.hienThi();
        System.out.println("Bai5");
        NVHashSet nvhs = new NVHashSet();
        nvhs.add(new NhanVien(1,"hung",100));
        nvhs.add(new NhanVien(1,"hung",100));
        nvhs.add(new NhanVien(2,"hung",200));
        nvhs.add(new NhanVien(3,"hung",111));
        nvhs.hienThi();
    }
}
