package CaseStudy_FuramaResort.Model;

public abstract class Services {
    private String serviceName;
    private float areaUsed;
    private float rentCost;
    private byte maxNumberOfPerson;
    private String rentType;
    private String id;

    public Services() {

    }

    public Services(String serviceName, float areaUsed, float rentCost, byte maxNumberOfPerson, String rentType, String id) {
        this.serviceName = serviceName;
        this.areaUsed = areaUsed;
        this.rentCost = rentCost;
        this.maxNumberOfPerson = maxNumberOfPerson;
        this.rentType = rentType;
        this.id = id;
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

    public byte getMaxNumberOfPerson() {
        return maxNumberOfPerson;
    }

    public void setMaxNumberOfPerson(byte maxNumberOfPerson) {
        this.maxNumberOfPerson = maxNumberOfPerson;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;;
    }

    abstract void showInformation();
}
