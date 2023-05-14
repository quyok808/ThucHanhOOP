package Pack_B4;

import java.util.ArrayList;

/**
 * NGUYEN CONG QUY
 * 2180603884
 */
public class DSNV {
    private ArrayList<NHANVIEN> list = new ArrayList<>();

    public void ThemNV(NHANVIEN nvt){
        this.list.add(nvt);
    }
    
    public void XuatDS(){
        for(int i = 0; i < list.size(); i++){
            list.get(i).output();
            System.out.println("Luong: "+list.get(i).tinhLuong());
        }
    }
    
    public int InSLNVtrongds(){
        return list.size();
    }
}
