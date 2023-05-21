public class SwitchStatements {
    public static String getQuarter(String month){

        return switch (month) {
            case "January", "February", "March" -> "First Quarter";
            case "April", "May", "June" -> "Second Quarter";
            case "July", "August", "September" -> "Third Quarter";
            case "October", "November", "December" -> "Fourth Quarter";
            default -> "bad";
        };
    }

    public static String getNATO(char alphabet){
        return switch (alphabet) {
            case 'A' -> "A is Able";
            case 'B' -> "B is Baker";
            case 'C' -> "C is Charlie";
            case 'D' -> "D is Dog";
            case 'E' -> "E is Easy";
            default -> {
            String badResponse = "Alphabet "+ alphabet+ " is out of bounds";
            yield badResponse;
            }
        };
    }

    public static void printDayOfWeek(int day){
        String dayOfWeek = switch (day){
            case 0 -> { yield "Sunday";}
            case 1 -> { yield "Monday"; }
            case 2 -> { yield "Tuesday"; }
            case 3 -> { yield "Wednesday"; }
            case 4 -> { yield "Thursday"; }
            case 5 -> { yield "Friday"; }
            case 6 -> { yield "Saturday"; }
             default -> {
                 String badResponse = "Invalid";
                 yield badResponse;
             }
      };
        System.out.println(dayOfWeek);
    }

    public static String printNumberInWord(int number){

        String ans =  switch(number){
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> {
                String badResponse = "OTHER";
                yield badResponse;
            }
        };
        return ans;
    }

}
