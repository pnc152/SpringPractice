package spring;

public class MemberRegisterService {
	private MemberDao memberDao;
	
	public MemberRegisterService(){}
	public MemberRegisterService(MemberDao memberDao){
		this.memberDao = memberDao;
	}
	
	public void regist(RegisterRequest req){
		Member member = memberDao.selectByEmail(req.getEmail());
		if(member != null){
			throw new AleadyExistingMemberException("이메일 중복 : " + req.getEmail());
		}
		
		Member newMember = new Member(req.getEmail(), req.getPassword(), req.getName(), new Date());
		memberDao.insert(newMember);
	}
}
