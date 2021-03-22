public class playPlayer {
	/** main method
     * @param args */
	public static void main(String[] args) {
	// siapkan pemain
	GamePlayer pemain1 = new GamePlayer();
	pemain1.setDimension(100,100);
	pemain1.setPosition(3,7);
	System.out.println("width: "+ pemain1.getWidth());
	System.out.println("height: "+ pemain1.getHeight());
	System.out.println("posisi x: "+ pemain1.getX());
	System.out.println("posisi y: "+ pemain1.getY());
	// mainkan pemain
	pemain1.Run();
	pemain1.Run(10);
	}
}

class GamePlayer {
	double width;
	double height;
	int positionX;
	int positionY;
	
	public GamePlayer() {
	}
	public GamePlayer(double width, double height) {
	}
	public GamePlayer(double width, double height, int positionX, int positionY) {
	}
	public void setDimension(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	public void setPosition(int newPositionX, int newPositionY) {
		positionX = newPositionX;
		positionY = newPositionY;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public int getX() {
		return positionX;
	}
	public int getY() {
		return positionY;
	}
	public void Run() {
		System.out.println("Player is running");
	}
	public void Run(int incrementX) {
		positionX = positionX + incrementX;
		System.out.println("Player still running, current X position= " + positionX);
	}
}