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
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id : ");
			id = sc.nextLine();
			id = id.trim();
			if(idTable.get(id) == null) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				System.out.println();
				continue;
			}
			System.out.print("password : ");
			pass = sc.nextLine();
			pass = pass.trim();
			if(idTable.get(id).equals(pass)) {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
			System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			System.out.println();
			continue;
		}
		sc.close();
	}
}
