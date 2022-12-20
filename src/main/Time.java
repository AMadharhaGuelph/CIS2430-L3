package main;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hour, int minute, int second) {
        hours = hour;
        minutes = minute;
        seconds = second;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
