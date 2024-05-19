package Game;

import java.util.Random;
import java.util.Scanner;


public class Game {
	
	
	static int getRandomInt() {//추후 utility 패키지로 이동
		
		//가위바위보 뿐만아니라 최소,최대 숫자를 지정하게 하여 다양한 상황에서 활용하도록 수정하기
		Random r = new Random();
			
		int [] rpsArr = {1,2,3};
		int result = rpsArr[r.nextInt(3)];
		
		return result;
			
	}
	
	public static void gameProcess() {
		
		System.out.println("* 게임은 5판 진행됩니다.");
		
		int cnt=0; //전체 게임 횟수 count
		int win=0;
		int lose=0;
		int tie=0;
		
		//사용자가 원하는 게임횟수로 세팅할수 있도록 수정하기
		//5판 반복 
			while(cnt<5) {
				System.out.println("* 다음 중 하나를 골라 숫자를 입력해주세요.\n * 1(가위) 2(바위) 3(보)");
				
				int usrRps = getRandomInt();
				int comRps = getRandomInt();
				
				if(usrRps==1) {
					switch(comRps) {
					case 1: System.out.println("상대:가위 vs 당신:가위 \n무승부입니다.");
					cnt++;
					tie++;
					break;
					case 2: System.out.println("상대:바위 vs 당신:가위 \n상대가 이겼습니다.");
					cnt++;
					lose++;
					break;
					case 3: System.out.println("상대:보 vs 당신:가위 \n당신이 이겼습니다.");
					cnt++;
					win++;
					break;
					default: System.out.println("다시 입력해주세요.");
					}
					
				}else if(usrRps==2) {
					switch(comRps) {
					case 1:System.out.println("상대:바위 vs 당신:바위 \n당신이 이겼습니다.");
					cnt++;
					win++;
					break;
					case 2:System.out.println("상대:바위 vs 당신:바위 \n무승부입니다.");
					cnt++;
					tie++;
					break;
					case 3:System.out.println("상대:보 vs 당신:바위 \n상대가 이겼습니다.");
					cnt++;
					lose++; 
					break;
					default: System.out.println("다시 입력해주세요.");
					}
				}else if(usrRps==3) {
					switch(comRps) {
					case 1:System.out.println("상대:가위 vs 당신:보 \n상대가 이겼습니다.");
					cnt++;
					lose++;  
					break;
					case 2:System.out.println("상대:바위 vs 당신:보 \n당신이 이겼습니다.");
					cnt++;
					win++;
					break;
					case 3:System.out.println("상대:보 vs 당신:보 \n무승부입니다.");
					cnt++;
					tie++;
					break;
					default: System.out.println("다시 입력해주세요.");
					}
					
				}else {
					System.out.println("!! 올바른 숫자를 입력해주세요. !!");
					continue;
					
				}
				
			}//while문 end
			
			System.out.println("* 5판 "+win+"승 "+lose+"패 "+tie+"무 입니다. \n* 게임이 끝났습니다.");
			startOrExit(2);
			
			
		}
	
	
	public static void startOrExit(int usrAnswer) {
		
		int loop=0;
		
		while(loop==0) {
			
			if(usrAnswer==1) {
				System.out.println("* 가위 바위 보 게임을 시작합니다.");
				loop++;
				break;
			}else if(usrAnswer==2) {
				loop++;
				System.out.println("*** 감사합니다. 게임을 종료합니다. ***");
				System.exit(0);
			}else {
				System.out.println("* 다시 입력해주세요.");
				continue;
			}
		}
	}
	
}
