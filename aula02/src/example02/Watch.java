package example02;

public class Watch {
    // attributes
    private int hour;
    private int min;
    private int sec;

    Watch(int hour, int min, int sec){
        if(hour >= 0 && hour <24){
            this.hour = hour;
        }
        this.min = min;
        this.sec = sec;
    }

    // methods

    public void setHour(int newHour){
        if(newHour >= 0 && newHour <24){
            hour = newHour;
        }
    }

    public int getHour(){
        return hour;
    }

    void showTime(){
        System.out.println(
            hour + ":" +
            min + ":" +
            sec);
    }
}
