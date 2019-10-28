package CaseStudy_FuramaResort.Model;

public class Room extends Services {
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String serviceName, float areaUsed, float rentCost, byte maxNumberOfPerson, String rentType, String id, String freeServiceIncluded) {
        super(serviceName, areaUsed, rentCost, maxNumberOfPerson, rentType, id);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public void showInformation() {
        System.out.println("Information of service: " + "\n" +
                "Service Name: " + super.getServiceName() + "\n" +
                "Area Used: " + super.getAreaUsed() + "\n" +
                "Rent Cost: " + super.getRentCost() + "\n" +
                "Maximum Number Of Person: " + super.getMaxNumberOfPerson() + "\n" +
                "Rent Type: " + super.getRentType() + "\n" +
                "ID: " + super.getId() + "\n" +
                "Free Service Included: " + this.getFreeServiceIncluded());
    }
}
