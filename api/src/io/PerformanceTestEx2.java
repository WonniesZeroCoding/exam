package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class PerformanceTestEx2 { //buffered를 썼을때 빨라지는가
	public static void main(String[] args) {

		
		// FileInputStream + BufferedInputStream 사용시
		try(FileInputStream fis = new FileInputStream("D:\\Coding & Java & Python 수업\\Temp\\hold.mp4")) {
			BufferedInputStream bis = new BufferedInputStream(fis);
				
			
			long start = System.currentTimeMillis();
			while(bis.read()!=-1) {}
			long end = System.currentTimeMillis();
			
			System.out.println("FileInputStream + BufferedInputStream 사용시 "+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		// FileInputStream + BufferedInputStream 사용시 + byte 배열
				try(FileInputStream fis = new FileInputStream("D:\\Coding & Java & Python 수업\\Temp\\hold.mp4")) {
					BufferedInputStream bis = new BufferedInputStream(fis);
						
					byte data[] = new byte[4096];
					
					long start = System.currentTimeMillis();
					while(bis.read(data)!=-1) {}
					long end = System.currentTimeMillis();
					
					System.out.println("FileInputStream + BufferedInputStream 사용시 + byte배열 사용시 "+(end-start));
				} catch (Exception e) {
					e.printStackTrace();
				}
	
	
	
	}
}