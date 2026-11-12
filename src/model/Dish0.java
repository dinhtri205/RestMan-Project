package model;

public class Dish0 {
    // Phạm vi private để đảm bảo tính đóng gói
    private int foodId;
    private String foodName;
    private double price;
    private String image;
    private String status;
    private int categoryId;
    private String description;

    // Constructor mặc định và có tham số
    public Dish0() {}

    public Dish0(int foodId, String foodName, double price, String image, String status, int categoryId, String description) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
        this.image = image;
        this.status = status;
        this.categoryId = categoryId;
        this.description = description;
    }

    // Các phương thức Getters và Setters
    public int getFoodId() { return foodId; }
    public void setFoodId(int foodId) { this.foodId = foodId; }

    public String getFoodName() { return foodName; }
    public void setFoodName(String foodName) { this.foodName = foodName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public int getCategoryId() { return categoryId; }
    public void setCategoryId(int categoryId) { this.categoryId = categoryId; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}