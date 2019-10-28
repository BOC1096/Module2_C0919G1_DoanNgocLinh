package CaseStudy_FuramaResort.Model;

public abstract class ServicesHigh extends Services {
    private String roomStandard;
    private String otherConvenient;
    private byte numberOfFloor;

    public ServicesHigh() {
    }

    public ServicesHigh(String serviceName, float areaUsed, float rentCost, byte maxNumberOfPerson, String rentType, String id, String roomStandard, String otherConvenient, byte numberOfFloor) {
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
}
