package models;

public class Room extends Facility {
    private String serviceFree;

    public Room() {

    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String serviceName, int usableArea, int rentalCosts, int peopleMaximum, String rentalType, String serviceFree) {
        super(serviceName, usableArea, rentalCosts, peopleMaximum, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room dịch vụ free: " + serviceFree +
                "Tên dịch vụ: " + getServiceName() +
                " Diện tích sử dụng: " + getUsableArea() +
                " Chi phí thuê: " + getRentalCosts() +
                " Sô người ở tối đa:" + getPeopleMaximum() +
                " Kiểu thuê: " + getRentalType2();
    }
}
