package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class PerformanceTestEx1 { //buffered를 썼을때 빨라지는가
	public static void main(String[] args) {
		//FileInputStream 만 사용시
		try(FileInputStream fis = new FileInputStream("D:\\Coding & Java & Python 수업\\Temp\\pawel.jpg")) {
			long start = System.currentTimeMillis();
			while(fis.read()!=-1) {}
			long end = System.currentTimeMillis();
			
			System.out.println("FileInputStream만 사용시 "+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// FileInputStream + BufferedInputStream 사용시
		try(FileInputStream fis = new FileInputStream("D:\\Coding & Java & Python 수업\\Temp\\pawel.jpg")) {
			BufferedInputStream bis = new BufferedInputStream(fis);
				
			
			long start = System.currentTimeMillis();
			while(bis.read()!=-1) {}
			long end = System.currentTimeMillis();
			
			System.out.println("FileInputStream + BufferedInputStream 사용시 "+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
