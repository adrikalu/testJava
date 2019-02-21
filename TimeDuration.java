
public class TimeDuration {
	
	private int hours;
	private int minutes;
	private int seconds;

	public TimeDuration(int duration) {
		this.hours = duration % 60;
		this.minutes = duration / 60;
		this.seconds = hours % 60;
	}

	@Override
	public String toString() {
		return hours + "h" + minutes + "m" + seconds + "s";
	}
	
	
	
} 
