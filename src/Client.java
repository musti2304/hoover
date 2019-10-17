import Database.DatabaseConnection;
import Database.DatabaseController;
import Model.SalesMan;

import java.util.ArrayList;
import java.util.List;

public class Client {


    public static void main(String[] args) {

        DatabaseConnection databaseConnection = new DatabaseConnection("localhost",
                27017, "salesman", "salesman");

        SalesMan myousef = new SalesMan(1001, "Mustafa Yousef",
                "Software Development", 2019);
        SalesMan myo = new SalesMan(1002, "Musti Yousef",
                "Business Development", 2018);

        SalesMan test1 = new SalesMan(2001, "Test1", "TestD1", 2001);
        SalesMan test2 = new SalesMan(2002, "Test2", "TestD2", 2002);

        List<SalesMan> salesMen = new ArrayList<>();
        salesMen.add(0, test1);
//        salesMen.add(1, test2);

        // DatabaseController
        DatabaseController databaseController = new DatabaseController(databaseConnection);

        // Create SalesMan
        databaseController.createSalesMan(test1);
//        databaseController.createSalesMan(test2);

        // Read SalesMan
//        salesMen.add(databaseController.readSalesMan(myousef.getEmployeeId()));
//        salesMen.add(databaseController.readSalesMan(myo.getEmployeeId()));

        // Read all SalesMan
//        salesMen.add(databaseController.querySalesMan("employeeId"));

        // Update a SalesMan
//        databaseController.updateSalesMan(test2.getEmployeeId(), test1.getEmployeeId());

        // Delete a SalesMan
//        databaseController.deleteSalesMan(test1.getEmployeeId());

        // Example for read
        for (SalesMan salesMan : salesMen) {
            System.out.println("Model.SalesMan: \n" + salesMan.toString());
        }
    }
}
