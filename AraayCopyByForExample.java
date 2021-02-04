package HelloJava;

public class AraayCopyByForExample {

	public static void main(String[] args) {
		//for문으로 배열복사
		int OA[] = { 1, 2, 3 };  //이전 배열
		//배열은 한번 생성하면 크기를 변경할 수 없기 때문에 더 많은 저장공간이 필요하다면 더 큰 배열을 만들고 이전 배열에서 복사해야한다.
		int NA[] = new int[5]; //새로운 배열
		
		for(int i=0; i<OA.length; i++) { //이전배열에서 새로운 배열에다 복사하기
			NA[i] = OA[i];
		}
		for(int i=0; i<NA.length; i++) { //복사되지않은 항목은 정수형의 기본 초기값인 0이므로 0이 출력된다.
			System.out.print(NA[i] + ",");
		}
	}

}
