package CaseStudy_FuramaResort.Model;

public abstract class Services {
    private String serviceName;
    private float areaUsed;
    private float rentCost;
    private int maxNumberOfPerson;
    private String rentType;
    private String idService;

    public Services() {

    }


    public Services(String serviceName, float areaUsed, float rentCost, byte maxNumberOfPerson, String rentType, String idService) {
        this.serviceName = serviceName;
        this.areaUsed = areaUsed;
        this.rentCost = rentCost;
        this.maxNumberOfPerson = maxNumberOfPerson;
        this.rentType = rentType;
        this.idService = idService;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(float areaUsed) {
        this.areaUsed = areaUsed;
    }

    public float getRentCost() {
        return rentCost;
    }

    public void setRentCost(float rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaxNumberOfPerson() {
        return maxNumberOfPerson;
    }

    public void setMaxNumberOfPerson(int maxNumberOfPerson) {
        this.maxNumberOfPerson = maxNumberOfPerson;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;;
    }

    abstract void showInformation();
}
