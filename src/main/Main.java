package main;

public class Main {
    public static void main(String[] args) {
        AddTime add = new AddTime();
        add.addTimeUnit("1:59:80");

        Time totalTime = add.calculateTotalTime();
        System.out.println(totalTime.getHours() + ":" + totalTime.getMinutes() + ":" + totalTime.getSeconds());
    }
}
