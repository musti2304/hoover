package Client;

import Database.Connection;
import Database.DatabaseController;
import Model.Salesman;

import java.util.ArrayList;
import java.util.List;

public abstract class Start {

    public static void start() {
        Connection databaseConnection = new Connection("localhost",
                27017, "salesman", "salesman");

        Salesman myousef = new Salesman(1001, "Mustafa Yousef",
                "Software Development", 2019);
        Salesman myo = new Salesman(1002, "Musti Yousef",
                "Business Development", 2018);

//        Salesman test1 = new Salesman(2001, "Test1", "TestD1", 2001);
//        Salesman test2 = new Salesman(2002, "Test2", "TestD2", 2002);

        List<Salesman> salesMen = new ArrayList<>();
//        salesMen.add(0, test1);
//        salesMen.add(1, test2);

        // DatabaseController
        DatabaseController databaseController = new DatabaseController(databaseConnection);

        // Create Salesman
        databaseController.createSalesMan(myousef);
        databaseController.createSalesMan(myo);

        // Read Salesman
        salesMen.add(databaseController.readSalesMan(myousef.getEmployeeId()));
        salesMen.add(databaseController.readSalesMan(myo.getEmployeeId()));

        // Read all Salesman
//        salesMen.add(databaseController.querySalesMan("employeeId"));

        // Update a Salesman
//        databaseController.updateSalesMan(test2.getEmployeeId(), test1.getEmployeeId());

        // Delete a Salesman
//        databaseController.deleteSalesMan(test1.getEmployeeId());

        // Example for read
        for (Salesman salesMan : salesMen) {
            System.out.println("Model.Salesman: \n" + salesMan.toString());
        }
    }
}
