package services.ImpI;


import models.*;
import services.FacilityService;
import until.FacilitylUntil;
import until.SaveAndDisplayData;

import java.io.IOException;
import java.util.*;

public class FacilityServiceIpl extends Facility implements FacilityService {
    private static Scanner scanner = new Scanner(System.in);
    String link = "";
    List<String[]> list = new ArrayList<>();
    Map<Villa, Integer> villaMap = new LinkedHashMap<>();
    Map<House, Integer> houseMap = new LinkedHashMap<>();
    Map<Room, Integer> roomMap = new LinkedHashMap<>();


    @Override
    public void display() {
        list = SaveAndDisplayData.readerFile("src/Data/Villa.csv");
        villaMap.clear();
        for (String[] item : list) {
            Villa villa = new Villa(item[0],
                    Integer.parseInt(item[1]),
                    Integer.parseInt(item[2]),
                    Integer.parseInt(item[3]),
                    item[4],
                    item[5],
                    Integer.parseInt(item[6]),
                    Integer.parseInt(item[7]));
            int value =  Integer.parseInt(item[8]);
            villaMap.put(villa, value);
        }
        for (Map.Entry<Villa, Integer> item : villaMap.entrySet()
        ) {
            System.out.println(item.getKey()+" số lần sử dụng: "+item.getValue());
        }
        list.clear();
        list = SaveAndDisplayData.readerFile("src/Data/House.csv");
        houseMap.clear();
        for (String[] item : list) {
            House house = new House(item[0],
                    Integer.parseInt(item[1]),
                    Integer.parseInt(item[2]),
                    Integer.parseInt(item[3]),
                    item[4],
                    item[5],
                    Integer.parseInt(item[6]));
            int value =  Integer.parseInt(item[7]);
            houseMap.put(house, value);
        }
        for (Map.Entry<House, Integer> item : houseMap.entrySet()
        ) {
            System.out.println(item.getKey()+" số lần sử dụng: "+item.getValue());
        }
        list.clear();
        list = SaveAndDisplayData.readerFile("src/Data/Room.csv");
        roomMap.clear();
        for (String[] item : list) {
            Room room = new Room(item[0],
                    Integer.parseInt(item[1]),
                    Integer.parseInt(item[2]),
                    Integer.parseInt(item[3]),
                    item[4],
                    item[5]);
            int value =  Integer.parseInt(item[6]);
            roomMap.put(room, value);
        }
        for (Map.Entry<Room, Integer> item : roomMap.entrySet()
        ) {
            System.out.println(item.getKey()+" số lần sử dụng: "+item.getValue());
        }
    }

    @Override
    public void add()  {
        do {
            try {
                System.out.println("1.Add New Villa\n" +
                        "2.Add New House\n" +
                        "3.Add New Room\n" +
                        "4.Return main menu\n");
                System.out.println("Nhập để chọn tính năng: ");
                int choose21 = Integer.parseInt(scanner.nextLine());
                switch (choose21) {
                    case 1:
                        System.out.println("====Add New Villa====");
                        addVila();
                        break;
                    case 2:
                        System.out.println("====Add New House====");
                        addHouse();
                        break;
                    case 3:
                        System.out.println("====Add New Room====");
                        addRoom();
                        break;
                    case 4:
                        return;
                    default:
                        System.err.println("Chức năng này hiện ko có");
                }
            } catch (Exception e) {
                System.err.println("Sai định dạng mời nhập lại");
            }
        } while (true);
    }


    public void addVila() throws IOException {
        list = SaveAndDisplayData.readerFile("src/Data/Villa.csv");
        villaMap.clear();
        for (String[] item : list) {
            Villa villa = new Villa(item[0],
                    Integer.parseInt(item[1]),
                    Integer.parseInt(item[2]),
                    Integer.parseInt(item[3]),
                    item[4],
                    item[5],
                    Integer.parseInt(item[6]),
                    Integer.parseInt(item[7]));
            villaMap.put(villa, 0);
        }
        System.out.print("Nhập tên dịch vụ : ");
        String serviceName = scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        int area = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chi phí thuê ");
        int costs = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số người thuê ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kiểu thuê : ");
        String rental = scanner.nextLine();
        System.out.print("Nhập tiêu chuẩn phòng: ");
        String room = FacilitylUntil.romStandard();
        System.out.print("Nhập diện tích hồ bơi ");
        int pool = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số tầng ");
        int Floors = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(serviceName, area, costs, people, rental, room, pool, Floors);
        villaMap.put(villa, 0);
        String line = "";
        for (Map.Entry<Villa, Integer> item : villaMap.entrySet()
        ) {
            line += item.getKey().getServiceName() +
                    "," + item.getKey().getUsableArea() +
                    "," + item.getKey().getRentalCosts() +
                    "," + item.getKey().getPeopleMaximum() +
                    "," + item.getKey().getRentalType2() +
                    "," + item.getKey().getRomStandard() +
                    "," + item.getKey().getPoolArea() +
                    "," + item.getKey().getNumberFloors() +
                    "," + item.getValue() + "\n";
        }
        SaveAndDisplayData.writeFile("src/Data/Villa.csv", line);
        System.out.println("Thêm thành công");
    }

