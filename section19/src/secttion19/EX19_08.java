package secttion19;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//예제19_8 FileReader의 read()메소드를 이용한 파일 읽기
public class EX19_08 {
	public static void main(String[] args) {
		
		//파일을 읽어올 변수
		int read = 0;
		//스트림선언
		Reader reader = null;
		
		
		try {
			reader = new FileReader("file_korean.txt");
			while(true) {
				//파일읽기
				read = reader.read();
				//-1이면 종료
				if (read == -1) {
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
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
