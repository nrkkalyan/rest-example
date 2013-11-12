package org.superbiz.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greeting {

    private String message;


    public Greeting() {

    }

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
