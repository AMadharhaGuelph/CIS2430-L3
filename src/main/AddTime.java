package main;

import java.util.ArrayList;
import java.util.Scanner;

public class AddTime {
    private ArrayList<Time> time;
    private Scanner scnr;
    
    public AddTime() {
        time = new ArrayList<>();
        scnr = new Scanner(System.in);
    }

    public String promptInput() {
        String userInput = scnr.next();
        return userInput;
    }

    //Reminder: input format: (hh:mm:ss)
    public void addTimeUnit(String input) {
        String[] parsedInput = input.split(":");

        int hour = Integer.parseInt(parsedInput[0]);
        int minute = Integer.parseInt(parsedInput[1]);
        int second = Integer.parseInt(parsedInput[2]);

        Time newTime = new Time(hour, minute, second);
        this.time.add(newTime);
    }

    public Time calculateTotalTime() {
        int totalHours = 0;
        int totalMinutes = 0;
        int totalSeconds = 0;

        for(Time currentTime: this.time) {
            totalHours += currentTime.getHours();
            totalMinutes += currentTime.getMinutes();
            totalSeconds += currentTime.getSeconds();
        }

        if(totalSeconds > 59) {
            totalMinutes += totalSeconds / 60;
            System.out.println("1:" + totalMinutes);
            totalSeconds = totalSeconds % 60;
            System.out.println("2:" + totalSeconds);
        }

        if(totalMinutes > 59) {
            totalHours += totalMinutes / 60;
            System.out.println("3:" +totalHours);
            totalMinutes = totalMinutes % 60;
            System.out.println("4:" +totalMinutes);
        }

        Time totalTime = new Time(totalHours, totalMinutes, totalSeconds);
        return totalTime;
    }

}
