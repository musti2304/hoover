package Model;

import java.io.Serializable;
import java.util.List;

public class Salesman implements Serializable {

    private int employeeId;
    private String employeeName;
    private String department;
    private Integer performanceYear;
    private List<Salesman> salesMen;

    public Salesman(int employeeId, String employeeName, String department, Integer performanceYear) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.performanceYear = performanceYear;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getPerformanceYear() {
        return performanceYear;
    }

    public void setPerformanceYear(Integer performanceYear) {
        this.performanceYear = performanceYear;
    }

    public List<Salesman> getSalesMen() {
        return salesMen;
    }

    public void setSalesMen(List<Salesman> salesMen) {
        this.salesMen = salesMen;
    }

    @Override
    public String toString() {
        return String.format("{\n\t\"employeeId\": %d,\n\t\"employeeName\": \"%s\",\n\t\"department\": \"%s\",\n\t\"performanceYear\": %d\n}",
                employeeId, employeeName, department, performanceYear);
    }
}
