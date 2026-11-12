package model;

import java.util.Date;
import java.util.List;

public class Order0 {
    private int orderId;
    private int customerId;
    private int tableId;
    private Date orderDate;
    private double totalAmount;
    private String status;
    
    // Thuộc tính List thể hiện quan hệ Composition (1 Order có nhiều OrderItem)
    private List<OrderItem0> items;

    public Order0() {}

    // Phương thức tính tổng tiền của đơn hàng dựa trên danh sách món
    public double calculateTotal() {
        double total = 0;
        if (items != null) {
            for (OrderItem0 item : items) {
                total += item.calculateSubtotal();
            }
        }
        this.totalAmount = total;
        return total;
    }

    // Getters và Setters (Viết rút gọn trong báo cáo)
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public List<OrderItem0> getItems() { return items; }
    public void setItems(List<OrderItem0> items) { this.items = items; }
}