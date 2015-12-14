package spring;

import org.springframework.stereotype.Component;


public class AlreadyExistingMemberException extends RuntimeException{
	public AlreadyExistingMemberException(String msg){
		super(msg);
	}
}