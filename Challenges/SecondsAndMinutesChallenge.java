public class SecondsAndMinutesChallenge{
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
    }
    public static String getDurationString(int seconds){
            int minutes = seconds/60;
            return getDurationString(minutes, seconds);
        }
    public static String getDurationString(int minutes, int seconds){
           if(seconds >=0 && seconds<=59){
            return minutes/60+"h "+minutes%60+"m " + seconds%60+"s";
        } 
            return "0";
        }
}