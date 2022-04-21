package QuanLiHang;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangSanhSu extends HangHoa{
    private Date ngayNhapKho;
    private String nhaSX;
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    
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
        String str = super.toString() + "  " + "Ngay nhap kho: " + date.format(ngayNhapKho) + "  " + "Nha SX: " + nhaSX;
        return str;
    }

    
}
