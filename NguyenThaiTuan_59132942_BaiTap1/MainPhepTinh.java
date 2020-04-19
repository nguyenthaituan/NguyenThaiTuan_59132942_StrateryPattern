
package NguyenThaiTuan_59132942_BaiTap1;


public class MainPhepTinh {

    public static void main(String[] args) {
        Context ct = new Context();
       
        ct.setTinh(new Cong());
        System.out.println("Ket qua cua 75 + 12 la: "+ct.tinh(75, 12));
        
         ct.setTinh(new Tru());
        System.out.println("Ket qua cua 54 - 78 la: "+ct.tinh(54, 78));
    }
    
}
