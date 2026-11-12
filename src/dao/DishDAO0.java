package dao;

import model.Dish0;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

public class DishDAO0 extends DAO0 {
    
    // Phương thức tìm kiếm món ăn theo tên trong CSDL
    public List<Dish0> findByName(String name) {
        List<Dish0> listDish = new ArrayList<>();
        // TODO: Viết câu lệnh SQL SELECT * FROM tblDish0 WHERE foodName LIKE ?
        // Thực thi truy vấn và ánh xạ dữ liệu vào listDish
        return listDish;
    }

    // Phương thức lấy thông tin chi tiết một món ăn bằng ID
    public Dish0 findById(int id) {
        Dish0 dish = null;
        // TODO: SQL SELECT * FROM tblDish0 WHERE foodId = ?
        return dish;
    }

    // Phương thức cập nhật thông tin món ăn vào CSDL
    public boolean updateDish(Dish0 food) {
        boolean isSuccess = false;
        // TODO: SQL UPDATE tblDish0 SET foodName=?, price=?, categoryId=?, description=?, image=?, status=? WHERE foodId=?
        // Thực thi PreparedStatement và trả về true nếu số dòng bị ảnh hưởng > 0
        return isSuccess;
    }
}