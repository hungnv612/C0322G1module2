package services;

import java.io.IOException;

public interface Service {
    void display();

    void add() throws IOException;

    void update() throws IOException;

    void delete();
}
