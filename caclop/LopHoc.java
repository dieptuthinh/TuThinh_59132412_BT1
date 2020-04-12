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
        System.out.println("Thong tin hoc sinh vua nhap la :");
        QLDSHocSinh.inDS();
        return 1;
    }
    // in danh sach giao vien giang day
    public int inDSGVGD() {
        System.out.println("Thong tin giao vien giang day vua nhap la :");
        QLDSGiaoVien.inDS();
        return 1;
    }

}