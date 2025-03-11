package himedia.assignment.answers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

/*
[TODOS]
- 본 서블릿을 /users/logout의 요청에 반응하도록 만들어 주십시오(GET, POST 방식에 관계 없이 작동하게 해 주십시오)
- HttpSession을 무효화(invalidate)하고 홈 페이지로 리다이렉트(Redirect)해 주십시오.
 */

@Controller
public class UserLogoutController {
	@GetMapping("/users/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("authUser");
		session.invalidate();

		return "redirect:/";
	}

}
