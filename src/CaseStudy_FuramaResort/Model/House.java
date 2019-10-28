package CaseStudy_FuramaResort.Model;

public class House extends ServicesHigh {
    public House() {
    }

    public House(String serviceName, float areaUsed, float rentCost, byte maxNumberOfPerson, String rentType, String id, String roomStandard, String otherConvenient, byte numberOfFloor) {
        super(serviceName, areaUsed, rentCost, maxNumberOfPerson, rentType, id, roomStandard, otherConvenient, numberOfFloor);
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
                "Room Standard: " + super.getRoomStandard() + "\n" +
                "Other Convenient: " + super.getOtherConvenient() + "\n" +
                "Number Of Floor: " + super.getNumberOfFloor());
    }
}


