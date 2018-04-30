package com.cx.eventbus.listener;

import com.google.common.eventbus.Subscribe;
import com.cx.eventbus.ApplicationEventBus;
import com.cx.eventbus.event.AutoReplyEvent;
import com.cx.interceptor.UserSecurityInterceptor;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class AutoReplyEventListener {

	private final ApplicationEventBus applicationEventBus;

	private static final Logger log = LoggerFactory.getLogger(AutoReplyEventListener.class);
	@Autowired
    public AutoReplyEventListener(ApplicationEventBus applicationEventBus){
        this.applicationEventBus = applicationEventBus;
    }
	
	@PostConstruct
    public void init(){
        this.applicationEventBus.register(this);
    }
	
	@Subscribe
	public void autoReply(AutoReplyEvent autoReplyEvent){
		log.info("autoReplyEvent.getTopicId()="+autoReplyEvent.getTopicId());
		log.info("autoReplyEvent.getUid()="+autoReplyEvent.getUid());
	}
}
