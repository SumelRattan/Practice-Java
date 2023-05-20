package org.example;

public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private Dishwasher dishwasher;

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public Dishwasher getDishwasher() {
        return dishwasher;
    }

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishwasher = new Dishwasher();

    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishFlag){
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishwasher.setHasWorkToDO(dishFlag);
    }
    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishwasher.doDishes();
    }
}

class CoffeeMaker{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){

        if(hasWorkToDo){
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}

class Refrigerator{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){

        if(hasWorkToDo){
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}

class Dishwasher{
    private boolean hasWorkToDO;

    public void setHasWorkToDO(boolean hasWorkToDO) {
        this.hasWorkToDO = hasWorkToDO;
    }

    public void doDishes(){

        if(hasWorkToDO){
            System.out.println("Washing Dishes");
            hasWorkToDO = false;
        }
    }
}



