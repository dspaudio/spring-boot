package family.namkang.springboot.web.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiPostController {
    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
}
