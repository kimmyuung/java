package ��������Ʈ����_6��_�Խ���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.regex.Pattern;






public class Controller {

	static LocalDateTime yourDate;
	static String yourCategory;
	static int yourStoryNum;
	
	public static ArrayList<Account> acountlist = new ArrayList<>();
	public static ArrayList<Board> boardlist = new ArrayList<>();
	public static ArrayList<Block> ��������list = new ArrayList<>();

	
	public static int boardtnum = 1;
	public static String[] ī�װ� = {"�ڹ�","C���","����"}; 
	public static String[] ����Ʈ���� = new String[6];
	public static String[] ������ = {"[��]","[��]","[��]","[��]","[��]",
			  "[��]","[��]","[��]","[��]","[��]",
			  "[��]","[��]","[��]","[��]","[��]"};// 0 ~ 14 �ε���
	
	
	public static int ȸ�����Ծ��̵�(String id) {
		String pattern = "^[0-9|a-z|A-Z]*$";
		if(!Pattern.matches(pattern, id)){
			  return 1; // ���̵� Ư������ or ���� or �ѱ��� ��
			}
		if(id.length()<1 || id.length()>6) {
			return 2; // ���̵���̰� 1~6�ڸ��� �ƴ�
		}
		for(Account temp : acountlist) {
			if(temp.getId().equals(id)) {
				return 3; // ���̵� �ߺ�
			}
		}
		return 4; // �������� ���̵�
	}
	
	public static int ȸ�����Ժ�й�ȣ(String pw, String pwcheck) {
		
		if(pw.contains(" ")) {
			  return 1; // ��й�ȣ�� ���� ����
			}
		if(!pw.equals(pwcheck)) {
			return 2; // ��й�ȣ Ȯ�� Ʋ��
		}
		if(pw.length()<4 || pw.length()>12) {
			return 4; // ��й�ȣ�� 4~12�ڸ��� �ƴ�
		}
		return 3; // �������� ��й�ȣ
	}
	
	public static boolean ȸ������(String id, String pw, String pwcheck, String name, String email, String phone) throws IOException {
		for(Account temp : acountlist) {
			if(temp.getPhone().equals(phone)) {
				return false; // �ش� ��ȭ��ȣ�� ������ ȸ���� ����
			}
		}
		Account temp = new Account(id, pw, name, email, phone, 100, 0, null );
		acountlist.add(temp);
		Controller.ȸ������ó��(id);
		return true; // ȸ������ ����
		
	}
	
	
	
