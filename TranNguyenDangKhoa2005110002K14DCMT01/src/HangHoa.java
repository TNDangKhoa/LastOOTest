public class HangHoa {
    private String mahang;
    private String tenhanghoa;
    private double soluong;
    private double dongia;

    
    public HangHoa() {
    }
    public HangHoa(String mahang, String tenhanghoa, double soluong, double dongia) {
        this.mahang = mahang;
        this.tenhanghoa = tenhanghoa;
        this.soluong = soluong;
        this.dongia = dongia;
    }
    public String getMahang() {
        return mahang;
    }
    public void setMahang(String mahang) {
        if(mahang != null){
            this.mahang = mahang;
        }else{
            System.out.println("Ma hang khong hop le!");
        };
        
    }
    public String getTenhanghoa() {
        return tenhanghoa;
    }
    public void setTenhanghoa(String tenhanghoa) {
        if(tenhanghoa != null){
            this.tenhanghoa = tenhanghoa;
        }else{
            System.out.println("Ten hang hoa khong hop le!");
        };
        
    }
    public double getSoluong() {
        return soluong;
    }
    public void setSoluong(double soluong) {
        if(soluong >= 0){
            this.soluong = soluong;
        }else{
            System.out.println("So luong khong hop le!");
        };
        
    }
    public double getDongia() {
        return dongia;
    }
    public void setDongia(double dongia) {
        if(dongia > 0){
            this.dongia = dongia;
        }else{
            System.out.println("Don gia khong hop le!");
        };
        
    }

    @Override
    public String toString() {
        String str = "Ma hang: " + mahang + "  " + "Ten hang: " + tenhanghoa + "  " + "So luong: " + soluong + "  " + "Don gia: " + dongia;
        return str;
    }

    
}
