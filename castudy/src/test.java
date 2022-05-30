import services.ImpI.CustomerServiceIpl;
import services.ImpI.EmployeeServiceIpl;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        CustomerServiceIpl customerServiceIpl = new CustomerServiceIpl();
        customerServiceIpl.add();

    }
}
