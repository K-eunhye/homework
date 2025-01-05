package secttion19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//예제19_7 FileInputStream의 read()메소드를 이용한 파일 읽기
public class EX19_07 {
	public static void main(String[] args) {
		
		//파일을 읽어올 변수
		int read = 0;
		//스트림 선언
		InputStream in = null;
		
		try {
			in = new FileInputStream("file_korean.txt");
			while(true) {
				//파일읽기
				read = in.read();
				//-1이면 종료
				if(read == -1) {
					break;
				}
				System.out.println((char)read);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Error : " + e.getMessage());
		}finally {
			
			try {
				//객체가 사용중이면 닫는다
				if(in != null) {
					in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}
}
