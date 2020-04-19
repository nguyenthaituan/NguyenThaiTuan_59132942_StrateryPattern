
package NguyenThaiTuan_59132942_BaiTap2;


public class ThanhToanOnline implements IThanhToan{

    @Override
    public double thanhtoan(int tienHang) {
        if(tienHang<1000000) return (double)tienHang*0.95;
        return tienHang*0.93;
    }
    
}
