package model;

public class OrderItem0 {
    private int orderDetailId;
    private int orderId;
    private int foodId;
    private int quantity;
    private double unitPrice;

    public OrderItem0() {}

    // Tính thành tiền của từng món (số lượng * đơn giá)
    public double calculateSubtotal() {
        return this.quantity * this.unitPrice;
    }

    // Getters và Setters
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }
}