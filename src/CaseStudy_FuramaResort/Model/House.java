package CaseStudy_FuramaResort.Model;

public class House extends Services {
    private String roomStandard;
    private String otherConvenient;
    private byte numberOfFloor;

    public House() {
    }

    public House(String serviceName, float areaUsed, float rentCost, byte maxNumberOfPerson, String rentType, String id, String roomStandard, String otherConvenient, byte numberOfFloor) {
        super(serviceName, areaUsed, rentCost, maxNumberOfPerson, rentType, id);
        this.roomStandard = roomStandard;
        this.otherConvenient = otherConvenient;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOtherConvenient() {
        return otherConvenient;
    }

    public void setOtherConvenient(String otherConvenient) {
        this.otherConvenient = otherConvenient;
    }

    public byte getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(byte numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
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
                "Room Standard: " + this.getRoomStandard() + "\n" +
                "Other Convenient: " + this.getOtherConvenient() + "\n" +
                "Number Of Floor: " + this.getNumberOfFloor());
    }
}

