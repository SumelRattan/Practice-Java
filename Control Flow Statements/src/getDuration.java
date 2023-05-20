public class getDuration {
    public static int getDurationString(int minutes, int seconds){
        if((minutes < 0) || ((seconds < 0) || (seconds > 59))){
            System.out.println("Invalid");
            return -1;
        }
        int hours = minutes / 60;
        int mins = minutes % 60;
        int ans = hours + mins + seconds;
        System.out.println(hours + " h " + mins + " m " + seconds + " s ");
        return ans;
    }

    public static int getDurationString(int seconds){
        if(seconds < 0){
            System.out.println("Invalid");
            return -1;
        }
        int mins = seconds / 60;
        int secs = seconds % 60;
        getDurationString(mins,secs);
        return 0;
    }

}
