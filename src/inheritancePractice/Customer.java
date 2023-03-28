package inheritancePractice;

public class Customer {
	private int customerID; //고객 아이디
	private String customerName; //고객이름
	private String customerGrade;// 고객등급
	int bonusPoint; //보너스 포인트
	double bonusRatio; //적립비율
	
	private int agentID;	//VIP고객 담당 상담원 아이디
	double saleRatio;	//할인율
	
	public Customer() {
		customerGrade ="SILVER";	//기본등급
		bonusRatio=0.01;	//보너스포인트 기본적립 비율
	}
	
	public int clacPrice(int price) {
		bonusPoint += price *bonusRatio;	//보너스 포인트 계산
		return price;//할인율 적용
	}
	
	
	public String showCustomerInfo() {
		return customerName +" 님의 등급은 "+customerGrade+"이미, 보너스 포인트는"+bonusPoint+"입니다";
	}

}
