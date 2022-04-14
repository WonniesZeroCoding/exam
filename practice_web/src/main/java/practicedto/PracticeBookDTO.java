package practicedto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@AllArgsConstructor
public class PracticeBookDTO {
	private int code;
	String title;
	String writer;
	private int price;
}
