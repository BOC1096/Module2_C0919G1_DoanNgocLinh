package CaseStudy_FuramaResort.Model;

public class Villa extends House {
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
        super.showInformation();
        System.out.println("Area Of Pool: " + this.getAreaOfPool());
    }
}
