package com.cx.controller;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cx.eventbus.ApplicationEventBus;
import com.cx.eventbus.event.AutoReplyEvent;


@RestController
@RequestMapping("/eventBus")
public class EventBusController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
    private ApplicationEventBus applicationEventBus;
    
    @RequestMapping(value = "/send", method = RequestMethod.GET)
    @ResponseBody
    public String send(HttpServletRequest request, HttpServletResponse response) {
        try {
        	applicationEventBus.post(new AutoReplyEvent(1, 2, new Date()));
            return "发送eventBus成功";
        } catch (Exception e) {
            logger.error("发送eventBus失败", e);
            return "发送eventBus失败";
        }
    }

}