package B5_AdvancedObjectOrientedDesign.TH_B1LopAnimalVaInterfaceEdible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
