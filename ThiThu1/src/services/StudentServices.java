package services;

import java.io.IOException;

public interface StudentServices extends Service{
    @Override
    void display();

    @Override
    void add() throws IOException;

    @Override
    void update();

    @Override
    void delete();

    @Override
    void search();
}
