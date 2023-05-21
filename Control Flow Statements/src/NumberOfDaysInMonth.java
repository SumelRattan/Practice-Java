public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                return true;
            }
        }return false;
    }

    public static int getDaysinMonth(int month, int year) {
        if (month < 1 || month > 12) return -1;
        if (year < 1 || year > 9999) return -1;
        boolean leapYear = isLeapYear(year);
        int ans = switch (month) {
            case 1 -> 31;
            case 2 -> {
                if (leapYear == true) {
                    yield 29;
                } else yield 28;
            }
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 30;
            case 12 -> 31;
            default -> {
                int badResponse = 90;
                yield badResponse;
            }
        };
        return ans;
    }

}