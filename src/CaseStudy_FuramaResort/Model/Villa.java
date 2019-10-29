package CaseStudy_FuramaResort.Model;

public class Villa extends ServicesHigh {
    private float areaOfPool;

    public Villa() {
    }


    public Villa(String serviceName, float areaUsed, float rentCost, byte maxNumberOfPerson, String rentType, String id, String roomStandard, String otherConvenient, byte numberOfFloor, float areaOfPool) {
        super(serviceName, areaUsed, rentCost, maxNumberOfPerson, rentType, id, roomStandard, otherConvenient, numberOfFloor);
        this.areaOfPool = areaOfPool;
    }

    public float getAreaOfPool() {
        return areaOfPool;
    }

    public void setAreaOfPool(float areaOfPool) {
        this.areaOfPool = areaOfPool;
    }

    @Override
    public void showInformation() {
        System.out.println("Information of service: " + "\n" +
                "Service Name: " + super.getServiceName() + "\n" +
                "Area Used: " + super.getAreaUsed() + "\n" +
                "Rent Cost: " + super.getRentCost() + "\n" +
                "Maximum Number Of Person: " + super.getMaxNumberOfPerson() + "\n" +
                "Rent Type: " + super.getRentType() + "\n" +
                "ID: " + super.getIdService() + "\n" +
                "Room Standard: " + super.getRoomStandard() + "\n" +
                "Other Convenient: " + super.getOtherConvenient() + "\n" +
                "Number Of Floor: " + super.getNumberOfFloor() + "\n" +
                "Area Of Pool: " + this.getAreaOfPool());
    }
}
