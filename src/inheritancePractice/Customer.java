package inheritancePractice;

public class Customer {
	private int customerID; //�� ���̵�
	private String customerName; //���̸�
	private String customerGrade;// �����
	int bonusPoint; //���ʽ� ����Ʈ
	double bonusRatio; //��������
	
	private int agentID;	//VIP�� ��� ���� ���̵�
	double saleRatio;	//������
	
	public Customer() {
		customerGrade ="SILVER";	//�⺻���
		bonusRatio=0.01;	//���ʽ�����Ʈ �⺻���� ����
	}
	
	public int clacPrice(int price) {
		bonusPoint += price *bonusRatio;	//���ʽ� ����Ʈ ���
		return price;//������ ����
	}
	
	
	public String showCustomerInfo() {
		return customerName +" ���� ����� "+customerGrade+"�̹�, ���ʽ� ����Ʈ��"+bonusPoint+"�Դϴ�";
	}

}
