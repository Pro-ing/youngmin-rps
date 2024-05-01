package GameUtil;

import java.util.Random;
import java.util.Scanner;

import rockScissorPaperGame.Main;

public class Game {
	
	static void gameStart(int usrAnswer) {
		
		if(usrAnswer==0 || usrAnswer==1) {
			System.out.println("* 가위 바위 보 게임을 시작하겠습니다.게임은 5판 진행됩니다. \n* 가장 최근의 기록만 저장됩니다.");
			gameProcess();
		}
		
	}
	
	//컴퓨터가 가위바위보 중 한가지를 선택
	static int comRps() {
			
		Random r = new Random();
			
		int [] rpsArr = {1,2,3};
		int comResult = rpsArr[r.nextInt(3)];
		
		return comResult;
			
	}
	
	static void gameProcess() {
		
		int cnt=0; //전체 게임 횟수 count
		int win=0;
		int lose=0;
		int tie=0;
		int usrInput;
		
		//5판 반복 
			while(cnt<5) {
				System.out.println("* 다음 중 하나를 골라 숫자를 입력해주세요.\n * 1(가위) 2(바위) 3(보)");
				
				Scanner sc = new Scanner(System.in);
				usrInput = sc.nextInt();
				int com = comRps();
				
				if(usrInput==1) {
					switch(com) {
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
					
				}else if(usrInput==2) {
					switch(com) {
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
				}else if(usrInput==3) {
					switch(com) {
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
			restartOrExit();
			
		}
	
	
	public static void restartOrExit() {
		Scanner sc = new Scanner(System.in);
		int usrAnswer;
		int loop=0;
		
		while(loop==0) {
			
			System.out.println("* 어떻게 하시겠습니까? 1.다시 시작 2.게임 종료");
			usrAnswer = sc.nextInt();
			
			if(usrAnswer==1) {
				loop++;
				Main.main(null);
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
