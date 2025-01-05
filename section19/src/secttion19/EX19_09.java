package secttion19;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//예제 19_9 read(char[])메소드를 이용한 파일읽기
public class EX19_09 {
	public static void main(String[] args) {
		
		//파일을 읽어올 변수
		int read = 0;
		//스트림선언
		Reader in = null;
		
		try {
			in = new FileReader("file_korean.txt");
			char[] buffer = new char[256];
			while(true) {
				//파일읽기
				read = in.read(buffer);
				//-1이면 종료
				if(read == -1) {
					break;
				}
				System.out.println(String.valueOf(buffer,0,read));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Error : " + e.getMessage());
		}finally {
			try {
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
