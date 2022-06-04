package models;

public class Teacher extends Person {
    private String specialize;

    public Teacher() {
    }

    @Override
    public String getLine() {
        return String.format("%s,%s,%s,%s,%s",
                super.getId(),
                super.getName(),
                super.getDate(),
                super.getGender(),
                getSpecialize());
    }

    public Teacher(String specialize) {
        this.specialize = specialize;
    }

    public Teacher(int id, String name, String date, String gender, String specialize) {
        super(id, name, date, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "teacher{" + super.toString()+
                "specialize='" + specialize + '\'' +
                '}';
    }
}
