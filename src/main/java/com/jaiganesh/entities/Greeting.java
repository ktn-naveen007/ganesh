package com.jaiganesh.entities;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Greeting {
	
	private  int id;
    private  String content;
    
	public Greeting(int incrementAndGet, String format) {
		// TODO Auto-generated constructor stub
		this.id = id;
        this.content = content;
	}

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
