
package NguyenThaiTuan_59132942_BaiTap2;

import java.util.ArrayList;

public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dshh = new ArrayList<>();

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    
    public void themHH(HangHoa hanghoa){
        dshh.add(hanghoa);
    }
    
    public int tongTienHangHoa(){
        int tong = 0;
        for(int i =0;i<dshh.size();i++)
        {
            tong+=dshh.get(i).getGia();
        }
        return tong;
    }
    
    public int tienKhachHangPhaiTra(){
        return (int) hinhThucTT.thanhtoan(tongTienHangHoa());
    }
    
    public void hienthiGioHang(){
        for(int i =0;i<dshh.size();i++){
            dshh.get(i).hienThiHangHoa();
        }
    }
    
}
