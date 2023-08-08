package tlu.khmt.A34734.B1;

import java.util.Set;

public class HashSet {

    private Set<SinhVien> sv;

    public HashSet(){
        sv = new java.util.HashSet<SinhVien>();
    }

    public void add(SinhVien s){
        if (!sv.contains(s)) {
            sv.add(s);
            // đưa dữ liệu vào set SinhVien
        }
    }

    public void hienThi(){
        for (SinhVien i : sv) {
            System.out.println(i.getMaSV()+"___"+i.getTenSV()+"___"+i.getDiem());
        }
    }

}
