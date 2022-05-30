package services;

import java.io.IOException;

public interface CustomerService extends Service{
    @Override
    void display();

    @Override
    void add() throws IOException;

    @Override
    void update() throws IOException;

    @Override
    void delete();
}
