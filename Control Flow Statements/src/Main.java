public class Main {
    public static void main(String[] args) {
/*

        long miles = speedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);
        speedConverter.printConversion(10.5);

        int kb = 2500;
        MegaBytesConverter.printMegaBytesAndKiloBytes(kb);

        boolean barking = true;
        int hourOfDay = -1;
        boolean ans = BarkingDog.shouldWakeUp(barking,hourOfDay);
        System.out.println(ans);

        boolean leapAns = LeapYear.isLeapYear(2024);
        System.out.println(leapAns);

        calcFeet.calcFeetAndInchesToCentimeters(6,0);

        getDuration.getDurationString( 3945);

        MinutesToYearsDaysCalculator.printYearsAndDays(1440);

        IntEqualityPrinter.printEqual(-1,1,1);

        System.out.println(PlayingCat.isCatPlaying(false, 35));
*/
/*

       String Quarter =  SwitchStatements.getQuarter("January");
        System.out.println(Quarter);
*/
/*
        System.out.println(SwitchStatements.getNATO('F'));
        SwitchStatements.printDayOfWeek(4);
        String numberInWord = SwitchStatements.printNumberInWord(6);
        System.out.println(numberInWord);
        */
/*
        Integer year = 2017;
        boolean checkLeapYear = NumberOfDaysInMonth.isLeapYear(year);
        System.out.println(checkLeapYear);
*/
       /* Integer daysInMonth = NumberOfDaysInMonth.getDaysinMonth(1, -2020);
        System.out.println(daysInMonth);
       */
            int count = 0;
            for (int i = 0; i<= 1000; i++){
                if(ForLoop.isPrime(i) == true){
                    System.out.println(i);
                    count++;
                }
                if(count == 3){
                    break;
                }
            }
        }
    }
