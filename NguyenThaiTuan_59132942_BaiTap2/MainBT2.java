
package NguyenThaiTuan_59132942_BaiTap2;


public class MainBT2 {

    public static void main(String[] args) {
      
        HangHoa hh1 = new HangHoa("Tom hum Alaska",100000,"ngon - bo - re");
        HangHoa hh2 = new HangHoa("Cua hoang de", 200000,"ngon - bo - re");
        HangHoa hh3 = new HangHoa("Vi ca map", 300000,"ngon - bo - re");
        HangHoa hh4 = new HangHoa("bao ngu", 400000,"ngon - bo - re");
        
        GioHang giohang1 = new GioHang();
       GioHang giohang2 = new GioHang();
       
       
//       IThanhToan ITT1 =new ThanhToanOnline();
       giohang1.setHinhThucTT(new ThanhToanOnline());
       giohang2.setHinhThucTT(new ThanhToanCOD());
       
       giohang1.themHH(hh1);
       giohang1.themHH(hh2);
       giohang1.themHH(hh3);
       
       giohang2.themHH(hh3);
       giohang2.themHH(hh4);
       
        System.out.println("***Thong tin gio hang 1: ");
        System.out.println("   Danh sach hang hoa gio hang 1: " );
        giohang1.hienthiGioHang();
        System.out.println(" Tong tien hang hoa:  "+giohang1.tongTienHangHoa());
        System.out.println(" Tong tien khach hang phai tra: "+giohang1.tienKhachHangPhaiTra());
        
       System.out.println("Thong tin gio hang 2: ");
       System.out.println("   Danh sach hang hoa gio hang 2: " );
        giohang2.hienthiGioHang();
        System.out.println("Tong tien hang hoa:  "+giohang2.tongTienHangHoa());
        System.out.println("Tong tien khach hang phai tra: "+giohang2.tienKhachHangPhaiTra());
    }
    
}
