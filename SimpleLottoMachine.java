package api;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;;


//6. 리뷰 : 로또 번호 생성
public class SimpleLottoMachine {

	public static void main(String[] args) {

		//45개의 공 만들기
		ArrayList<Integer> number = new ArrayList<Integer>();
		for(int i = 1; i <= 45; i++) {
			number.add(i); //1~45까지
		}
		
		//번호 섞기
		Collections.shuffle(number); //Collection.shuffle(number)는 (number)안의 값들을 섞어줌

		//6칸짜리 배열을 만들어 섞은 번호를 넣은뒤 번호 뽑기
		int[] pick = new int[6];
		for(int i = 0; i < pick.length; i++) {
			pick[i] = number.get(i);
		}
		
		//결과 출력
		System.out.printf("자동 생성 번호: %s", Arrays.toString(pick));
		//Arrays.toString(pick)은 pick에서 뽑아낸 값들을 하나의 배열로 나타내준다.
	}

}
