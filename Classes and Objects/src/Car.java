public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore"))
        {
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }
    public String getModel(){
        return this.model;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }
    public String getEngine(){
        return this.engine;
    }

/*public class SimpleCalculator {
 private double firstNumber=0;
    private double secondNumber=0;

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
    }
    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }
    public double getSubtractionResult(){
        return firstNumber-secondNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }
    public double getDivisionResult(){
        return (secondNumber==0) ? 0 : firstNumber/secondNumber; // ternary operator
    }

*/

}
