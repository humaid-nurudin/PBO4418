public class playEnemy {
	/** main method
     * @param args */
	public static void main(String[] args) {
	// siapkan musuh
	GameEnemy musuh1 = new GameEnemy();
	musuh1.setDimension(100,100);
	musuh1.setPosition(5,3);
	System.out.println("width: "+ musuh1.getWidth());
	System.out.println("height: "+ musuh1.getHeight());
	System.out.println("posisi x: "+ musuh1.getX());
	System.out.println("posisi y: "+ musuh1.getY());
	// musuh datang
	musuh1.Run();
	}
}

class GameEnemy {
	double width;
	double height;
	int positionX;
	int positionY;
	
	public GameEnemy() {
	}
	public GameEnemy(double width, double height) {
	}
	public GameEnemy(double width, double height, int positionX, int positionY) {
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
		System.out.println("Enemy is running");
	}
}