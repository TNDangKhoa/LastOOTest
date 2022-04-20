import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HangHoaTestDrive {
    public static void main(String[] args) throws ParseException {
        System.out.println("CHUONG TRINH QUAN LI HANG HOA");
		System.out.println(">>>>>>>>>>>>>MENU<<<<<<<<<<<<<");
        System.out.println("1. Them hang hoa");
        System.out.println("2. Tim kiem");
        System.out.println("3. Show danh sach");
        System.out.println("4. Sua thong tin hang hoa");
        System.out.println("5. Xoa hang hoa");

        DSHangHoa dsHangHoa = new DSHangHoa();
        Scanner nhap = InputSupport.nhap;
        String nhapTiep = null;

        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

        int choice;
        System.out.println("Chon tinh nang(1-3): ");
        choice = nhap.nextInt();
        nhap.nextLine();
        switch (choice){
            case 1: 
            do {
                System.out.print("Nhap ma hang: ");
                String mahang = nhap.nextLine();
                System.out.print("Nhap ten hang hoa: ");
                String tenhanghoa = nhap.nextLine();
                System.out.print("Nhap so luong: ");
                Double soluong = nhap.nextDouble();
                nhap.nextLine();
                System.out.print("Nhap don gia: ");
                double dongia = nhap.nextDouble();
                System.out.print("Nhap loai hang(1 - Hang thuc pham, 2 - Hang sanh su, 3 - Hang dien may): ");
                int loai = nhap.nextInt();
                nhap.nextLine();
    
                if (loai == 1) {
                    System.out.print("Nhap ngay san xuat");
                    Date nSX = date.parse(nhap.nextLine());
                    System.out.print("Nhap han su dung");
                    Date hSD = date.parse(nhap.nextLine());
                    HangThucPham hangTP = new HangThucPham(mahang, tenhanghoa, soluong, dongia, nSX, hSD);
                    dsHangHoa.them(hangTP);
                }else{
                    if (loai == 2) {
                        System.out.println("Nhap ngay nhap kho: ");
                        Date ngayNhapKho = date.parse(nhap.nextLine());
                        System.out.println("Nhap nha san xuat: ");
                        String nhaSX = nhap.nextLine();
                        HangSanhSu hangSanhSu = new HangSanhSu(mahang, tenhanghoa, soluong, dongia, ngayNhapKho, nhaSX);
                        dsHangHoa.them(hangSanhSu);
                    }else{
                        if (loai == 3){
                            System.out.println("Nhap cong suat: ");
                            Double congsuat = nhap.nextDouble();
                            System.out.println("Nhap Bao hanh: ");
                            int baohanh = nhap.nextInt();
                            nhap.nextLine();
                            HangDienMay hangDienMay = new HangDienMay(mahang, tenhanghoa, soluong, dongia, congsuat, baohanh);
                            dsHangHoa.them(hangDienMay);
                        }
                    }
                }
                System.out.print("May co muon nhap nua khong Y/N>>");
                nhapTiep = nhap.nextLine();
            } while (nhapTiep.equals("Y"));
            break;
            case 2:
            System.out.println("Nhap ma hang can tim: ");
            String maHang = nhap.nextLine();
            HangHoa SearchHangHoa = dsHangHoa.timKiemHangHoaTheoMa(maHang);
            System.out.println(SearchHangHoa);
            break;
            case 3:
            dsHangHoa.inDS();
            break;
            case 4:
            System.out.println("Nhap ma hang can sua: ");
            String maHangThem = nhap.nextLine();
            HangHoa suaHangHoa = dsHangHoa.timKiemHangHoaTheoMa(maHangThem);
            dsHangHoa.xoa(suaHangHoa);

            System.out.print("Nhap ma hang: ");
                String mahang = nhap.nextLine();
                System.out.print("Nhap ten hang hoa: ");
                String tenhanghoa = nhap.nextLine();
                System.out.print("Nhap so luong: ");
                Double soluong = nhap.nextDouble();
                nhap.nextLine();
                System.out.print("Nhap don gia: ");
                double dongia = nhap.nextDouble();
                System.out.print("Nhap loai hang(1 - Hang thuc pham, 2 - Hang sanh su, 3 - Hang dien may): ");
                int loai = nhap.nextInt();
                nhap.nextLine();
    
                if (loai == 1) {
                    System.out.print("Nhap ngay san xuat");
                    Date nSX = date.parse(nhap.nextLine());
                    System.out.print("Nhap han su dung");
                    Date hSD = date.parse(nhap.nextLine());
                    HangThucPham hangTP = new HangThucPham(mahang, tenhanghoa, soluong, dongia, nSX, hSD);
                    dsHangHoa.them(hangTP);
                }else{
                    if (loai == 2) {
                        System.out.println("Nhap ngay nhap kho: ");
                        Date ngayNhapKho = date.parse(nhap.nextLine());
                        System.out.println("Nhap nha san xuat: ");
                        String nhaSX = nhap.nextLine();
                        HangSanhSu hangSanhSu = new HangSanhSu(mahang, tenhanghoa, soluong, dongia, ngayNhapKho, nhaSX);
                        dsHangHoa.them(hangSanhSu);
                    }else{
                        if (loai == 3){
                            System.out.println("Nhap cong suat: ");
                            Double congsuat = nhap.nextDouble();
                            System.out.println("Nhap Bao hanh: ");
                            int baohanh = nhap.nextInt();
                            nhap.nextLine();
                            HangDienMay hangDienMay = new HangDienMay(mahang, tenhanghoa, soluong, dongia, congsuat, baohanh);
                            dsHangHoa.them(hangDienMay);
                        }
                    }
                }
            break;
            case 5:
            System.out.println("Nhap ma hang can xoa: ");
            String maHangXoa = nhap.nextLine();
            HangHoa delete = dsHangHoa.timKiemHangHoaTheoMa(maHangXoa);
            dsHangHoa.xoa(delete);
            break;

        }
    }
}
