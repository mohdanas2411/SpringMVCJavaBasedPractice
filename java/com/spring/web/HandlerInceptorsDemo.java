package com.spring.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class HandlerInceptorsDemo implements HandlerInterceptor {

    private final static Logger logger = LoggerFactory.getLogger(HandlerInceptorsDemo.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        long startTime = System.currentTimeMillis();
        logger.info("Request URL : "+ request.getRequestURL().toString()+" : Start Time "+System.currentTimeMillis());
        request.setAttribute("startTime",startTime);


        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("Request Handler "+request.getRequestURL().toString()+" sent to handler current time "+System.currentTimeMillis());

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        long startTime = System.currentTimeMillis();
        logger.info("Request URL::" + request.getRequestURL().toString()
                + ":: Start Time=" + System.currentTimeMillis());
        request.setAttribute("startTime", startTime);
    }
}