	///////////////////////////////////ȸ������ ó�� ����/////////////////////////////////////////////
	static void ȸ������ó��(String id) throws IOException{
		
		//ȸ������
			//���Ͽ� [���̵�,���,�̸�,�̸���,����]�������� ����
		FileOutputStream out_a = new FileOutputStream("C:/Users/504/Desktop/������6�� �������̸�Ʈ Ŀ�´�Ƽ/ds/ȸ��.txt");
		String storage_a1="";
		for(Account temp001 : acountlist) {
				id = temp001.getId();
				String pw = temp001.getPw();
				String name = temp001.getName();
				String email = temp001.getEmail();
				String phone = temp001.getPhone();
				int point = temp001.getPoint();
				int report = temp001.getReport();
				String friend = null;
				
			
				String storage_a = id+","+pw+","+name+","+email+","+phone+","+Integer.toString(point)+","+Integer.toString(report)+","+friend+"\n";		
				
				storage_a1 =storage_a1+ storage_a;// �ǽð� �����Ǵ� ȸ�������� ���Ͽ� ����
				//ȸ�������Ҷ��Ӹ� �ƴ϶� �ǽð����� ȸ�������� �����ϱ� ���� true�� �̿��� �̾�� ����ó����
				//����Ѵٸ� �ߺ�ȸ���� ���ϳ��� �����ϰ� �Ǿ� true���� �� StringŬ����������
				//���� ���ο� ���ϳ������� �����Ͽ���.
				
		}

		out_a.write(storage_a1.getBytes());		
	
		
	}//ȸ��e
	
	
	public static boolean ȸ�����() throws IOException {
		
		FileInputStream input_a = new FileInputStream("C:/Users/504/Desktop/������6�� �������̸�Ʈ Ŀ�´�Ƽ/ds/ȸ��.txt");
		byte[] bytes_a = new byte[1024]; // ����Ʈ�迭��
		input_a.read(bytes_a);				// ����Ʈ �б�
		String str_a = new String(bytes_a); // �Ͼ�°� ����
		String[] ȸ��1 = str_a.split("\n"); //1ȸ�۸��� �ڸ���
		for(int t = 0; t < ȸ��1.length-1 ; t++) {	// ȸ�������̸�ŭ �ݺ�
			if(ȸ��1[t] != null && !ȸ��1[t].equals("") ) {
				String[] ȸ����� = ȸ��1[t].split(",");
				String a_a = ȸ�����[0]; // ȸ�� ���̵�
				String b_a = ȸ�����[1]; // ȸ�� ���
				String c_a = ȸ�����[2]; // ȸ�� �̸�
				String d_a = ȸ�����[3]; // ȸ�� �̸���
				String e_a = ȸ�����[4]; // ȸ�� ����
				String f_a = ȸ�����[5]; // ȸ�� ����Ʈ
				
				String h_a = ȸ�����[6]; // ȸ�� �Ű�
				String i_a = ȸ�����[7]; // ȸ�� ģ��

				Account o_a = new Account(a_a,b_a,c_a,d_a,e_a,Integer.parseInt(f_a),Integer.parseInt(h_a),i_a);
				
				//�迭�� ���� ��Ұ� ����
				Controller.acountlist.add(o_a);
			
			}
		}
		return true; //�Ϻ����� ����
	}
	
	                       ///////ȸ������ �������� ����ó�� ����/////////   
	static void ��������ó��(String id) throws IOException {
		for(Block temp : ��������list) {
			if(temp.getIndex().equals(id)) {
				FileOutputStream out_c = new FileOutputStream("C:/Users/504/Desktop/������6�� �������̸�Ʈ Ŀ�´�Ƽ/ds/��������.txt");
				String storage_c = id+"@@"+temp.getTarget()+"\n";		
				out_c.write(storage_c.getBytes());		
				
			}
		}
	}
	
	public static boolean �������() throws IOException {
		
		FileInputStream input_c = new FileInputStream("C:/Users/504/Desktop/������6�� �������̸�Ʈ Ŀ�´�Ƽ/ds/��������.txt");
		byte[] bytes_c = new byte[1024]; // ����Ʈ�迭��
		input_c.read(bytes_c);				// ����Ʈ �б�
		String str_c = new String(bytes_c); // �Ͼ�°� ����
		String[] ����1 = str_c.split("\n"); //1ȸ�۸��� �ڸ���
		for(int t = 0; t < ����1.length-1 ; t++) {	// ȸ�������̸�ŭ �ݺ�
			if(����1[t] != null ) {
				String[] ���ܿ�� = ����1[t].split("@@");
				
				String a_c = ���ܿ��[0]; 
				String b_c = ���ܿ��[1]; 

				Block o_c = new Block(a_c,b_c);
				
				//�迭�� ���� ��Ұ� ����
				Controller.��������list.add(o_c);
			
			}
		}
		return true; 
	}
	                          //////ȸ������ �������� ����ó�� ��//////
	
	
	
	
	///////////////////////////////////ȸ������ ó�� ��/////////////////////////////////////////////

