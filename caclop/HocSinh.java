package caclop;

public class HocSinh extends CaNhan
{
    private String lop;
    private String nangKhieu;

    public HocSinh(String lop, String nangKhieu) {
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public HocSinh() {
        super();
    }

    public HocSinh(String hoTen, int tuoi, String diaChi, String sdt, String lop, String nangKhieu) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

    @Override
    public String HienThiTT() {
        String info;
        info = "Ho va ten: " + hoTen + ", Tuoi: " + tuoi + ", Dia chi: " + diaChi
        + ", So dien thoai: " + sdt + ", Lop: " + lop + ", Nang khieu: " + nangKhieu ;

        System.out.println(info);
        return info;
    }

    
}