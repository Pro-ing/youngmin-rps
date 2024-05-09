package Game;

import java.util.Scanner;

import GameModule.Player;

public class Main {

	public static void main(String[] args) {
		
		//사용자 정보 확인
		Player player = new Player();
		String usrInput;
		System.out.println("플레이어의 이름을 입력해주세요...");
		
		Scanner sc=new Scanner(System.in);
		usrInput = sc.next();
		player.savePlayerInfo(usrInput, 0);
		
	

	}

}
