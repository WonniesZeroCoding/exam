package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx2 {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("D:\\Coding & Java & Python 수업\\Temp\\pawel.jpg")) {
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("D:\\Coding & Java & Python 수업\\Temp\\pawel_copy.jpg");
			BufferedOutputStream bos = new BufferedOutputStream(fos); 
			
			int data;
			while((data=bis.read())!=-1) {
				bos.write(data);
			
			}
		} catch (Exception e) {
			e.printStackTrace(); // 오류가 나면 봐야하기 때문에 개발할 때 많이쓰는 구문 : catch~
		}
	}
}
