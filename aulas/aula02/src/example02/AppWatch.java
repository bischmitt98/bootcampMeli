package example02;

public class AppWatch {
    public static void main (String[] args){
        Watch watch = new Watch(12,34,40);
//        watch.hour = 12;
//        watch.min = 64;
//        watch.sec = 11;

        watch.setHour(12);

        watch.showTime();

        int currentHour = watch.getHour();
        System.out.println("Hour: " + currentHour);
    }
}
