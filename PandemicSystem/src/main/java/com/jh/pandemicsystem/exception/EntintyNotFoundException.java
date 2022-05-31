package com.jh.pandemicsystem.exception;

import lombok.Getter;

@Getter
public class EntintyNotFoundException extends RuntimeException{
    private final String msg;

    public EntintyNotFoundException(String msg){
        this.msg = msg;
    }
}
