
public class TimeDuration {
	
	private int duration;
	private int hours;
	private int minutes;
	private int seconds;
	private int remainder;

	public TimeDuration(int duration) {
		this.hours = duration / 3600;
		this.remainder = duration - hours * 3600;
		this.minutes = remainder / 60;
		this.remainder = remainder - minutes * 60;
		this.seconds = remainder;
	}

	@Override
	public String toString() {
		return hours + "h" + minutes + "m" + seconds + "s";
	}
	
	
	
} 
