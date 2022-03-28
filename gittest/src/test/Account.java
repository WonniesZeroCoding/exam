package test;

import lombok.Getter;
import lombok.Setter;


public class Account {
@Getter
@Setter

	private String ano;
	private int balance;
	
	public void print() {
		System.out.println("print");
	}
}
