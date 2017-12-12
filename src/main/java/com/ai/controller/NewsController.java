package com.ai.controller;

import com.ai.model.HostHolder;
import com.ai.service.NewsService;
import com.ai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by qian on 2017/12/11.
 */
@Controller
public class NewsController {
    @Autowired
    NewsService newsService;
    @Autowired
    HostHolder hostHolder;
    @Autowired
    UserService userService;
    @Autowired

}
