package Interface;

import Model.EvaluationRecord;
import Model.PerformanceRecord;
import Model.Salesman;

import java.util.List;

public interface ManagePersonal {

    public void createSalesMan(Salesman salesMan);

    public Salesman readSalesMan(int salesManId);

    public void updateSalesMan(int salesManIdOld, int salesManIdNew);

    public void deleteSalesMan(int salesManId);

    public List<Salesman> querySalesMan(String attribute, String key);

    public void createPerformanceRecord(EvaluationRecord evaluationRecord, int salesManId);

    public PerformanceRecord readPerformanceRecord(int salesManId);

    public void updatePerformanceRecord(EvaluationRecord evaluationRecord, int salesManId);

    public void deletePerformanceRecord(EvaluationRecord evaluationRecord, int salesManId);

    public void createEvaluationRecord(int salesManId);

    public EvaluationRecord readEvaluationRecord(int salesManId);

    public void updateEvaluationRecord(int salesManId);

    public void deleteEvaluationRecord(int salesManId);

}
