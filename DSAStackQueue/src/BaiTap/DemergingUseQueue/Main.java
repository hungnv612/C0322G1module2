package BaiTap.DemergingUseQueue;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<Management> person = new LinkedList<>();
        person.add(new Management(" nữ", false, "1/2/2000"));
        person.add(new Management(" nam", true, "1/2/1999"));
        person.add(new Management(" nữ ", false, "1/2/1998"));
        person.add(new Management(" nam", true, "1/2/1997"));
        person.add(new Management(" nữ ", false, "1/2/1996"));
        person.add(new Management(" nam", true, "1/2/1995"));
        person.add(new Management(" nữ ", false, "1/2/1994"));
        person.add(new Management(" nam", true, "1/2/1993"));

        Queue<Management> queueNu = new LinkedList<>();
        Queue<Management> queueNam = new LinkedList<>();

        for (Management item : person) {
            if (!item.getGender()) {
                queueNu.add(item);
            } else {
                queueNam.add(item);
            }
        }
        System.out.println("-----------------------------------");
        while (!queueNam.isEmpty()) {
            System.out.println(queueNam.poll());
        }
        System.out.println("-----------------------------------");
        while (!queueNu.isEmpty()) {
            System.out.println(queueNu.poll());
        }
    }
}
