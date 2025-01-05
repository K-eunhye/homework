package secttion19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//예제19_4 byte 배열을 이용해 출력하기
public class EX19_04 {
	public static void main(String[] args) {
		
		OutputStream out = null;
		
		try {
			out = new FileOutputStream("write_arrty.txt",false);
			String str = "hellow world";
			//문장을 바이트 배열로 변환하여 반환
			byte[] strArray = str.getBytes();
			out.write(strArray);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//객체가 사용중이면 닫는다
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
