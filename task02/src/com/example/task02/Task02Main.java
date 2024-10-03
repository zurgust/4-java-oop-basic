package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {

        TimeSpan timeSpan = new TimeSpan(0, 0, 0);

        System.out.println("Time span 1 is:\n" + timeSpan.toString());

        System.out.println("hours before setter is " + timeSpan.getHour());
        System.out.println("minutes is " + timeSpan.getMinute());
        System.out.println("seconds is " + timeSpan.getSecond());
        System.out.println();

        timeSpan.setHour(18);
        timeSpan.setMinute(80);
        timeSpan.setSecond(90);

        System.out.println("hours after setter is:" + timeSpan.getHour());
        System.out.println("minutes after setter is:" + timeSpan.getMinute());
        System.out.println("seconds after setter is:" + timeSpan.getSecond());

        TimeSpan timeSpan2 = new TimeSpan(timeSpan.getHour(), timeSpan.getMinute(), timeSpan.getSecond());

        timeSpan2.add(timeSpan);
        System.out.println("Time span 2 is:\n" + timeSpan2);
        timeSpan2.subtract(timeSpan);


        System.out.println("Time span 2 is:\n" + timeSpan2);


    }
}
