package BaiTap.ArrayList;

import ThucHanh.ListSimple.MyListTest;

public class MainMyList {
    public static void main(String[] args) {
        MyList<Person> myList = new MyList<>(1);
        myList.ensureCapacity(3);
        myList.add(new Person("Nguyễn Văn A",30));
        myList.add(new Person("Nguyễn Văn B",30));
        myList.add(new Person("Nguyễn Văn C",38));
        myList.add(new Person("Nguyễn Văn t",38));
        myList.add(new Person("Nguyễn Văn y",38));
        myList.add(new Person("Nguyễn Văn D",39),1);
        myList.add(new Person("Nguyễn Văn f",39),3);
//        myList.remove(2);
        MyList<Person> list2 = myList.clone();
        int index = list2.indexOf(new Person("Nguyễn Văn C ", 30));
        System.out.println("index = " + index);
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(myList.get(i).toString());
        }
    }
}