	public static int �α���(String id, String pw) {
		boolean idcheck = false;
		for(Account temp : acountlist) {
			if(temp.getId().equals(id)) {
				idcheck = true;
			}
		}
		for(Account temp : acountlist) {
			if(temp.getId().equals(id) && temp.getPw().equals(pw)) {
				return 1; // �α��� ����
			}
		}
		if(idcheck==false) {
			return 2; // ���Ե� ���̵� ����
		}
		return 3; // ��й�ȣ Ʋ��
	}

	
	public static boolean �۾���(String id, String title, String content, String category) throws IOException {//����
		//id, ����, ����, �ۼ���id, ī�װ� �޾ƿ���
		LocalDateTime date= LocalDateTime.now();// ���糯¥����
		//��ȣ �ҷ�����
		for(Board temp : boardlist) {
			if(boardtnum > temp.getIndex()) {
				boardtnum = temp.getIndex() + 1;
			}else {
				boardtnum++;
			}
		}
		yourDate = date;
		yourCategory = category;
		yourStoryNum = boardtnum;
		
		//����, ����, �ۼ���, ��¥, ��ȸ��, ī�װ�, ��õ��, ����õ��, ���Ŭ����, �Ű���Ƚ�� ��üȭ��list�� ����
		boardlist.add(new Board(title, content, id, date, 0, category, 0, 0, 0, boardtnum));
		Controller.�Խù�����ó��();
		
		boardtnum++;
		for(Account temp : acountlist) {
			if(temp.getId().equals(id)) {
				temp.setPoint(temp.getPoint() + 5);
				Controller.ȸ������ó��(id);
				break;
			}
		}
		/* ����ó�� �޼ҵ� ó�� ������ true��ȯ
		 * 
		 */		
		return true;// �ӽù�ȯ
	}
	public static boolean �ۻ󼼺���(String id, int index) {// �ε�����ġ�ϴ� ��ȣ ã���� ���� ���� ��ȯ
		ArrayList<String> templist = new ArrayList<>();
		for (Account temp2 : Controller.acountlist) {
			for (Block temp : Controller.��������list) {
				if (temp2.getId().equals(id) && temp.getIndex().equals(id)) {
					templist.add(temp.getTarget());
				}
			}
		}
		
		for(Account temp : acountlist) {
			if(temp.getId().equals(id) && !templist.isEmpty() ) { // �α����� ���̵��� ������������� ������
				for(Board temp2 : boardlist) {
					if(temp2.getIndex()==index && templist.contains(temp2.getWriter()) ) {
						// �ش� �ε����� �� �ۼ��ڰ� ����������Ͽ� ���ԵǾ� ������
						return false; // �ش� �� �������� ����
					}
				}
			}
		}
		//index �޾ƿͼ� �ش��ã��
		 //�ε�����ȣ
		for(Board temp : boardlist) {
			if(temp.getIndex() == index) {
				//ã�� �ε��� ��ȣ �ִٰ� true ��ȯ
				return true;
			}
		}
		return false;	
	}
	
	
	////////////////////////////////////�۾��� ����ó�� ����////////////////////////////////////////////////////

	static void �Խù�����ó��() throws IOException{
	      FileOutputStream out = new FileOutputStream("C:/Users/504/Desktop/������6�� �������̸�Ʈ Ŀ�´�Ƽ/ds/�Խù�.txt");
	      String storage_c6 = "";
	      for(Board temp002 : boardlist) {
	         String title = temp002.getTitle();
	         String content = temp002.getContent();
	         String writer = temp002.getWriter();
	         LocalDateTime date = temp002.getDate();
	         int view = temp002.getView();
	         String category = temp002.getCategory();
	         int good = temp002.getGood();
	         int bad = temp002.getBad();
	         int report = temp002.getReport();
	         int index = temp002.getIndex();
	         
	         String storage_c7 = title+","+content+","+writer+","+date.format(DateTimeFormatter.ofPattern("yyyyMMddHHmm"))+","+Integer.toString(view)+","+category+","+Integer.toString(good)+","+Integer.toString(bad)+","+Integer.toString(report)+","+Integer.toString(index)+"\n";
	         
	         storage_c6 = storage_c6+storage_c7;
	         
	      }
	      out.write(storage_c6.getBytes());      

	      
	   }//��Ȯ��e
	   
	
	
