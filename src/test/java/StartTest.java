import Database.Connection;
import Database.DatabaseController;
import Model.SalesMan;
import com.mongodb.WriteConcern;
import com.mongodb.WriteResult;
import com.mongodb.client.result.DeleteResult;
import org.bson.Document;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import javax.xml.crypto.Data;

import static com.mongodb.client.model.Filters.eq;
import static org.junit.jupiter.api.Assertions.*;

public class StartTest {

    private Connection connection;
    private SalesMan salesMan;
    private SalesMan salesMan2;
    private DatabaseController databaseController;

    public StartTest() {
    }

    @BeforeEach
    void setUp() {
        this.connection = new Connection("localhost", 27017,
                "salesman","salesman");
        this.salesMan = new SalesMan(1001, "Mustafa Yousef",
                "Software Development", 2019);
        this.salesMan2 = new SalesMan(1002, "Musti Yousef",
                "Business Development", 2010);
        this.databaseController = new DatabaseController(connection);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void createSalesman() {
        Document document = new Document()
                .append("employeeId", salesMan.getEmployeeId())
                .append("employeeName", salesMan.getEmployeeName())
                .append("department", salesMan.getDepartment())
                .append("performanceYear", salesMan.getPerformanceYear());


        ;
//        WriteResult acknowledged = connection.getMongoCollection().insertOne(document);
//        assertEquals();

    }

    @Test
    public void getSalesman() {
        databaseController.readSalesMan(salesMan.getEmployeeId());
    }

    @Test
    public void updateSalesman() {
        databaseController.updateSalesMan(salesMan.getEmployeeId(),
                salesMan2.getEmployeeId());
    }

    @Test
    public void deleteSalesman() {
        DeleteResult acknowledged = connection.getMongoCollection()
                .deleteOne(eq("employeeId", salesMan.getEmployeeId()));
        assertEquals(1, acknowledged.getDeletedCount());
    }
}