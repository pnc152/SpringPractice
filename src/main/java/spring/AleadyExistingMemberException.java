package spring;

public class AleadyExistingMemberException extends RuntimeException{
	public AleadyExistingMemberException(String msg){
		super(msg);
	}
}
