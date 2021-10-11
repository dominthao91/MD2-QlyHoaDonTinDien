package model;

public class User {
    private  String fullName;
    private  String address;
    private String codeElectric;
    private ElectricBill electricBill;

    public User() {
    }

    public User(String fullName, String homeNumber, String codeElectric) {
        this.fullName = fullName;
        this.address = homeNumber;
        this.codeElectric = codeElectric;
    }

    public User(String fullName, String address, String codeElectric, ElectricBill electricBill) {
        this.fullName = fullName;
        this.address = address;
        this.codeElectric = codeElectric;
        this.electricBill = electricBill;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCodeElectric() {
        return codeElectric;
    }

    public void setCodeElectric(String codeElectric) {
        this.codeElectric = codeElectric;
    }

    public ElectricBill getElectricBill() {
        return electricBill;
    }

    public void setElectricBill(ElectricBill electricBill) {
        this.electricBill = electricBill;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", codeElectric='" + codeElectric + '\'' +
                ", oldCodeElictric =" + electricBill.getOldElectric() +", newCodeElictric =" +electricBill.getNewElectric()+
                '}';
    }
}
