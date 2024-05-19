package test;


import org.junit.jupiter.api.Test;

import Game.Game;
import GameModule.Player;

class MainTest {

	@Test
	void gameStart() {
		
				Player player = new Player();
				String usrName;
				
				//플레이어 세팅
				usrName = "영민";
				System.out.println("플레이어의 이름: " + usrName );
				player.savePlayerInfo(usrName, 0);
				
				Game.startOrExit(1);
				Game.gameProcess();
				
	}
}
