import java.util.Scanner;

public class Main {

    public static Person[] peopleList = new Person[100];
    public static int count;
    public static boolean flag = true;
    static Scanner scanner = new Scanner(System.in);

    static {
        System.out.println("Block static");
        peopleList[0] = new Student(1, "hung", 18, "nam", 9);
        peopleList[1] = new Student(2, "dat", 19, "nữ", 10);
        peopleList[2] = new Teacher(3, "duc", 14, "nữ", 900000);
        peopleList[3] = new Teacher(4, "han", 24, "nam", 7000000);
        peopleList[4] = new Student(5, "zz", 15, "nam", 6);
        count = 5;
    }

    public static void addNewPerson() {
        System.out.println("--------------search Managemert--------------------");
        System.out.println("1.add Student");
        System.out.println("2.add Teacher");
        System.out.println("-----------------------------------------------------");
        System.out.print("chọn Options:   ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("nhập tên ");
                String nameSt = scanner.nextLine();
                System.out.println("nhập tuổi ");
                int ageSt = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập giới tính ");
                String genderSt = scanner.nextLine();
                System.out.println("nhập điểm ");
                float pointSt = Float.parseFloat(scanner.nextLine());

                Person personSt = new Student(count + 1, nameSt, ageSt, genderSt, pointSt);
                peopleList[count] = personSt;
                count++;
                break;
            case 2:
                System.out.println("nhập tên ");
                String nameTc = scanner.nextLine();
                System.out.println("nhập tuổi ");
                int ageTc = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập giới tính ");
                String genderTc = scanner.nextLine();
                System.out.println("nhập lương ");
                float salaryTC = Float.parseFloat(scanner.nextLine());

                Person personTc = new Teacher(count + 1, nameTc, ageTc, genderTc, salaryTC);
                peopleList[count] = personTc;
                count++;
                break;
        }

    }

    public static void delete() {
        System.out.println("nhập ID cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = id - 1; i < peopleList.length - 1; i++) {
            if (peopleList[i] != null) {
                peopleList[i] = peopleList[i + 1];
//                peopleList[i+1].setId( peopleList[i].getId());
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Ko tìm thấy ");
        }
    }

    public static void search() {
        System.out.println("--------------search Managemert--------------------");
        System.out.println("1.search ID");
        System.out.println("2.search Name");
        System.out.println("-----------------------------------------------------");
        System.out.print("chọn Options:   ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("nhập ID cần tìm");
                int id = Integer.parseInt(scanner.nextLine());
                for (Person value : peopleList) {
                    if (value != null && value.getId() == id) {
                        System.out.println(value);
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println("Ko tìm thấy ");
                }
                break;
            case 2:
                System.out.println("nhập Tên cần tìm");
                String name = scanner.nextLine();
                for (Person product : peopleList) {
                    if (product != null && product.getName().contains(name)) {
                        System.out.println(product);
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println("Ko tìm thấy ");
                }
                break;
        }
    }

    public static void update() {
        System.out.println("--------------search Managemert--------------------");
        System.out.println("1.update Student");
        System.out.println("2.update Teacher");
        System.out.println("-----------------------------------------------------");
        System.out.print("chọn Options:   ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                displayStudent();
                System.out.println("nhập ID cần Update");
                int idSt = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < peopleList.length; i++) {
                    if (peopleList[i] != null && peopleList[i].getId() == idSt && peopleList[i] instanceof Student) {
                        System.out.println("nhập tên ");
                        String nameSt = scanner.nextLine();
                        System.out.println("nhập tuổi ");
                        int ageSt = Integer.parseInt(scanner.nextLine());
                        System.out.println("nhập giới tính ");
                        String genderSt = scanner.nextLine();
                        System.out.println("nhập điểm ");
                        float pointSt = Float.parseFloat(scanner.nextLine());

                        Person person = new Student(i + 1, nameSt, ageSt, genderSt, pointSt);
                        peopleList[i] = person;
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println("Ko tìm thấy ");
                }

                break;
            case 2:
                displayTeacher();
                System.out.println("nhập ID cần Update");
                int idTc = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < peopleList.length; i++) {
                    if (peopleList[i] != null && peopleList[i].getId() == idTc && peopleList[i] instanceof Teacher) {
                        System.out.println("nhập tên ");
                        String nameSt = scanner.nextLine();
                        System.out.println("nhập tuổi ");
                        int ageSt = Integer.parseInt(scanner.nextLine());
                        System.out.println("nhập giới tính ");
                        String genderSt = scanner.nextLine();
                        System.out.println("nhập lương ");
                        float salaryTC = Float.parseFloat(scanner.nextLine());

                        Person person = new Student(i + 1, nameSt, ageSt, genderSt, salaryTC);
                        peopleList[i] = person;
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println("Ko tìm thấy ");
                }
        }
    }

    public static void displayStudent() {
        System.out.println("---------------------------------------------------");
        for (Person student : peopleList) {
            if (student instanceof Student) {
                System.out.println(student);
            }
        }
    }

    public static void displayTeacher() {
        System.out.println("---------------------------------------------------");
        for (Person teacher : peopleList) {
            if (teacher instanceof Teacher) {
                System.out.println(teacher);
            }
        }
    }

    public static void displayList() {
        System.out.println("---------------------------------------------------");
        for (Person item : peopleList) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("--------------Person Managemert--------------------");
            System.out.println("1.Display list Person");
            System.out.println("2.Add new Person");
            System.out.println("3.Search Person");
            System.out.println("4.Delete Person");
            System.out.println("5.Update Person");
            System.out.println("6.Exit");
            System.out.println("-----------------------------------------------------");
            System.out.print("chọn Options:   ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Display list");
                    System.out.println("--------------search Managemert--------------------");
                    System.out.println("1.display ALL");
                    System.out.println("2.display Teacher");
                    System.out.println("2.display Student");
                    System.out.println("-----------------------------------------------------");
                    System.out.print("chọn Options:   ");
                    int choosee = Integer.parseInt(scanner.nextLine());
                    switch (choosee) {
                        case 1:
                            displayList();
                            break;
                        case 2:
                            displayTeacher();
                            break;
                        case 3:
                            displayStudent();

                            break;
                    }
                    break;
                case 2:
                    System.out.println("Add new ");
                    addNewPerson();
                    displayList();
                    break;
                case 3:
                    flag = true;
                    System.out.println("Search ");
                    search();
                    break;
                case 4:
                    flag = true;
                    System.out.println("Delete ");
                    delete();
                    displayList();
                    break;
                case 5:
                    flag = true;
                    System.out.println("Update ");
                    update();
                    displayList();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
