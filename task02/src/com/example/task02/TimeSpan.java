package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        normalize();
    }

    public void setSecond(int second) {
        if (second < 0) {
            throw new IllegalArgumentException("секунды не могут быть отрицательными");
        }
        this.second = second;
        normalize();
    }

    public void setMinute(int minute) {
        if (minute < 0) {
            throw new IllegalArgumentException("минуты не могут быть отрицательными");
        }
        this.minute = minute;
        normalize();
    }

    public void setHour(int hour) {
        if (hour >= 0) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("часы не могут быть отрицательными");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Метод для нормализации времени
    private void normalize() {
        if (this.second >= 60) {
            this.minute += this.second / 60;
            this.second = this.second % 60;
        } else if (this.second < 0) {
            this.minute -= Math.abs(this.second) / 60 + 1;
            this.second = 60 - Math.abs(this.second) % 60;
        }

        if (this.minute >= 60) {
            this.hour += this.minute / 60;
            this.minute = this.minute % 60;
        } else if (this.minute < 0) {
            this.hour -= Math.abs(this.minute) / 60 + 1;
            this.minute = 60 - Math.abs(this.minute) % 60;
        }
    }

    public void add(TimeSpan time){
        this.hour += time.getHour();
        this.minute += time.getMinute();
        this.second += time.getSecond();
        normalize();
    }

    public void subtract(TimeSpan time){
        this.hour -= time.getHour();
        this.minute -= time.getMinute();
        this.second -= time.getSecond();

        if (this.hour < 0) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        } else {
            normalize();
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}