package GameUtil;

import java.util.HashMap;

import GameUtil.Game;
/**
 * 플레이어 정보 생성 및 저장
 * */
public class Player {
	
	//플레이어 정보 생성
	private String usrName;
	private int score;
	
	//플레이어 기록 저장
	static HashMap<String, Integer> playerFile = new HashMap<String, Integer>();
	
	public String getUsrName() {
		return usrName;
	}


	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public static HashMap<String, Integer> getPlayerFile() {
		return playerFile;
	}


	public void setPlayerFile(HashMap<String, Integer> playerFile) {
		Player.playerFile = playerFile;
	}


	/**
	 * 회원 정보 저장
	 * */
	public void savePlayerInfo(String usrName,int score) {
	
		//기존 회원
		if(playerFile.containsKey(usrName)) {
			System.out.println(usrName+ " 님 다시 만나 반갑습니다.");
			//게임시작
			Game.gameStart(0);
			
		}else if(playerFile.containsKey(usrName)==false) {//신규회원
			setUsrName(usrName);
			setScore(score);
			playerFile.put(usrName, score);
			
			System.out.println(usrName+ " 님 신규 등록 되었습니다.");
			//게임시작
			Game.gameStart(0);
		}
		
	}

	
}
