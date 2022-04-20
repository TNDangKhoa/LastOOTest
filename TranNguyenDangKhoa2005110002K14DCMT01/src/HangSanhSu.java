import java.util.Date;

public class HangSanhSu extends HangHoa{
    private Date ngayNhapKho;
    private String nhaSX;
    
    public HangSanhSu(String mahang, String tenhanghoa, double soluong, double dongia, Date ngayNhapKho, String nhaSX) {
        super(mahang, tenhanghoa, soluong, dongia);
        this.ngayNhapKho = ngayNhapKho;
        this.nhaSX = nhaSX;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    public String getNgaySX() {
        return nhaSX;
    }

    public void setNgaySX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    @Override
    public String toString() {
        return "HangSanhSu [ngayNhapKho=" + ngayNhapKho + ", ngayXuatKho=" + nhaSX + "]" + super.toString();
    }

    
}
