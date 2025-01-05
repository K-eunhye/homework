package secttion19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//예제19_6 배열을 이용한 이미지 복사
public class EX19_06 {
	public static void main(String[] args) {
		
		FileInputStream in = null;
		FileOutputStream out = null;	
		
		
			try {
				in = new FileInputStream("cat.jpg");
				out = new FileOutputStream("cat_copy2.jpg");
				byte[] buffer = new byte[512];
				//현재 시간을 m/s단위로 나타냄
				long start = System.currentTimeMillis();
				System.out.println("이미지 읽기 시작");
				int read = 0;
				while((read = in.read(buffer)) != -1) {
					out.write(read);
				}
				System.out.println("이미지 읽기종료");
				long end = System.currentTimeMillis();
				double time = (double)(end - start) / 1000;
				System.out.println(time + "초");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					//열려있는 것 닫기
					if(out != null) {
						out.close();
					}
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
