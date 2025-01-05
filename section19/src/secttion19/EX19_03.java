package secttion19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//예제 19_3 1byte씩 출력하기
public class EX19_03 {
	public static void main(String[] args) {
		
		OutputStream out = null;
		try {
			out = new FileOutputStream("write.txt",false);
			out.write('H');
			out.write('E');
			out.write('L');
			out.write('L');
			out.write('O');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//객체가 사용중이면 닫는다
			try {
				if(out != null) {
					out.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
