package model;

public class ElectricBill {
    private User user;
    private int oldElectric;
    private  int newElectric;
    private double price;

    public ElectricBill() {
    }

    public ElectricBill(int oldElectric, int newElectric) {
        this.oldElectric = oldElectric;
        this.newElectric = newElectric;
    }

    public ElectricBill(User user, int oldElectric, int newElectric, double price) {
        this.user = user;
        this.oldElectric = oldElectric;
        this.newElectric = newElectric;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getOldElectric() {
        return oldElectric;
    }

    public void setOldElectric(int oldElectric) {
        this.oldElectric = oldElectric;
    }

    public int getNewElectric() {
        return newElectric;
    }

    public void setNewElectric(int newElectric) {
        this.newElectric = newElectric;
    }

    public double getPrice() {
        return price = (newElectric-oldElectric)*750;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "user=" + user +
                ", oldElectric=" + oldElectric +
                ", newElectric=" + newElectric +
                ", price=" + price +
                '}';
    }
}
