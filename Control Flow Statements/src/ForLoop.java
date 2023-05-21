public class ForLoop {


    public  static boolean isPrime(int number){
        if(number <= 2 ){
            return (number == 2);
        }
        for(int i = 2; i < number; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }

}
