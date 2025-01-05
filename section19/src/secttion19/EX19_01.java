package secttion19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//예제 19-1 read()메소드를 이용한 파일 읽기
public class EX19_01 {

	public static void main(String[] args) {
		
		
		//파일을 읽어올 변수
		int read = 0;
		//스트림 선언
		InputStream in = null;
		
		
			try {
				in = new FileInputStream("my_text.txt");
				while(true) {
					//파일읽기
					read = in.read();
					//-1이면 좋료
					if(read == -1) {
						break;
					}
					System.out.println((char)read);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("Error : "+ e.getMessage());
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
