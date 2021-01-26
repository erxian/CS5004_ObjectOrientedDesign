package problem2;

/**
 *  CS 5004 Spring 2021
 *  Zengping Xu
 *
 * Time insists of hour(between 0 and 23, inclusive.),
 * minutes(between 0 and 59, inclusive.), and
 * second(between 0 and 59, inclusive).
 *
 */

public class Time {
    private int hour;
    private int minutes;
    private int second;
    /**
     * Constructor that creates a new Time object with the specified hour,
     * minutes and second
     * @param hour - hour of one day
     * @param minutes - minutes of one day
     * @param second - second of one day
     */
    public Time(int hour, int minutes, int second) {
        this.setHour(hour);
        this.setMinutes(minutes);
        this.setSecond(second);
    }
    /**
     * Returns the hour of the Time.
     * @return the hour of the Time.
     */
    public int getHour() {
        return this.hour;
    }
    /**
     * Returns the minutes of the Time.
     * @return the minutes of the Time.
     */
    public int getMinutes() {
        return this.minutes;
    }
    /**
     * Returns the second of the Time.
     * @return the second of the Time.
     */
    public int getSecond() {
        return this.second;
    }
    /**
     * @param hour - hour of the Time
     * Sets the hour of the Time.
     */
    public void setHour(int hour) {
        int min = 0;  // min number of day time
        int maxHour = 23;  // max number of day hour
        if (hour < min || hour > maxHour) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }
    /**
     * @param minutes - minutes of the Time
     * Sets the minutes of the Time.
     */
    public void setMinutes(int minutes) {
        int min = 0;  // min number of day time
        int max = 60;  // max number of day hour
        if (minutes < min || minutes > max) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }
    }
    /**
     * @param second - second of the Time
     * Sets the second of the Time.
     */
    public void setSecond(int second) {
        int min = 0;  // min number of day time
        int max = 60;  // max number of day hour
        if (second < min || second > max) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }

}
