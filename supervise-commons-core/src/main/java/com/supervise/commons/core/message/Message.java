/**
 * Project Name: zhys_server_control
 * File Name: Message.java
 * Package Name: com.zhys.server.controller.message
 * Date: 2016年4月6日下午5:30:15
 * Copyright (c) 2016, 深圳智慧药师股份有限公司  All Rights Reserved.
 */
package com.supervise.commons.core.message;

/**
 * TODO
 *
 */
public abstract class Message {

    protected int flag;

    public static int SUCCESS = 1;

    public static int FAILURE = -1;
    public Message(int code) {
        this.setFlag(code);
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

}
