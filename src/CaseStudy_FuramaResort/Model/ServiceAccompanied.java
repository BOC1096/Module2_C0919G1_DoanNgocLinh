package CaseStudy_FuramaResort.Model;


public class ServiceAccompanied {
   private String serviceAccompaniedName;
   private int unit;
   private double cost;

    public ServiceAccompanied() {
    }

    public String getServiceAccompaniedName() {
        return serviceAccompaniedName;
    }

    public void setServiceAccompaniedName(String serviceAccompaniedName) {
        this.serviceAccompaniedName = serviceAccompaniedName;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
