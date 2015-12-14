package spring;

import org.springframework.stereotype.Component;


//전체 회원을 조회해서 화면에 출력해주는 서비스 담당
public class MemberPrinter {
	public void print(Member member){
		System.out.printf("회원정보 : 아이디=%d, 이메일=%s, 등록일=%tF\n",
				member.getId(), member.getEmail(), member.getRegisterDate());
	}
}
