package spring;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class MemberRegisterService {
	@Autowired
	private MemberDao memberDao;
	
	public MemberRegisterService(){}
	public MemberRegisterService(@Qualifier("regSvc")MemberDao memberDao){
		this.memberDao = memberDao;
	}
	
	public void regist(RegisterRequest req){
		Member member = memberDao.selectByEmail(req.getEmail());
		if(member != null){
			throw new AlreadyExistingMemberException("이메일 중복 : " + req.getEmail());
		}
		
		Member newMember = new Member(req.getEmail(), req.getPassword(),
				req.getName(), new Date());
		memberDao.insert(newMember);
	}
}