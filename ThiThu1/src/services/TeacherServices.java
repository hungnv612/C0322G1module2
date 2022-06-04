package services;

public interface TeacherServices extends Service{
    @Override
    void display();

    @Override
    void add();

    @Override
    void update();

    @Override
    void delete();

    @Override
    void search();
}
