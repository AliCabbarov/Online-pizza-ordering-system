package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Customer {
    private long id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String password;
    private long orderId;
    private BigDecimal moneyAccount;
    private LocalDateTime registrationDate;
    private int status;

    public Customer(long id, String name, String surname, String phoneNumber, String email, String password, long orderId, BigDecimal moneyAccount, LocalDateTime registrationDate, int status) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.orderId = orderId;
        this.moneyAccount = moneyAccount;
        this.registrationDate = registrationDate;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getMoneyAccount() {
        return moneyAccount;
    }

    public void setMoneyAccount(BigDecimal moneyAccount) {
        this.moneyAccount = moneyAccount;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", orderId=" + orderId +
                ", moneyAccount=" + moneyAccount +
                ", registrationDate=" + registrationDate +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && orderId == customer.orderId && status == customer.status && Objects.equals(name, customer.name) && Objects.equals(surname, customer.surname) && Objects.equals(phoneNumber, customer.phoneNumber) && Objects.equals(email, customer.email) && Objects.equals(password, customer.password) && Objects.equals(moneyAccount, customer.moneyAccount) && Objects.equals(registrationDate, customer.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, phoneNumber, email, password, orderId, moneyAccount, registrationDate, status);
    }
}
