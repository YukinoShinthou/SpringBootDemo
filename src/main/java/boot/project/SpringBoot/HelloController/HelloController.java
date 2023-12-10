package boot.project.SpringBoot.HelloController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @Value("${hello}")
    private String helloMessage;

    @GetMapping("/hello")
    public String helloWorld(Model model){
        System.out.println(this.helloMessage);
        model.addAttribute("message", this.helloMessage);
        return "/hello";
    }
}
