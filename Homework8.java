import java.util.*;

public class Homework8 {
	public static void main(String[] args) {
		var idTable = new HashMap<String, String>();
		
		idTable.put("myId", "myPass");
		idTable.put("myId2", "myPass2");
		idTable.put("myId3", "myPass3");
		String id;
		String pass;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id�� password�� �Է����ּ���.");
			System.out.print("id : ");
			id = sc.nextLine();
			id = id.trim();
			if(idTable.get(id) == null) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				System.out.println();
				continue;
			}
			System.out.print("password : ");
			pass = sc.nextLine();
			pass = pass.trim();
			if(idTable.get(id).equals(pass)) {
				System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
				break;
			}
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
			System.out.println();
			continue;
		}
		sc.close();
	}
}
