package models;

public class House extends Facility {
    private String romStandard;//tieu chuan phong...
    private int numberFloors;// so tang ...

    public House() {

    }

    public House(String romStandard, int numberFloors) {
        this.romStandard = romStandard;
        this.numberFloors = numberFloors;
    }

    public House(String serviceName, int usableArea, int rentalCosts, int peopleMaximum, String rentalType, String romStandard, int numberFloors) {
        super(serviceName, usableArea, rentalCosts, peopleMaximum, rentalType);
        this.romStandard = romStandard;
        this.numberFloors = numberFloors;
    }

    public String getRomStandard() {
        return romStandard;
    }

    public void setRomStandard(String romStandard) {
        this.romStandard = romStandard;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "House tiêu chuẩn phòng: " + romStandard +
                " so tang: " + numberFloors +
                " Tên dịch vụ: " + getServiceName() +
                " Diện tích sử dụng: " + getUsableArea() +
                " Chi phí thuê: " + getRentalCosts() +
                " Sô người ở tối đa:" + getPeopleMaximum() +
                " Kiểu thuê: " + getRentalType2();
    }
}
