package dao;

import model.Order0;
import model.OrderItem0;
import java.util.List;

public class OrderDAO0 extends DAO0 {

    // Phương thức lưu thông tin đơn hàng mới vào CSDL
    public boolean saveOrder(Order0 order) {
        // TODO: SQL INSERT INTO tblOrder0 (customerId, tableId, orderDate, totalAmount, status)
        // Lấy orderId vừa tạo trả về để gán cho các OrderItem0
        return true;
    }

    // Phương thức lưu danh sách chi tiết các món ăn trong đơn hàng
    public boolean saveOrderDetails(List<OrderItem0> details) {
        // TODO: Sử dụng Batch Processing (addBatch, executeBatch) để INSERT nhiều OrderItem0 cùng lúc
        return true;
    }
}