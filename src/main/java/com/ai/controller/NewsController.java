package com.ai.controller;

import com.ai.model.HostHolder;
import com.ai.service.NewsService;
import com.ai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by qian on 2017/12/11.
 */
public class NewsController {
    @Autowired
    NewsService newsService;
    @Autowired
    HostHolder hostHolder;
    @Autowired
    UserService userService;
    @Autowired

}
