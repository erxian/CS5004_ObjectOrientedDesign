package problem2;

/**
 *  CS 5004 Spring 2021
 *  Zengping Xu
 *
 * Trip means the traveling of an employee, including
 * start location and end location, start time and end time.
 */

public class Trip {
    private String startL;
    private String endL;
    private Time startT;
    private Time endT;
    /**
     * Constructor that creates a new Trip object with the specified
     * start location and end location, start time and end time.
     * @param startL - start location of the trip
     * @param endL - end location of the trip
     * @param startT - start time of the trip
     * @param endT - end time of the trip
     */
    public Trip(String startL, String endL, Time startT, Time endT) {
        this.startL = startL;
        this.endL = endL;
        this.startT = startT;
        this.endT = endT;
    }
    /**
     * Returns the duration of the Trip.
     * @return the duration of the Trip.
     */
    public Time getDuration() {
        int count = 60;
        Time duration = new Time(0, 0, 0);
        int start = this.startT.getHour() * count * count +
                this.startT.getMinutes() * count +
                this.startT.getSecond();
        int end = this.endT.getHour() * count * count +
                this.endT.getMinutes() * count +
                this.endT.getSecond();
        if (end - start > 0) {
            int diff = end - start;
            duration.setHour(diff / count / count);
            duration.setMinutes(diff / count - duration.getHour() * count);
            duration.setSecond(diff % count);
            }
        return duration;
    }
    }
