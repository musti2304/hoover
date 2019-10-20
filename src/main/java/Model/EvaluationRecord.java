package Model;

public class EvaluationRecord {

    private String productName;
    private String clientName;
    private int clientRanking;
    private int itemsCount;
    private int bonus;
    private int totalBonus;

    public EvaluationRecord() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getClientRanking() {
        return clientRanking;
    }

    public void setClientRanking(int clientRanking) {
        this.clientRanking = clientRanking;
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
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
}
