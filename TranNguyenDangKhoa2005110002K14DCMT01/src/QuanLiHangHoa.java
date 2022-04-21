import java.util.List;
import java.util.ArrayList;

public class QuanLiHangHoa {
    private List<HangHoa> danhSach = new ArrayList<>();

    public void them(HangHoa hangHoa){
        danhSach.add(hangHoa);
    }

    public void inDS(){
        for (HangHoa hangHoa:danhSach){
            System.out.println(hangHoa);
        }
    }

    public void xoa(HangHoa hangHoa){
        danhSach.remove(hangHoa);
    }

    public void suaHangHoa(int ViTri, HangHoa hangHoa){
        danhSach.set(ViTri, hangHoa);
    }

    public HangHoa timKiemHangHoaTheoMa(String maHang){
        
        HangHoa hangHoa = null;

        for (HangHoa h : danhSach) {
            if(h.getMahang().equals(maHang)){
                hangHoa = h;
            }
        }

        return hangHoa;

    }

}
