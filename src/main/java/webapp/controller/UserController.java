package webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/db-viewn")
    public String getDbView() {

        return "db-view";
    }
}
