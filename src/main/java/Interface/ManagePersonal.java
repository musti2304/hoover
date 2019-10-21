package Interface;

import Model.EvaluationRecord;
import Model.PerformanceRecord;
import Model.SalesMan;
import com.mongodb.client.result.DeleteResult;

import java.util.List;

public interface ManagePersonal {

    public void createSalesMan(SalesMan salesMan);

    public SalesMan readSalesMan(int salesManId);

    public void updateSalesMan(int salesManIdOld, int salesManIdNew);

    public DeleteResult deleteSalesMan(int salesManId);

    public List<SalesMan> querySalesMan(String attribute, String key);

    public void createPerformanceRecord(EvaluationRecord evaluationRecord, int salesManId);

    public PerformanceRecord readPerformanceRecord(int salesManId);

    public void updatePerformanceRecord(EvaluationRecord evaluationRecord, int salesManId);

    public void deletePerformanceRecord(EvaluationRecord evaluationRecord, int salesManId);

    public void createEvaluationRecord(int salesManId);

    public EvaluationRecord readEvaluationRecord(int salesManId);

    public void updateEvaluationRecord(int salesManId);

    public void deleteEvaluationRecord(int salesManId);

}
