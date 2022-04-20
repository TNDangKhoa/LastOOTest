import java.util.List;
import java.util.ArrayList;

public class DSHangHoa {
    private List<HangHoa> danhSach = new ArrayList<>();

    public static ArrayList<HangHoa> danhSachHangHoa(){
        ArrayList<HangHoa> dsHangHoa = new ArrayList<HangHoa>();
        dsHangHoa.add(new HangHoa("TP01", "Trung", 12, 10000));
        dsHangHoa.add(new HangHoa("TP02", "ca rot", 4, 12000));
        dsHangHoa.add(new HangHoa("TP03", "khoai tay", 2, 9000));
        dsHangHoa.add(new HangHoa("DM01", "Tu lanh", 3, 15000000));
        dsHangHoa.add(new HangHoa("DM02", "May giat", 4, 1000000));
        dsHangHoa.add(new HangHoa("DM03", "May lanh", 3, 18000000));
        dsHangHoa.add(new HangHoa("SS01", "Chen su", 20, 10000));
        dsHangHoa.add(new HangHoa("SS02", "Muong su", 17, 10000));
        dsHangHoa.add(new HangHoa("SS03", "Dia su", 21, 10000));
        dsHangHoa.add(new HangHoa("SS04", "Binh su", 25, 10000));
        return dsHangHoa;
    }

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
