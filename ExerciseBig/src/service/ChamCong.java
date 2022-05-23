package service;

public interface ChamCong {
    public String chamCong();
    //Tạo ra 1 interface có phương thức chấm công, không nên tạo trong abstract class
    //Vì chỉ có nhân viên quản lý và sản xuất mới cần chấm công ( implements interface là xong)
    //nếu tạo phương thức abstract trong lớp employee Thì tất cả các lớp nhân viên phải overriding lại phương thức chấm công ( ở đây chỉ có nhân viên quản lý và sản xuất mới cần chấm công)
}
