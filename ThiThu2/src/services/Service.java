package services;

import java.io.IOException;

public interface Service {
    void add() throws IOException;

    void display();

    void update() throws IOException;

    void delete() throws IOException;

    void search();
}