	public static boolean �Խù����() throws IOException {
		
		FileInputStream input = new FileInputStream("C:/Users/504/Desktop/������6�� �������̸�Ʈ Ŀ�´�Ƽ/ds/�Խù�.txt");
		byte[] bytes = new byte[1024]; // ����Ʈ�迭��
		input.read(bytes);				// ����Ʈ �б�
		String str = new String(bytes); // �Ͼ�°� ����
		String[] ��1 = str.split("\n"); //1ȸ�۸��� �ڸ���
		for(int t = 0; t < ��1.length-1 ; t++) {	// ȸ�������̸�ŭ �ݺ�
			//String lastCharacter = ��1[t].substring(��1[t].length() - 1);
			if(��1[t] != null && !��1[t].equals("") ) {
				String[] �Խù���� = ��1[t].split(",");
				String a = �Խù����[0]; // �Խù� ����
				String b = �Խù����[1]; // �Խù� ����
				String c = �Խù����[2]; // �ۼ���
				String d = �Խù����[3]; // ��¥

				
				// D(String ) -> LocaldateTime ����ȯ				
				DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
				LocalDateTime dd = LocalDateTime.parse( d , formatter);
				
				String e = �Խù����[4]; // ��ȸ��
				String f = �Խù����[5]; // ī�װ�
				String g = �Խù����[6]; // ��õ��
				String h = �Խù����[7]; // ����õ��
				String i = �Խù����[8];  // �Ű���Ƚ��
				String j = �Խù����[9]; //�۹�ȣ
				Board o = new Board(a,b,c,dd,Integer.parseInt(e),f,Integer.parseInt(g),Integer.parseInt(h),Integer.parseInt(i),Integer.parseInt(j));
				
				//�迭�� ���� ��Ұ� ����
				Controller.boardlist.add(o);
			
			}
		}
		return true; //�Ϻ����� ����
	}
	////////////////////////////////////�۾��� ����ó�� ��////////////////////////////////////////////////////
	
	
	public static void ����ۼ�(String con, int index, String id) {
		LocalDateTime date = LocalDateTime.now();
		for(Board temp : Controller.boardlist) {
			if(temp.getIndex() == index) { // �����ε�����ȣ�� ����������
				Reply e = new Reply(con, id, date,0,0,0,index);
				temp.getReplylist().add(e);		
				break;
			}
		}
		for(Account temp : acountlist) {
			if(temp.getId().equals(id)) {
				temp.setPoint(temp.getPoint() + 5);
				try {
					Controller.ȸ������ó��(id);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		}
	}
	public static boolean �ۼ������̵�üũ(String id, int index) {
		for(Board temp : boardlist) {
			if(temp.getWriter().equals(id) && temp.getIndex()==index) {return true;}
		}
		return false;
	}
	public static boolean �ۼ�����й�ȣüũ(String id,String pw,int index) {
		for(Board temp : boardlist) {
				for(Account temp2 : acountlist) {
					if(temp.getWriter().equals(id) && temp2.getPw().equals(pw) && temp.getIndex()==index) {
						return true;
					}
				}
		}
		return false;
	}
	public static void �ۼ���(int index, String title, String content) {
		boardlist.get(index-1).setTitle(title);
		boardlist.get(index-1).setContent(content);
		try {
			�Խù�����ó��();
		} catch (IOException e) {
			
		}
	}


	public static void �ۻ���(String id, String pw, int index) {
		boolean delete = false;
		for(Board temp2 : boardlist) {
			if(temp2.getIndex()==index) {
				for(Account temp : acountlist) {
					if(temp.getPw().equals(pw) && temp.getId().equals(id)) {
						delete = true;

					}
				}
			}
			
		}
		if(delete) {
			for(Board temp : boardlist) {
				if(temp.getIndex()==index) {
					boardlist.remove(temp);
					break;
				}
			}
			
		}
	}
	
	
	public static ArrayList<Board> �˻�(String serch) {
		ArrayList<Board> �˻���� = new ArrayList<Board>();
		�˻����.clear();
		for(Board temp : boardlist) {
			if(temp.getTitle().indexOf(serch)!=-1) {
				Board temp2 = new Board(temp.getTitle(), temp.getContent(), temp.getWriter(), 
						temp.getDate(), temp.getView(), temp.getCategory(), temp.getGood(), temp.getBad(), 
						temp.getReplylist(), temp.getReport(), temp.getIndex());
				�˻����.add(temp2);
				return �˻����; // �˻���� ���
			}
		}
		return �˻����;
	}
	
	
	public static ArrayList<Board> �α��(String ī�װ�) {// ī�װ� ����ͼ�
		
		// �ӽ÷� �� board ����Ʈ
		ArrayList<Board> �ӽ� = new ArrayList<>();
		for(Board temp : boardlist) {
			if(temp.getCategory().equals(ī�װ�)) {
				�ӽ�.add(temp);
			}	
		}
		// ���� ���ų� ũ�� �ְ� �����
		for(int i = 0; i < �ӽ�.size(); i++) {
			Board temp = �ӽ�.get(i);
			for(int j = 0; j < �ӽ�.size() ; j++) {
				if(temp.getGood() - temp.getBad() > �ӽ�.get(j).getGood() - �ӽ�.get(j).getBad()) {
					temp = �ӽ�.get(j);
					�ӽ�.set(j, �ӽ�.get(i));
					�ӽ�.set(i, temp);
				}
			}
		}
		return �ӽ�;
	}// m end
	public static boolean ��ۼ���(int ���ε���, int ����ε���, String ��ۼ���, String id) {
		// ���ε��� / �ε���/ ������ ���� / id �޾ƿͼ� 
		// �ش�۳��� ��۸���Ʈ�� ����ε��� ������ ���̵� üũ �� ����
		for(Board temp : boardlist) {
			if(temp.getIndex() == ���ε���) { // �ش�� ã��
				if(temp.getReplylist().get(����ε���).getWriter().equals(id)) {// �ش���� ���ϴ� ����ε����� �ۼ��ڰ� id����ġ������
					// ���� ����
					temp.getReplylist().get(����ε���).setContent(��ۼ���);
					return true;
				}		
			}// �Խù� ��ã�� if end
		}
		return false;
	}
	public static boolean ��ۻ���(int ���ε���, int ����ε���, String id) {
		// ���ε��� / �ε���/ ������ ���� / id �޾ƿͼ� 
				// �ش�۳��� ��۸���Ʈ�� ����ε��� ������ ���̵� üũ �� ����
				for(Board temp : boardlist) {
					if(temp.getIndex() == ���ε���) { // �ش�� ã��
						if(temp.getReplylist().get(����ε���).getWriter().equals(id)) {// �ش���� ���ϴ� ����ε����� �ۼ��ڰ� id����ġ������
							// ���� ����
							temp.getReplylist().remove(����ε���);
							return true;
						}		
					}// �Խù� ��ã�� if end
				}
				return false;
		}
	public static int ���ǰ��(String[] result,String id) {
		int[] count = new int[result.length]; // ��ġ�ϴ� �� Ȯ�ο� �迭 
		int max = 0; 
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result.length; j++) {
				if(result[i].equals("["+(j+1)+"]") ) { // ���� �� Ȯ��
					count[j]++; // ��ġ�ϴ� �� ����
				}
			}
		}
		for(int i=0; i<count.length; i++) {
			if(count[i]>max) {
				max=count[i]; // ���� ���� ��ġ�ϴ� ��
			}
		}
		for(Account temp : acountlist) {
			if(temp.getId().equals(id)) {
				if(max==6) { // 1��
					temp.setPoint(temp.getPoint()+1000); // ����Ʈ 1000 �߰�
					try {
						Controller.ȸ������ó��(id);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					try {
						Controller.ȸ������ó��(id);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					return 1;
				} else if(max==5) {
					temp.setPoint(temp.getPoint()+300); // ����Ʈ 300 �߰�
					try {
						Controller.ȸ������ó��(id);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					return 2;
				} else if(max==4) {
					temp.setPoint(temp.getPoint()+100); // ����Ʈ 100 �߰�
					try {
						Controller.ȸ������ó��(id);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					return 3;
				} else if(max==3) {
					temp.setPoint(temp.getPoint()+10); // ����Ʈ 10 �߰�
					try {
						Controller.ȸ������ó��(id);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					return 4;
				} 	
			} // if end
		} // for end
		return 5; // ��
	}
	
	public static String[] ����(String id) {
		String[] ����Ʈ���� = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
		for(Account temp : acountlist) {
			if(temp.getId().equals(id)) {
				if(temp.getPoint()<10) { // ��������Ʈ�� 10���� ������
					return ����Ʈ����;
				}else { // ��������Ʈ�� 10 �̻��̸� ��������Ʈ���� 10 ����
					temp.setPoint(temp.getPoint()-10); 
					try {
						Controller.ȸ������ó��(id);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		}
			
		Random random = new Random();
		for(int i=0; i<����Ʈ����.length; i++) {
			int num = random.nextInt(����Ʈ����.length)+1; // 1~6 ���� ����
			����Ʈ����[i]="["+num+"]";
		}
		return ����Ʈ����;
	}
	
	public static ArrayList<Account> ����Ʈ��ŷ() {
		ArrayList<Account> rank = new ArrayList<>(); // ��ŷ ����Ʈ ����
		rank.addAll(acountlist); // ȸ�� ����Ʈ�� ��ŷ ����Ʈ�� ����
		
		Collections.sort(rank, new Acountsort()); // ��ŷ ����Ʈ�� ����Ʈ���� ������� ����
		
		return rank; // ��ŷ ����Ʈ ��ȯ
		

	}
public static boolean �Ű�(String id,int index) throws IOException {
		
		for(Board temp : boardlist) {
			if(temp.getIndex()==index && temp.getWriter().equals(id)) {
				return false; // �Ű��� ���̵� �ڽ��� ���̵�
			}
		}
		String reportid = null;
		for(Board temp : boardlist) {
			if(temp.getIndex()==index) {
				
				temp.setReport(temp.getReport()+1);
				reportid = temp.getWriter() ;
				break;
			}
		}
		
		Block a = new Block(id, reportid); 
		��������list.add(a);
		��������ó��(id);
		
		return true;
	}
	
	public static boolean ����Ȯ��(String id, int ��ȣ) {
		// ������ȣ, ���̵� �޾ƿͼ� �ִ���������üũ
		for(Account temp : acountlist) {
			if(temp.getId().equals(id)) {// ���̵��� ��ġ�ϸ�
				for(Whisper temp2 : temp.get����()) { // �׾ȿ� ���� list ��������
					if(temp2.get��ȣ() == ��ȣ) { // list �� ��ȣ�� ����������
						return true;
					}
				}
			}
		}// for end
		return false;
	}
	
	public static boolean ����������(String receiveid, String id, String con) {
		// �޴»��, id, ����޾Ƽ�
		for(Account temp : acountlist) {
			if(temp.getId().equals(receiveid)) {// id����ġ�ϴ� acount Ŭ������ ã�Ƽ�
					// ����list�� ���� �߰�
					temp.get����().add(new Whisper(temp.getId(), id, con, temp.get����().size() + 1));
					try {
						��������ó��(receiveid);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return true;
			}
		}
		return false;
		
	}

	public static String ���̵�ã��(String name, String phone, String email) {
		for(Account temp : acountlist) {
			if(temp.getName().equals(name) && temp.getEmail().equals(email)
					&& temp.getPhone().equals(phone)) {
				return temp.getId();
			}
		}
		return "1";
	}
	public static String ��й�ȣã��(String id, String phone, String email) {
		for(Account temp : acountlist) {
			if(temp.getId().equals(id) && temp.getEmail().equals(email)
					&& temp.getPhone().equals(phone)) {
				return temp.getPw();
			}
		}
		return "1";
	}
	
	
	public static void ��õ����(boolean ����, int index, String id) {
		boolean pass = true; // ���̵� �ߺ����� üũ
		for(Board temp : boardlist) {
			for(String s : temp.getP()) { // �ش�� p����Ʈ�ȿ�
				if(temp.getIndex()==index && s.equals(id)) {		 // ���̵��� ��ġ�ϸ�
					pass = false; 		//��õ ���� ��������
				}
			}	
		}
		if(pass) { // �ߺ��Ⱦ��̵� �ƴ϶��
			for(Board temp : boardlist) {
				if(����) {
					if(temp.getIndex() == index) {
						temp.setGood(temp.getGood() + 1);//��õ �����ø���
						temp.getP().add(id);
						try {
							�Խù�����ó��();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					}		
				}else {
					if(temp.getIndex() == index) {
						temp.setBad(temp.getBad() + 1);//���� �����ø���
						temp.getP().add(id);
						try {
							�Խù�����ó��();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					}		
				}
			}	
		}	
	}
	
	public static int[] ����ã����Ӽ���() {
		// 1. ���Ӽ���
		Random random = new Random();
		int[] ��� = new int[3];
		for(int i = 0 ; i < ���.length ; i++) {
			boolean pass = false;
			int temp = random.nextInt(15);// ���� ����
			for(int j = 0 ; j < ���.length ; j++) {
				if(temp != ���[i]) { pass = true; }// �����ʴٸ�
			}
			if(pass) {
				���[i] = temp;
			}else {	i--; }
			if(i == 2) {break;}
		}// for end
		return ���;
	}
	public static int ����ã��(int chindex, String id, int[] ���) throws IOException { // �ε��� / id �ޱ�
		// �ӽ� ���� 1�� 400 /2�� 200 /3�� 100 /4��� 10
		 //2. �̱�
			int i = 1; // ��� ����
			if(������[chindex].equals("[��]")) { //���̶��
				for(int temp : ���) {
					if(chindex == temp) { // temp 0 1 2 ������� ��÷�Ǹ�
						������[chindex] = "["+i+"]";  // ������ ����
						break;	// ������
					}else {������[chindex] = "[ ]";}
					i++; // ���� ���
				}
			}
			for(Account temp : acountlist) { // ȸ�� ��Ͽ���
				if(temp.getId().equals(id)) { // ���̵���ġ�ϸ�
					temp.setPoint(temp.getPoint() - 10); // ����Ʈ 10�� ����
					Controller.ȸ������ó��(id);

					if(i == 1) { // 1���÷�Ǹ�
						temp.setPoint(temp.getPoint() + 400); // �߰�
						Controller.ȸ������ó��(id);
						return 1;
					}else if(i == 2) {
						temp.setPoint(temp.getPoint() + 300);
						Controller.ȸ������ó��(id);
						return 2;
					}else if(i == 3) {
						temp.setPoint(temp.getPoint() + 200);
						Controller.ȸ������ó��(id);
						return 3;
					}
					
					
				}
			}
			return -1; 
		}// ����ã�� �޼ҵ� end
	   static void ��������ó��(String receiveid) throws IOException {
		      
		      for(Account temp : acountlist) {
		         if(temp.getId().equals(receiveid)) {
		            for(int i=0; i<temp.get����().size(); i++) {
		               FileOutputStream out_c = new FileOutputStream("C:/Users/504/Desktop/������6�� �������̸�Ʈ Ŀ�´�Ƽ/ds/����.txt");
		               String storage_c = temp.get����().get(i).get�������()+"@@"+temp.get����().get(i).get�޴»��()+"@@"+temp.get����().get(i).get����()+"@@"+temp.get����().get(i).get��ȣ()+"\n";   
		               out_c.write(storage_c.getBytes());
		            }
		            
		         }
		      }
		   }
		   
		   public static boolean �������() throws IOException {
		      
		      FileInputStream input_c = new FileInputStream("C:/Users/504/Desktop/������6�� �������̸�Ʈ Ŀ�´�Ƽ/ds/����.txt");
		      byte[] bytes_c = new byte[1024]; // ����Ʈ�迭��
		      input_c.read(bytes_c);            // ����Ʈ �б�
		      String str_c = new String(bytes_c); // �Ͼ�°� ����
		      String[] ����1 = str_c.split("\n"); //1ȸ�۸��� �ڸ���
		      for(int t = 0; t < ����1.length-1 ; t++) {   // ȸ�������̸�ŭ �ݺ�
		         if(����1[t] != null ) {
		            String[] ������� = ����1[t].split("@@");
		             
		            Whisper o_c = new Whisper(�������[0],�������[1],�������[2],Integer.parseInt(�������[3]) );
		            
		            //�迭�� ���� ��Ұ� ����
		            for(Account temp : acountlist) {
		               if(temp.getId().equals(�������[0])) {
		                  temp.get����().add(o_c);
		               }
		            }
		         
		         }
		      }
		      return true; 
		   }
	
}
