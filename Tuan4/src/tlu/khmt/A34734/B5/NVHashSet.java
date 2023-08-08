package tlu.khmt.A34734.B5;

import java.util.HashSet;
import java.util.Set;

public class NVHashSet {
    public Set<NhanVien> nv;

    public NVHashSet(){
        nv = new HashSet<>();
    }

    public void add(NhanVien a){
        if(!nv.contains(a)){
            nv.add(a);
        }
    }

    public void hienThi(){
        for (NhanVien i : nv) {
            System.out.println(i.getMaNV()+"___"+i.getTenNV()+"___"+i.getLuong()*15);
        }

    }

}