    public void addHouse() throws IOException {
        list = SaveAndDisplayData.readerFile("src/Data/House.csv");
        houseMap.clear();
        for (String[] item : list) {
            House house = new House(item[0],
                    Integer.parseInt(item[1]),
                    Integer.parseInt(item[2]),
                    Integer.parseInt(item[3]),
                    item[4],
                    item[5],
                    Integer.parseInt(item[6]));
            houseMap.put(house, 0);
        }
        System.out.print("Nhập tên dịch vụ : ");
        String serviceName = scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        int area = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chi phí thuê ");
        int costs = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số người thuê ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kiểu thuê : ");
        String rental = scanner.nextLine();
        System.out.print("Nhập tiêu chuẩn phòng: ");
        String room = FacilitylUntil.romStandard();
        System.out.print("Nhập số tầng ");
        int Floors = Integer.parseInt(scanner.nextLine());
        House house = new House(serviceName, area, costs, people, rental, room, Floors);
        houseMap.put(house, 0);
        String line = "";
        for (Map.Entry<House, Integer> item : houseMap.entrySet()
        ) {
            line += item.getKey().getServiceName() +
                    "," + item.getKey().getUsableArea() +
                    "," + item.getKey().getRentalCosts() +
                    "," + item.getKey().getPeopleMaximum() +
                    "," + item.getKey().getRentalType2() +
                    "," + item.getKey().getRomStandard() +
                    "," + item.getKey().getNumberFloors() +
                    "," + item.getValue() + "\n";
        }
        SaveAndDisplayData.writeFile("src/Data/House.csv", line);
        System.out.println("Thêm thành công");
    }

    public void addRoom() throws IOException {
        list = SaveAndDisplayData.readerFile("src/Data/Room.csv");
        roomMap.clear();
        for (String[] item : list) {
            Room room = new Room(item[0],
                    Integer.parseInt(item[1]),
                    Integer.parseInt(item[2]),
                    Integer.parseInt(item[3]),
                    item[4],
                    item[5]);
            roomMap.put(room, 0);
        }
        System.out.print("Nhập tên dịch vụ : ");
        String serviceName = scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        int area = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chi phí thuê ");
        int costs = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số người thuê ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kiểu thuê : ");
        String rental = scanner.nextLine();
        System.out.print("Nhập dịch vụ miễn phí : ");
        String Free = scanner.nextLine();
        Room room = new Room(serviceName, area, costs, people, rental, Free);
        roomMap.put(room, 0);
        String line = "";
        for (Map.Entry<Room, Integer> item : roomMap.entrySet()
        ) {
            line += item.getKey().getServiceName() +
                    "," + item.getKey().getUsableArea() +
                    "," + item.getKey().getRentalCosts() +
                    "," + item.getKey().getPeopleMaximum() +
                    "," + item.getKey().getRentalType2() +
                    "," + item.getKey().getServiceFree() +
                    "," + item.getValue() + "\n";
        }
        SaveAndDisplayData.writeFile("src/Data/Room.csv", line);
        System.out.println("Thêm thành công");
    }

    @Override
    public void displayMaintenance() {
        list = SaveAndDisplayData.readerFile("src/Data/Villa.csv");
        villaMap.clear();
        for (String[] item : list) {
            Villa villa = new Villa(item[0],
                    Integer.parseInt(item[1]),
                    Integer.parseInt(item[2]),
                    Integer.parseInt(item[3]),
                    item[4],
                    item[5],
                    Integer.parseInt(item[6]),
                    Integer.parseInt(item[7]));
            int value =  Integer.parseInt(item[8]);
            villaMap.put(villa, value);
        }
        for (Map.Entry<Villa, Integer> item : villaMap.entrySet()
        ) {
            if (item.getValue()>=5){
            System.out.println(item.getKey()+" số lần sử dụng: "+item.getValue());
            }
        }
        list.clear();
        list = SaveAndDisplayData.readerFile("src/Data/House.csv");
        houseMap.clear();
        for (String[] item : list) {
            House house = new House(item[0],
                    Integer.parseInt(item[1]),
                    Integer.parseInt(item[2]),
                    Integer.parseInt(item[3]),
                    item[4],
                    item[5],
                    Integer.parseInt(item[6]));
            int value =  Integer.parseInt(item[7]);
            houseMap.put(house, value);
        }
        for (Map.Entry<House, Integer> item : houseMap.entrySet()
        ) {
            if (item.getValue()>=5){
                System.out.println(item.getKey()+" số lần sử dụng: "+item.getValue());
            }
        }
        list.clear();
        list = SaveAndDisplayData.readerFile("src/Data/Room.csv");
        roomMap.clear();
        for (String[] item : list) {
            Room room = new Room(item[0],
                    Integer.parseInt(item[1]),
                    Integer.parseInt(item[2]),
                    Integer.parseInt(item[3]),
                    item[4],
                    item[5]);
            int value =  Integer.parseInt(item[6]);
            roomMap.put(room, value);
        }
        for (Map.Entry<Room, Integer> item : roomMap.entrySet()
        ) {
            if (item.getValue()>=5){
                System.out.println(item.getKey()+" số lần sử dụng: "+item.getValue());
            }
        }
    }

    @Override
    public void update() {

    }

}
