package io;

import java.io.Serializable;

public class Person implements Serializable/*직렬화를 하기 위함 implements Serializable*/{
	
	//직렬화 : 인스턴스를 저장, 전송
	//역직렬화 : 저장된 내용을 다시 복원
	private static final long serialVersionUID = -2806855282281182967L;
	//serial 버전을 붙이는 이유 : 역직렬화 시, 직렬화된 것과 같은 클래스인지 구별할 때 사용(참고사항)
	//private static final long serialVersionUID = 1L;
	
	private String name;
	private String job;
	//transient String job; // transient : 이 필드는 직렬화 시키지 않겠다
	
	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	
	
}
