package himedia.assignment.answers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

/*
[TODOS]
- 본 서블릿을 /getreq의 GET 메서드에 반응하도록 만들어 주십시오
- 전달된 name, age, location 파라미터를 받아 
- /WEB-INF/views/getreq.jsp로 forward 해 주십시오.
 */

@Controller
public class GetReqController {
	
	@GetMapping("/getreq")
	public String getReq(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String location = request.getParameter("location");
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("location", location);
		
		return "getreq";
	}
	
}
