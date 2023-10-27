package org.example.exceptions;

public class InvalidMenuOptions extends Exception{
    public InvalidMenuOptions (String message){
        super(message);
    }
}
