
public class TimeDuration {
	
	private int duration;
	private int hours;
	private int minutes;
	private int seconds;

	public TimeDuration(int duration) {
		this.hours = duration / 3600;
		this.minutes = (duration % 3600) / 60;
		this.seconds = (duration % 3600) % 60;
	}

	@Override
	public String toString() {
		return hours + "h" + minutes + "m" + seconds + "s";
	}
	
	
	
} 
