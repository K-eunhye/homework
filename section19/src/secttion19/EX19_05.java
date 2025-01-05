package secttion19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//예제19_5 read()와 write()를 이용한 이미지 복사
public class EX19_05 {
	public static void main(String[] args) {
		
		FileInputStream in = null;
		FileOutputStream out = null;	
		
		try {
			in = new FileInputStream("cat.jpg");
			out = new FileOutputStream("cat_copy.jpg");
			//현재 시간을 m/s단위로 나타냄
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read = 0;
			while((read = in.read()) != -1) {
				out.write(read);
			}
			System.out.println("이미지 읽기종료");
			long end = System.currentTimeMillis();
			long time = (end - start) / 1000;
			System.out.println(time + "초");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//열려있는 것 닫기
				if(out != null) {
					out.close();
				}
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
