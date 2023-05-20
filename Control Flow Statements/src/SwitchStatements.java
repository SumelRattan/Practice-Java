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
}
