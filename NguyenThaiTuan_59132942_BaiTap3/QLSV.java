
package NguyenThaiTuan_59132942_BaiTap3;

import java.util.ArrayList;
import java.util.Collections;


public class QLSV {
    ISoSanh soSanh;
    ArrayList<SinhVien> dsSV = new ArrayList<>();

    public QLSV() {
    }

    public QLSV(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }

    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }
    
    public void sapXep(){
        SinhVien ssSV;
        for(int i = 0;i<dsSV.size() -1;i++)
            for(int j = i+1;j<dsSV.size();j++)
            {
                if(soSanh.soSanh(dsSV.get(i), dsSV.get(j))>0);
                Collections.swap(dsSV, i, j);
            }
    }
    
    public void inDS(){
        for(int i=0;i<dsSV.size();i++)
        {
            dsSV.get(i).hienthiTT();
        } 
           
    }
    
    public void themSV(SinhVien addSV){
        dsSV.add(addSV);
    }
}
