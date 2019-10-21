package Database;

import Interface.ManagePersonal;
import Model.EvaluationRecord;
import Model.PerformanceRecord;
import Model.SalesMan;
import com.google.gson.Gson;
import com.mongodb.Block;
import com.mongodb.client.result.DeleteResult;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;

public class DatabaseController implements ManagePersonal {

    //    private List<Model.SalesMan> salesMan;
    private Connection databaseConnection;

    public DatabaseController(Connection databaseConnection) {
        this.databaseConnection = databaseConnection;
//        this.salesMan = salesMan;
    }

    private Connection getDatabaseConnection() {
        return databaseConnection;
    }

    public void setDatabaseConnection(Connection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

//    public List<Model.SalesMan> getSalesMan() {
//        return salesMan;
//    }
//
//    public void setSalesMan(List<Model.SalesMan> salesMan) {
//        this.salesMan = salesMan;
//    }

    //---------------------------------------------------//
    //--------------- Interface Methods -----------------//
    //---------------------------------------------------//

    @Override
    public void createSalesMan(SalesMan salesMan) {

        Document document = new Document()
                .append("employeeId", salesMan.getEmployeeId())
                .append("employeeName", salesMan.getEmployeeName())
                .append("department", salesMan.getDepartment())
                .append("performanceYear", salesMan.getPerformanceYear());

        this.getDatabaseConnection().getMongoCollection().insertOne(document);
    }

    @Override
    public SalesMan readSalesMan(int salesManId) {

        Document document = databaseConnection.getMongoCollection()
                .find(eq("employeeId", salesManId)).first();

        String documentJson = document.toJson();
        Gson gson = new Gson();

        return gson.fromJson(documentJson, SalesMan.class);
    }

    @Override
    public void updateSalesMan(int salesManIdOld, int salesManIdNew) {
        databaseConnection.getMongoCollection().updateOne(eq("employeeId", salesManIdOld),
                new Document("$set", new Document("employeeId", salesManIdNew)));
    }

    @Override
    public DeleteResult deleteSalesMan(int salesManId) {
        return databaseConnection.getMongoCollection().deleteOne(eq("employeeId", salesManId));

    }

    // Todo: does not work???
    @Override
    public List<SalesMan> querySalesMan(String attribute, String key) {
        List<SalesMan> salesMen = new ArrayList<>();

        Block<Document> printBlock = document -> System.out.println(document.toJson());

        databaseConnection.getMongoCollection().find(eq(attribute, key)).forEach(printBlock);

        return null;
    }

    @Override
    public void createPerformanceRecord(EvaluationRecord evaluationRecord, int salesManId) {

    }

    @Override
    public PerformanceRecord readPerformanceRecord(int salesManId) {
        return null;
    }

    @Override
    public void updatePerformanceRecord(EvaluationRecord evaluationRecord, int salesManId) {

    }

    @Override
    public void deletePerformanceRecord(EvaluationRecord evaluationRecord, int salesManId) {

    }

    @Override
    public void createEvaluationRecord(int salesManId) {

    }

    @Override
    public EvaluationRecord readEvaluationRecord(int salesManId) {
        return null;
    }

    @Override
    public void updateEvaluationRecord(int salesManId) {

    }

    @Override
    public void deleteEvaluationRecord(int salesManId) {

    }
}
