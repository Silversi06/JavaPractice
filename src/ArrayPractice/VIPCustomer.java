package ArrayPractice;

public class VIPCustomer extends Customer{	//VIPCustomer Ŭ������ CUstomerŬ������ ��ӹ���
	private int agentID;	//VIP�� ���� ���̵�
	double saleRadio; 	//������
	
	public VIPCustomer() {
		//customerGrade ="VIP";	//����Ŭ�������� private �����̹Ƿ� ���� �߻�
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	public int getAgentID() {
		return agentID;
	}


}
