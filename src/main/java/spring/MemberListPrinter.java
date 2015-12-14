package spring;

import java.util.Collection;

import org.springframework.stereotype.Component;

public class MemberListPrinter {
	private MemberDao memberdao;
	private MemberPrinter printer;
	
	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer){
		this.memberdao = memberDao;
		this.printer = printer;
	}
	
	public void selectAll(){
		Collection<Member> members = memberdao.selectAll();
		for(Member m : members){
			printer.print(m);
		}
	}
}
