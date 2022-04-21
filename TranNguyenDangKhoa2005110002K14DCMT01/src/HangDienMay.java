public class HangDienMay extends HangHoa{
    
    private double congsuat;
    private int baohanh;
    
    public HangDienMay(String mahang, String tenhanghoa, double soluong, double dongia, double congsuat, int baohanh) {
        super(mahang, tenhanghoa, soluong, dongia);
        this.congsuat = congsuat;
        this.baohanh = baohanh;
    }

    public double getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(double congsuat) {
        if(congsuat > 0){
            this.congsuat = congsuat;
        }else{
            System.out.println("Cong suat khong hop le");
        }
        
    }

    public double getBaohanh() {
        return baohanh;
    }

    public void setBaohanh(int baohanh) {
        if(baohanh > 0){
            this.baohanh = baohanh;
        }else{
            System.out.println("Thoi gian bao hanh khong hop le!");
        }
        
    }

    @Override
    public String toString() {
        String str;
        str = super.toString() + "  " + "Cong suat: " + congsuat + "  " + "Bao hanh(nam): " + baohanh;
        return str;
    }

    

}
