package models;


public class Customer extends Person {
    private String guestType;
    private String address;

    public Customer() {
    }

    @Override
    public String testToString() {
        return null;
    }
//    @Override
//    public String testToString() {
//        return  guestType +
//                "," + address +
//                "," + getCode() +
//                "," + getFullName() +
//                "," + getGenDer() +
//                "," + getId() +
//                "," + getNumberPhone() +
//                "," + getEmail();
//    }


    public Customer(int code, String fullName, String genDer, int id, int numberPhone, String email, String guestType, String address) {
        super(code, fullName, genDer, id, numberPhone, email);
        this.guestType = guestType;
        this.address = address;
    }


    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer co kieu khach: " + guestType +
                ", id: " + getId() +
                ", dia chi: " + address +
                ", co ma so: " + getCode() +
                ", Ho ten: " + getFullName() +
                ", Gioi tinh: " + getGenDer() +
                ", SDT: " + getNumberPhone() +
                ", Email: " + getEmail();


    }
}