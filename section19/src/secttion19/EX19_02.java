package secttion19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//예제19_02 Read(byte[])메소드를 이용한 파일읽기
public class EX19_02 {
	
	public static void main(String[] args) {
		
//		파일을 읽어올 변수
		int read = 0;
		//스트림 선언
		InputStream in = null;
		//데이터를 담을 배열선언
		byte[] buffer = new byte[5];
		
		try {
			in = new FileInputStream("my_text.txt");
			while(true) {
				//파일읽기
				//읽어온 데이터는 배열에 담긴다
				read = in.read(buffer);
				//-1이면 종료
				if(read == -1) {
					break;
					
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Error : " + e.getMessage());
			
		}finally {
			try {
				//객체가 사용중이라면 닫는다
				if(in != null) {
					in.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
