package ListȰ�����;

public class ListȰ����� {
public static void main(String[] args) {
	
	Controller con = new Controller();
	while(true) {
	System.out.println("ȸ���� �Խ��� ���α׷�");
	System.out.println("1. ���� 2. �α��� 3. ����");
	int ch = Controller.getSc().nextInt();
	if(ch == 1) {
		System.out.println(" --- ȸ������ ������ --- ");
		System.out.println("Id : "); String id = Controller.getSc().next();
		System.out.println("Pw : "); String pw = Controller.getSc().next();
		System.out.println("Name : "); String name = Controller.getSc().next();
		System.out.println("Address : "); String address = Controller.getSc().next();
		System.out.println("Email : "); String email = Controller.getSc().next();
		System.out.println("PhoneNumber : "); String number = Controller.getSc().next();
		boolean result = con.Signup(id, pw, name, address, email, number);
		if(result) System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		else System.out.println("ȸ�������� �����Ͽ����ϴ�. ���̵� �ߺ��˴ϴ�.");
	}
	else if(ch == 2) {
		System.out.println(" --- �α��� ������ --- ");
		System.out.println("Id : "); String id = Controller.getSc().next();
		System.out.println("Pw : "); String pw = Controller.getSc().next();
		boolean result = con.Login(id, pw);
		if(result) System.out.println("�α��� ����!");
		else System.out.println("�α��� ����!");
	}
	else if(ch == 3) {
		System.out.println("���α׷��� �����մϴ�.");
		Controller.getSc().close();
		break;
	}
	}
}
}
