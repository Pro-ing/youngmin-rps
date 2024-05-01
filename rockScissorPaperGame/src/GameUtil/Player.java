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
	HashMap<String, Integer> playerFile = new HashMap<String, Integer>();
	
	
	
	public void player(String usrName) {
		this.usrName = usrName;
	}
	
	public void usrScore(int score) {
		this.setScore(score);
		
	}
	
	
	/**
	 * 회원 정보 저장
	 * */
	public void savePlayerInfo(String usrName,int score) {
	
		//기존 회원
		if(playerFile.containsKey(usrName)) {
			System.out.println(usrName+ " 님 다시 만나 반갑습니다.");
			//게임시작
			Game.GameStart();
			
		}else if(playerFile.containsKey(usrName)==false) {//신규회원
			player(usrName);
			usrScore(score);
			playerFile.put(usrName, score);
			
			System.out.println(usrName+ " 님 신규 등록 되었습니다.");
			//게임시작
			Game.GameStart();
		}
		
	}
	
	
	/**
	 * 점수 저장 
	 * */
	public void PlayerScore(String player, int score) {
		
		//최고기록으로 덮어씌움
		if(playerFile.containsKey(player)){
			
			int oldScore=playerFile.get(usrName);
			int newScore=playerFile.get(player);
			
			if(oldScore < newScore) {
				playerFile.replace(usrName, newScore);
				System.out.println(player+ " 님, 최고 기록을 등록했습니다.");
			}else {
				System.out.println(player+ " 님, 기록을 등록했습니다.");
			}
			
		}else if(playerFile.containsKey(player)==false) {//신규 플레이어라면 등록
			System.out.println("신규 플레이어로 등록됩니다.");
			playerFile.put(player, score);
		}

		
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
