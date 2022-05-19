package BaiTap.DemergingUseQueue;

public class Management {
    private String name;
    private boolean gender;
    private String date;

    public Management() {
    }

    public Management(String name, boolean gender, String date) {
        this.name = name;
        this.gender = gender;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Management{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", date=" + date +
                '}';
    }
}
