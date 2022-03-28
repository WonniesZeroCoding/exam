package member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//member 테이블하고 똑같이 만들어라
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
	
	private int id;
	private String name;
	private String addr;
	private String email;
	private int age;
	
	
	public MemberDTO(String name, String addr, String email, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.email = email;
		this.age = age;
	}
	
	
	
	
}
