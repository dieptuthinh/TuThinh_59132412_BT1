package caclop;

public class LopHoc {
    IDLQS QLDSGiaoVien = new QLDS();
    IDLQS QLDSHocSinh = new QLDS();

    public LopHoc() {
    }

    public int ThemHocSinh(HocSinh hs) 
    {
        if (QLDSHocSinh.them(hs) == 1) {
            return 1;
        }
        else
            return 0;
    }

    public int ThemGiaoVien(GiaoVien gv)
    {
        if (QLDSGiaoVien.them(gv) == 1) {
            return 1;
        }
        else
            return 0;

    }

    public int inDSHS() {
        System.out.println("Danh sach hoc sinh la :");
        QLDSHocSinh.inDS();
        return 1;
    }
    // in danh sach giao vien giang day
    public int inDSGVGD() {
        System.out.println("Danh sach giao vien giang day:");
        QLDSGiaoVien.inDS();
        return 1;
    }

}