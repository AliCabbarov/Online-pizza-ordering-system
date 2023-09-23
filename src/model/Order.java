package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {
    private long id;
    private String pizzaName;
    private String pizzaSize;
    private String sous;
    private BigDecimal price;
    private LocalDateTime startTime;
    private LocalDateTime deliveryTime;
    private Customer customer;
    private Courier courier;
    private boolean deliveryStatus;

    public Order(long id, String pizzaName, String pizzaSize, String sous, BigDecimal price, LocalDateTime startTime, LocalDateTime deliveryTime, Customer customer, Courier courier, boolean deliveryStatus) {
        this.id = id;
        this.pizzaName = pizzaName;
        this.pizzaSize = pizzaSize;
        this.sous = sous;
        this.price = price;
        this.startTime = startTime;
        this.deliveryTime = deliveryTime;
        this.customer = customer;
        this.courier = courier;
        this.deliveryStatus = deliveryStatus;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getSous() {
        return sous;
    }

    public void setSous(String sous) {
        this.sous = sous;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public boolean isDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(boolean deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", pizzaName='" + pizzaName + '\'' +
                ", pizzaSize='" + pizzaSize + '\'' +
                ", sous='" + sous + '\'' +
                ", price=" + price +
                ", startTime=" + startTime +
                ", deliveryTime=" + deliveryTime +
                ", customer=" + customer.getName() +
                ", courier=" + courier.getName() +
                ", deliveryStatus=" + deliveryStatus +
                '}';
    }
}
