public class TestTV {
	// menyatakan program
	public static void main(String[] args) {
		// setting tv1
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
		
		// setting tv2
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);	
	}
}

class TV {
	int channel = 1;
	int volumeLevel = 1;
	boolean on;
	
	TV() {
	}
	public void turnOn() {
		if (on = false) on = true;
	}
	public void turnOff() {
		if (on = true) on = false;
	}
	public void setChannel(int newChannel) {
		if (on = true) channel = newChannel;
	}
	public void setVolume(int newVolume) {
		if (on = true) volumeLevel = newVolume;
	}
	public void channelUp() {
		if (on = true) channel = channel + 1;
	}
	public void channelDown() {
		if (on = true) channel = channel - 1;
	}
	public void volumeUp() {
		if (on = true) volumeLevel = volumeLevel + 1;
	}
	public void volumeDown() {
		if (on = true) volumeLevel = volumeLevel - 1;
	}
}