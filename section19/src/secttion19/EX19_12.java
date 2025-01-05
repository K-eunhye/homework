package secttion19;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//예제19_12 보조 스트림 읽기 성능 테스트
public class EX19_12 {
	public static void main(String[] args) {
		
		//기반 스트림
		FileInputStream readFile = null;
		//보조 스트림에 사용할 기반 스트림
		FileInputStream bisReadFile = null;
		//보조 스트림
		BufferedInputStream bis = null;
		
		
		
			try {
				System.out.println("기본 스트림으로 읽기 시작");
				readFile = new FileInputStream("cat.jpg");
				//현재 시간을 m/s단위로 나타냄
				long start = System.currentTimeMillis();
				System.out.println("이미지 읽기 시작1");
				while(readFile.read() != -1) {
					//이미지 읽기
				}
				System.out.println("이미지 읽기 종료");
				long end = System.currentTimeMillis();
				long time = (end-start) / 1000;
				
				System.out.println("소요시간 : " + time + "초");
				System.out.println("기본 스트림으로 읽기 종료");

				System.out.println("보조 스트림으로 읽기 시작");
				bisReadFile = new FileInputStream("cat.jpg");
				bis = new BufferedInputStream(bisReadFile);
				//현재 시간을 m/s단위로 나타냄
				start = System.currentTimeMillis();
				System.out.println("이미지 읽기 시작2");
				while(bis.read() != -1) {
					//이미지 읽기
				}
				System.out.println("이미지 읽기 종료2");
				end = System.currentTimeMillis();
				double result = (double)(end-start)/1000;
				
				System.out.println("소요시간 : " + time + "초");
				System.out.println("보조 스트림으로 읽기 종료");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					if(bis != null) {
						bis.close();
					}
					if(bisReadFile != null) {
						bisReadFile.close();
					}
					if(readFile != null) {
						readFile.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		
	}

}
