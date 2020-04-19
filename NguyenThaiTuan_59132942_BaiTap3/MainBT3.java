
package NguyenThaiTuan_59132942_BaiTap3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;
import NguyenThaiTuan_59132942_BaiTap3.QLSV;
import java.text.ParseException;

public class MainBT3 {

    public static void main(String[] args) throws ParseException{
       QLSV qldsSV = new QLSV();
       SinhVien sv1 = new SinhVien("Nguyen Thai Tuan",new SimpleDateFormat("dd/MM/yy").parse("09/10/1999"),10);
       SinhVien sv2 = new SinhVien("Nguyen Thai Thinh",new SimpleDateFormat("dd/MM/yy").parse("01/03/1999"),9);
       SinhVien sv3 = new SinhVien("Nguyen Thi Ngoc Lan",new SimpleDateFormat("dd/MM/yy").parse("02/05/1999"),7);
       SinhVien sv4 = new SinhVien("Nguyen Thi Ngoc Tram",new SimpleDateFormat("dd/MM/yy").parse("02/06/1999"),8);
     
       qldsSV.themSV(sv1);
       qldsSV.themSV(sv2);
       qldsSV.themSV(sv3);
       qldsSV.themSV(sv4);
       
        System.out.println("-----------------DSSV khoi tao------------------- ");
        qldsSV.inDS();
        
        ISoSanh ssSinhVienTheoDiem = new SoSanhTheoDiem();
        ISoSanh ssSinhVienTheoTen = new SoSanhTheoTen();
        
        qldsSV.setSoSanh(ssSinhVienTheoDiem);
        qldsSV.sapXep();
        System.out.println("--------------DSSV sap xep theo ten----------------");
        qldsSV.inDS();
        
        qldsSV.setSoSanh(ssSinhVienTheoTen);
        qldsSV.sapXep();
         System.out.println("--------------DSSV sap xep theo diem----------------");
        qldsSV.inDS();
    }
    
}
