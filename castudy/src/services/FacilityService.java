package services;

import java.io.IOException;

public interface FacilityService extends Service {
    @Override
    void display();

    @Override
    void add() throws IOException;

    @Override
    void update() throws IOException;

    void displayMaintenance();
}
