package controller;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @Since : 06/07/2021
 **/
public class Customer {
    private String name;
    private String idNumber;
    private String contactNumber;
    private String eMail;
    private String address;

    public Customer() {
    }

    public Customer(String name, String idNumber, String contactNumber, String eMail, String address) {
        this.name = name;
        this.idNumber = idNumber;
        this.contactNumber = contactNumber;
        this.eMail = eMail;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", eMail='" + eMail + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
