package ArrayPractice;

public class VIPCustomer extends Customer{	//VIPCustomer 클래스는 CUstomer클래스를 상속받음
	private int agentID;	//VIP고객 상담원 아이디
	double saleRadio; 	//할인율
	
	public VIPCustomer() {
		//customerGrade ="VIP";	//상위클래스에서 private 변수이므로 오류 발생
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	public int getAgentID() {
		return agentID;
	}


}
