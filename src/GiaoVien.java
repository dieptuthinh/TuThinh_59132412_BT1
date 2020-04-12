package caclop;

public class GiaoVien extends CaNhan 
{
    private String monDay;
    private String toBoMon;

    public GiaoVien(){
        super();
    }

    public GiaoVien(String monDay, String toBoMon) {
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public GiaoVien(String hoTen, int tuoi, String diaChi, String sdt, String monDay, String toBoMon) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienThiTT() {
        String info;
        info = "Ho va ten: " + hoTen + ", Tuoi: " + tuoi + ", Dia chi: " + diaChi
        + ", So dien thoai : " + sdt + ", Mon giang day: " + monDay + ", To bo mon: " + toBoMon;
        System.out.println(info);
        return info;
    }

}