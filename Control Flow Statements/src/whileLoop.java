public class whileLoop {

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void evenInRange(int start, int end) {
        int count = 0;
        int oddCount = 0;
        if (start >= 0 && end > 0) {
            while (start <= end) {
                start++;
                if (isEven(start) == true) {
                    count++;
                    while (count <= 5){
                        System.out.println(start);
                    }
                    break;
                }else{
                    oddCount++;
                }
            }
            System.out.println(count);
            System.out.println(oddCount);
        }
    }

    public static int sumDigits(int number){
        int sum = 0;
        if(number < 0){
            return -1;
        }else{
            while(number > 9){
                sum += number % 10;
                number = number/10;
            }
            sum += number;
        }
        return sum;
    }

    public static boolean isPalindrome(int number){
        int originalNum = number;
        int reverse = 0;
        int lastDigit =0;
        while(number > 9){
            lastDigit = number%10;
            reverse = reverse*10 + lastDigit;
            number = number/10;
        }
        reverse = reverse*10 + number%10;
        if(reverse == originalNum){
            return true;
        }else{
            return false;
        }
    }

    public static int sumFirstAndLastDigit(int number){

        if(number < 0)return -1;
        int sum = 0;
        int last = number%10;
        while(number > 9){
            number = number/10;
        }
        sum = last + number;
        return sum;
    }

    public static int getEvenDigitSum(int number){
        if(number< 0)return -1;
        int evenSum = 0;
        while(number>9){
            if((number%10)%2 == 0){
                evenSum  += number;
            }
            number= number/10;
        }if(number%2 == 0){
            evenSum += number;
        }
        return evenSum;
    }

    public static boolean hasSharedDigit(int start, int end) {

        if((start >= 10 && start <= 99) && (end >= 10 && end <= 99)) {
            if(start % 10 == end % 10 || start % 10 == end/10 ){
                return true;
            } else if (start/10 == end % 10 || start / 10 == end / 10) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if((num1 >= 10 && num1 <= 1000) && (num2 >= 10 && num2 <= 1000) && (num3 >= 10 && num3 <= 1000)){
            if((num1 % 10 == num2 % 10) || (num1 % 10 == num3 % 10) || (num2 % 10 == num3 % 10)){
                return true;
            }
        }return false;
    }

    public static void printFactors(int number){
        if(number >= 1){
            for(int i = 1; i <= number; i++){
                if(number % i == 0){
                    System.out.println(i);
                }
            }
        }else {
            System.out.println("Invalid Value");
        }
    }

    public static int getGreatestCommonDivisor(int first, int second){
        int gcd = 0;
        int big = 0;
        if(first < 10 || second < 10){
            return -1;
        }
        if(first > second){
            big = first;
        }else{
            big = second;
        }
        for(int i = 1; i< big; i++){
                if(first % i == 0 && second % i == 0){
                    gcd = i;
                }
            }
        return gcd;
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number > 1) {
            for (int i = 1; i < number; i++) {
                if(number % i == 0){
                    sum += i;
                }
            }
            if(sum == number){
                return true;
            }
        } return false;
    }
}


