package HelloJava;

public class ArrayCopyExample {

	public static void main(String[] args) {
		//System.arraycopy로 배열 복사하기
		String oldstrArray[] = { "java", "array", "copy" };
		String newstrArray[] = new String[5];
		//System.araaycopy(원래배열, 원래배열의 몇번째 인덱스에서부터 복사할지, 새로운 배열, 새로운배열의 몇번째 인덱스부터 붙여넣기할지, 몇개를 복사할지);
		System.arraycopy(oldstrArray, 0, newstrArray, 0, oldstrArray.length); 
		
		for(int i=0; i<newstrArray.length; i++) {
			System.out.println(newstrArray[i] + ","); //복사되지않은 항목은 String배열의 초기값인 null이 된다.
		}
	}

}
