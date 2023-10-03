/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.task1;

/**
 *
 * @author vuduchai
 */
public class DangerousDog extends Dog{
    private int reportedIncidents;

    public DangerousDog(String id, String name, String owner,String size,int reportedIncidents) {
        super(size, id, name, owner);
        this.reportedIncidents = reportedIncidents;
    }

    public DangerousDog(String id, String name, String owner,String size) {
        super(size, id, name, owner);
    }

    public void setReportedIncidents(int reportedIncidents) {
        this.reportedIncidents = reportedIncidents;
    }

    public int getReportedIncidents() {
        return reportedIncidents;
    }
    
    public String getDetails(){
        return getName() + ": " + getId() + "," + getName() + getOwner() + getSize();
    }
    
    @Override
    public String toString() {
        return "DangerousDog{" + "reportedIncidents=" + reportedIncidents + '}';
    }
    
    
}
