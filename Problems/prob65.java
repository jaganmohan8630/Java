public class prob65 {
    public static void main(String[] args) {
        int sec = 86500;
        int mins = sec/60;
        int remsec= sec%60;
        int hours = mins/60;
        int remmins = mins%60;
        System.out.println("Hours: "+hours+" Minutes: "+remmins+" Seconds: "+remsec);
    }
}
