package ThucHanh.AnimalAndInterfaceEdible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "ga keu go go";
    }

    @Override
    public String howToEat() {
        return "ga luot ";
    }
}
