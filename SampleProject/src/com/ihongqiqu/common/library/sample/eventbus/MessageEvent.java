package com.ihongqiqu.common.library.sample.eventbus;

/**
 * Events are POJO (plain old Java object) without any specific requirements.
 *
 * Created by zhenguo on 5/19/15.
 */
public class MessageEvent {

    public final String message;

    public MessageEvent(String message) {
        this.message = message;
    }

}
