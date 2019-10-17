package Model;

public class PerformanceRecord {

    private EvaluationRecord evaluationRecord;
    private String recordName;
    private int targetValue;
    private int actualValue;
    private int bonus;
    private int totalBonus;
    private float averageBonus;


    public PerformanceRecord(EvaluationRecord evaluationRecord) {
        this.evaluationRecord = evaluationRecord;
    }

    public EvaluationRecord getEvaluationRecord() {
        return evaluationRecord;
    }

    public void setEvaluationRecord(EvaluationRecord evaluationRecord) {
        this.evaluationRecord = evaluationRecord;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public int getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(int targetValue) {
        this.targetValue = targetValue;
    }

    public int getActualValue() {
        return actualValue;
    }

    public void setActualValue(int actualValue) {
        this.actualValue = actualValue;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getTotalBonus() {
        return totalBonus;
    }

    public void setTotalBonus(int totalBonus) {
        this.totalBonus = totalBonus;
    }

    public float getAverageBonus() {
        return averageBonus;
    }

    public void setAverageBonus(float averageBonus) {
        this.averageBonus = averageBonus;
    }
}
