package com.ai.configuration;

import com.ai.interceptor.LoginRequiredInterceptor;
import com.ai.interceptor.PassportInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by qian on 2017/12/11.
 */
public class TensorWebConfiguration  extends WebMvcConfigurerAdapter{
    @Autowired
    PassportInterceptor passportInterceptor;
    @Autowired
    LoginRequiredInterceptor loginRequiredInterceptor;
    @Override
    public void  addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(passportInterceptor);
        registry.addInterceptor(loginRequiredInterceptor).
                addPathPatterns("/msg/*").addPathPatterns("/like").addPathPatterns("/dislike");
        super.addInterceptors(registry);

    }

}
