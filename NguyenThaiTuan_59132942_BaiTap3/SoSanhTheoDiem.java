
package NguyenThaiTuan_59132942_BaiTap3;


public class SoSanhTheoDiem implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if(o1.getDiemTB()==o2.getDiemTB()) return 0;
        else {
            if(o1.getDiemTB() > o2.getDiemTB()) return 1;
        }
        return -1;
    }
    
}
