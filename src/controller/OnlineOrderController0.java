package controller;

import dao.OrderDAO0;
import model.Order0;

public class OnlineOrderController0 {
    private OrderDAO0 orderDAO;

    public OnlineOrderController0() {
        this.orderDAO = new OrderDAO0();
    }

    // Xác thực đơn đặt món trước khi thanh toán/lưu
    public boolean validateOrder(Order0 order) {
        if (order.getItems() == null || order.getItems().isEmpty()) {
            return false; // Giỏ hàng rỗng
        }
        return true;
    }

    // Tạo đơn hàng mới và gọi DAO lưu vào hệ thống
    public boolean createOrder(Order0 order) {
        if (validateOrder(order)) {
            // Lưu bảng Order0
            boolean orderSaved = orderDAO.saveOrder(order);
            if (orderSaved) {
                // Lưu tiếp danh sách OrderItem0
                return orderDAO.saveOrderDetails(order.getItems());
            }
        }
        return false;
    }
}