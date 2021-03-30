public class GameEnemy {
	private double width;
	private double height;
	private int positionX;
	private int positionY;
	
	public GameEnemy() {
	}
	public GameEnemy(double width, double height) {
        this.width = width;
        this.height = height;
	}
	public GameEnemy(double width, double height, int positionX, int positionY) {
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
	}
	public void setDimension(double newWidth, double newHeight) {
		this.width = newWidth;
		this.height = newHeight;
	}
	public void setPosition(int newPositionX, int newPositionY) {
		this.positionX = newPositionX;
		this.positionY = newPositionY;
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