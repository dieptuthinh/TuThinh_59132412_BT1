package caclop;
import caclop.LopHoc;
import caclop.GiaoVien;
import caclop.HocSinh;
import java.util.Scanner;

/**
 * TrangChinh
 */
public class TrangChinh {

    public static void main(String[] args) {

        LopHoc lopHoc = new LopHoc();
        Scanner input = new Scanner(System.in);
        // tao them hoc sinh bang input user
        HocSinh hs3 = new HocSinh();
        System.out.println("nhap thong tin hoc sinh: ");
        System.out.print("ten hoc sinh: ");
        hs3.setHoTen(input.nextLine());
        System.out.print("tuoi: ");
        hs3.setTuoi(input.nextInt());
        input.nextLine();
        System.out.print("dia chi: ");
        hs3.setDiaChi(input.nextLine());
        System.out.print("so dien thoai: ");
        hs3.setSdt(input.nextLine());
        System.out.print("lop: ");
        hs3.setLop(input.nextLine());
        System.out.print("nang khieu: ");
        hs3.setNangKhieu(input.nextLine());
        // them hs vao lop
        lopHoc.ThemHocSinh(hs3);

        GiaoVien gv3 = new GiaoVien();
        System.out.println("\nnhap thong tin giao vien giang day: ");
        System.out.print("ten giao vien giang day: ");
        gv3.setHoTen(input.nextLine());
        System.out.print("tuoi: ");
        gv3.setTuoi(input.nextInt());
        input.nextLine();
        System.out.print("dia chi: ");
        gv3.setDiaChi(input.nextLine());
        System.out.print("so dien thoai: ");
        gv3.setSdt(input.nextLine());
        System.out.print("mon day: ");
        gv3.setMonDay(input.nextLine());
        System.out.print("to bo mon: ");
        gv3.setToBoMon(input.nextLine());
        // them hs vao lop
        lopHoc.ThemGiaoVien(gv3);

        // in danh sach hos sinh trong lop
        lopHoc.inDSHS();

        // in danh sach giao vien giang day
        lopHoc.inDSGVGD();
    }
}