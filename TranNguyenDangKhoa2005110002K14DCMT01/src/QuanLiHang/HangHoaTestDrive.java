package QuanLiHang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HangHoaTestDrive {
    public static void main(String[] args) throws ParseException {
        
        QuanLiHangHoa dsHangHoa = new QuanLiHangHoa();
        Scanner nhap = InputSupport.nhap;
        String nhapTiep = null;

        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("CHUONG TRINH QUAN LI HANG HOA");
		System.out.println("=============FUNCTION MENU===============");
        System.out.println("1. Them hang hoa");
        System.out.println("2. Tim kiem");
        System.out.println("3. Show danh sach");
        System.out.println("4. Sua thong tin hang hoa");
        System.out.println("5. Xoa hang hoa");
        System.out.println("=========================================");

        
        //dl cho san
        HangHoa sp1 = new HangThucPham("TP01", "Trung", 12, 10_000, date.parse("12/02/2012"), date.parse("21/05/2012"));
        HangHoa sp2 = new HangThucPham("TP02", "Ca rot", 3, 11_000, date.parse("12/03/2012"), date.parse("10/05/2012"));
        HangHoa sp3 = new HangThucPham("TP03", "Khoai tay", 2, 12_000, date.parse("12/01/2012"), date.parse("13/05/2012"));
        HangHoa sp4 = new HangDienMay("DM01", "May giat", 2, 11_000_000, 1200, 3);
        HangHoa sp5 = new HangDienMay("DM02", "May lanh", 5, 15_000_000, 2200, 3);
        HangHoa sp6 = new HangDienMay("DM03", "Tu lanh", 3, 10_000_000, 800, 3);
        HangHoa sp7 = new HangSanhSu("SS01", "Binh su", 13, 3_000_000, date.parse("25/12/2015"), "Cong ty abc");
        HangHoa sp8 = new HangSanhSu("SS02", "Chen su", 10, 1_000_000, date.parse("25/12/2015"), "Cong ty abc");
        HangHoa sp9 = new HangSanhSu("SS03", "Dia su", 8, 1_000_000, date.parse("25/12/2015"), "Cong ty abc");
        HangHoa sp10 = new HangSanhSu("SS04", "Am su", 5, 2_000_000, date.parse("25/12/2015"), "Cong ty abc");

        dsHangHoa.them(sp1);
        dsHangHoa.them(sp2);
        dsHangHoa.them(sp3);
        dsHangHoa.them(sp4);
        dsHangHoa.them(sp5);
        dsHangHoa.them(sp6);
        dsHangHoa.them(sp7);
        dsHangHoa.them(sp8);
        dsHangHoa.them(sp9);
        dsHangHoa.them(sp10);
        int choice;
        System.out.println("Chon tinh nang(1-5): ");
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
                        dsHangHoa.inDS();
                    }else{
                        if (loai == 2) {
                            System.out.println("Nhap ngay nhap kho: ");
                            Date ngayNhapKho = date.parse(nhap.nextLine());
                            System.out.println("Nhap nha san xuat: ");
                            String nhaSX = nhap.nextLine();
                            HangSanhSu hangSanhSu = new HangSanhSu(mahang, tenhanghoa, soluong, dongia, ngayNhapKho, nhaSX);
                            dsHangHoa.them(hangSanhSu);
                            dsHangHoa.inDS();
                        }else{
                            if (loai == 3){
                                System.out.println("Nhap cong suat: ");
                                Double congsuat = nhap.nextDouble();
                                System.out.println("Nhap Bao hanh: ");
                                int baohanh = nhap.nextInt();
                                nhap.nextLine();
                                HangDienMay hangDienMay = new HangDienMay(mahang, tenhanghoa, soluong, dongia, congsuat, baohanh);
                                dsHangHoa.them(hangDienMay);
                                dsHangHoa.inDS();
                            }
                        }
                    }
                    System.out.print("Ban co muon nhap nua khong Y/N>>");
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
                        dsHangHoa.inDS();
                    }else{
                        if (loai == 2) {
                            System.out.println("Nhap ngay nhap kho: ");
                            Date ngayNhapKho = date.parse(nhap.nextLine());
                            System.out.println("Nhap nha san xuat: ");
                            String nhaSX = nhap.nextLine();
                            HangSanhSu hangSanhSu = new HangSanhSu(mahang, tenhanghoa, soluong, dongia, ngayNhapKho, nhaSX);
                            dsHangHoa.them(hangSanhSu);
                            dsHangHoa.inDS();
                        }else{
                            if (loai == 3){
                                System.out.println("Nhap cong suat: ");
                                Double congsuat = nhap.nextDouble();
                                System.out.println("Nhap Bao hanh: ");
                                int baohanh = nhap.nextInt();
                                nhap.nextLine();
                                HangDienMay hangDienMay = new HangDienMay(mahang, tenhanghoa, soluong, dongia, congsuat, baohanh);
                                dsHangHoa.them(hangDienMay);
                                dsHangHoa.inDS();
                            }
                        }
                    }
                break;
                case 5:
                System.out.println("Nhap ma hang can xoa: ");
                String maHangXoa = nhap.nextLine();
                HangHoa delete = dsHangHoa.timKiemHangHoaTheoMa(maHangXoa);
                dsHangHoa.xoa(delete);
                dsHangHoa.inDS();
                break;
                default:
                System.out.println("Khong co chuc nang nay!");
                break;
            }
            
        }
        
    }


