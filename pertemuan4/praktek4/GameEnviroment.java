import java.util.ArrayList;

public class GameEnviroment {
	private double width;
	private double height;
	private ArrayList<GamePlayer> arrPlayer = new ArrayList<GamePlayer>();
	private ArrayList<GameEnemy> arrEnemy = new ArrayList<GameEnemy>();
	
	public GameEnviroment() {
	}
	public GameEnviroment(double width , double height) {
        this.width = width;
        this.height = height;
    }
    public void addPlayer(GamePlayer GamePlayer) {
		arrPlayer.add(GamePlayer);
	}
	public void removePlayer(GamePlayer GamePlayer) {
		arrPlayer.remove(GamePlayer);
	}
	public void getAllPlayers() {
		System.out.println("para pemain: "+arrPlayer);
	}
	public void addEnemy(GameEnemy GameEnemy) {
		arrEnemy.add(GameEnemy);
	}
	public void removeEnemy(GameEnemy GameEnemy) {
		arrEnemy.remove(GameEnemy);
	}
	public void getAllEnemies() {
		System.out.println("para musuh: "+arrEnemy);
	}
	public void Interaction() {
	
		if (arrPlayer.isEmpty() || arrEnemy.isEmpty()){System.out.println("pemain dan musuh belum di siapkan");}
		
		for (int i = 0; i<arrPlayer.size(); i++) {
			for (int j = 0; j<arrPlayer.size(); j++) {
				if (arrPlayer.get(i).getY()!= arrEnemy.get(j).getY()) {
					System.out.println("pemain: "+arrPlayer.get(i)+" dan musuh: "+arrEnemy.get(j)+" tidak di posisi Y yang sama");
				}
				if (EuclideanDistance(arrPlayer.get(i).getX(),arrPlayer.get(i).getY(),arrPlayer.get(j).getX(),arrPlayer.get(j).getY()) < 2 ){
					System.out.println("pemain: "+arrPlayer.get(i)+" diserang");
					System.out.println("musuh: "+arrEnemy.get(j)+" kalah");
					removeEnemy(arrEnemy.get(j));
				}
				else{
					System.out.println("==> pemain "+arrPlayer.get(i));
					arrPlayer.get(i).Run((int)Math.ceil(Math.random()*10));
					System.out.println("posisi X sekarang: "+arrPlayer.get(i).getX()+" <==");
				}
			}
		}
	}
	
    public static int EuclideanDistance(int x1, int y1, int x2, int y2) {
		return (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}