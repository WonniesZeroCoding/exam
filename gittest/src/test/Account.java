package test;

import lombok.Getter;
import lombok.Setter;


public class Account {
@Getter
@Setter

	private String ano;
	private int balance;
	
	public void deposit() {
		System.out.println("deposit");
	}
	public void withdraw() {
		System.out.println("withdraw");
	}
}
