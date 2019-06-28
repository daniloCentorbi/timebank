/*
 * Created by DC on 6/27/2019
 */

/*
 * Created by DC on 6/27/2019
 */

package it.dinokrodino.timebank.controllers;

import it.dinokrodino.timebank.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

    private final UserService userService;

    public IndexController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping({"","/","index","index.html"})
    public String getIndexPage(Model model){

        log.info("retrieving list users");
        model.addAttribute("users", userService.findAll() );

        return "index";
    }
}
