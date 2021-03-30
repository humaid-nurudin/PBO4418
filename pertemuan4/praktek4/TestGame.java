public class TestGame {
	public static void main(String[] args) {
		// siapkan pemain
		GamePlayer hero = new GamePlayer();
		hero.setDimension(12,12);
		hero.setPosition(10,220);
		System.out.println("Posisi Player: "+hero.getX()+" , "+hero.getY());
		hero.Run(12);
		System.out.println("Posisi Player: "+hero.getX()+" , "+hero.getY());
		GamePlayer hero2 = new GamePlayer();
		hero2.setDimension(12,32);
		hero2.setPosition(10,10);
		
		// siapkan musuh
		GameEnemy monster = new GameEnemy();
		monster.setDimension(12,32);
		monster.setPosition(10,10);
		
		// siapkan field
		GameEnviroment scene = new GameEnviroment();
		scene.addPlayer(hero);
		scene.addPlayer(hero);
		scene.addPlayer(hero2);
		scene.getAllPlayers();
		scene.removePlayer(hero);
		scene.getAllPlayers();
		scene.addEnemy(monster);
		scene.Interaction();
	}
}