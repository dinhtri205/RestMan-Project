package controller;

import dao.DishDAO0;
import model.Dish0;
import java.util.List;

public class DishController0 {
    private DishDAO0 dishDAO;

    public DishController0() {
        this.dishDAO = new DishDAO0();
    }

    // Tiếp nhận yêu cầu tìm kiếm món ăn từ giao diện
    public List<Dish0> searchFood(String name) {
        return dishDAO.findByName(name);
    }

    // Kiểm tra tính hợp lệ của dữ liệu trước khi lưu
    public boolean validateFood(Dish0 food) {
        if (food.getFoodName() == null || food.getFoodName().trim().isEmpty()) {
            return false;
        }
        if (food.getPrice() <= 0) {
            return false;
        }
        return true;
    }

    // Tiếp nhận yêu cầu cập nhật thông tin món ăn
    public boolean updateFood(Dish0 food) {
        if (validateFood(food)) {
            return dishDAO.updateDish(food);
        }
        return false;
    }
}