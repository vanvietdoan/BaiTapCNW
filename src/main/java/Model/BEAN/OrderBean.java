package Model.BEAN;

import java.sql.Date;

public class OrderBean {
    private int orderId;
    private int userId;
    private Date orderDate;
    private double totalPrice;
    
    public OrderBean() {
    	
    }
    
    public OrderBean(int orderId, int userId, Date orderDate, double totalPrice) {
    	this.orderId = orderId;
    	this.userId = userId;
    	this.orderDate = orderDate;
    	this.totalPrice = totalPrice;
    }

    // Getters and setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
