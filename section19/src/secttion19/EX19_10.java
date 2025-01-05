package secttion19;

import java.io.FileWriter;
import java.io.IOException;

//예제19_10 FileWriter 스트림
public class EX19_10 {
	public static void main(String[] args) {
		
		FileWriter w=null;
		
		//FileOutputStream처럼 이어쓰기, 덮어쓰기 모드 존재함
		try {
			w = new FileWriter("fileText.txt");
			w.write('H');
			w.write('A');
			w.write('P');
			w.write('P');
			w.write('Y');
			w.write('\n');
			System.out.println("파일생성완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(w != null) {
					w.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
