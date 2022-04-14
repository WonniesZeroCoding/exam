package book.action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActionForward {
	//path, 이동 방식
	private String path;
	private boolean redirect; // true(sendRedirect), false(forward)
}
