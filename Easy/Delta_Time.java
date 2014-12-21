import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
	Scanner input = new Scanner(new File(args[0]));

	while (input.hasNextLine()) {
	    String[] inputs = input.nextLine().split(" ");
	    System.out.println(findTimeDifference(inputs));
	}
    }

    private static String findTimeDifference(String[] inputs) {
	String[] s1 = inputs[0].split(":");
	String[] s2 = inputs[1].split(":");

	Time t1 = new Time(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]), Integer.parseInt(s1[2]));
	Time t2 = new Time(Integer.parseInt(s2[0]), Integer.parseInt(s2[1]), Integer.parseInt(s1[2]));

	return t1.getDifferenceFrom(t2).toString();	
    }

    static class Time {
	private int hour;
	private int min;
	private int sec;

	public Time(int hour, int min, int sec) {
	    this.hour = hour;
	    this.min = min;
	    this.sec = sec;
	}

	private Time getDifferenceFrom(Time t) {
	    int t1 = getSeconds(this);
	    int t2 = getSeconds(t);

	    int totalSeconds = Math.abs(t1 - t2);

	    int hourDiff = (int)(totalSeconds / 3600);
	    totalSeconds -= hourDiff * 3600;
	    int minDiff = (int)(totalSeconds / 60);
	    totalSeconds -= minDiff * 60;
	    int secDiff = totalSeconds;

	    return new Time(hourDiff, minDiff, secDiff);
	}

	private int getSeconds(Time t) {
	    return (t.hour * 3600) + (t.min * 60) + (t.sec);
	}
	
	@Override 
	public String toString() {
	    return String.format("%02d", this.hour) + ":" + String.format("%02d", this.min) + ":" + String.format("%02d", this.sec);
	}
    }
}

	    
	
