import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham extends HangHoa{
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

    private Date NSX;
    private Date HSD;
    
    public HangThucPham(String mahang, String tenhanghoa, double soluong, double dongia, Date nSX, Date hSD) {
        super(mahang, tenhanghoa, soluong, dongia);
        NSX = nSX;
        HSD = hSD;
    }

    public Date getNSX() {
        return NSX;
    }

    public void setNSX(Date nSX) {
        NSX = nSX;
    }

    public Date getHSD() {
        return HSD;
    }

    public void setHSD(Date hSD) {
        HSD = hSD;
    }

    @Override
    public String toString() {
        return "HangThucPham [HSD=" + date.format(NSX) + ", NSX=" + date.format(HSD) + "]" + super.toString();
    }

    
}
