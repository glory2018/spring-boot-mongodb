/*
 * Copyright © 2019 bjfansr@cn.ibm.com Inc. All rights reserved
 * @description: guru.springframework.controllers.IndexController
 * @version V1.0
 */
package guru.springframework.controllers;

import guru.springframework.domain.Post;
import guru.springframework.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author Moses
 * @date 2019/10/20
 */
@Controller
public class IndexController {
    private PostService postService;

    @RequestMapping({"/index"})
    public String index(Model model) {
        model.addAttribute("newfeature", "I am running from Docker");
        return "post/list";
    }

    @RequestMapping({"/save"})
    public String save(Model model) {
        postService.save(new Post(1, "This is first POST!!!!", new Date()));
        return "post/list";
    }
}
