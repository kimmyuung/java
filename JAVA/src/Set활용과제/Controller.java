package Set활용과제;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.TreeSet;

public class Controller {
		static Scanner sc = new Scanner(System.in);
		static TreeSet<Content> blist = new TreeSet<>();
		
		boolean add(String title, String context, String writer, String date) {
			
			Content content = new Content(title, context, writer, date);
			blist.add(content);
			save();
			return false;
		}
		
		void save() {
			try {
			FileOutputStream outputStream = new FileOutputStream("D:/자바/방문록.txt");
			for(Content temp : blist) {
				String save = temp.getTitle() + "," + temp.getContent() + "," + temp.getWriter() + "," + temp.getDate() + "\n";
				outputStream.write(save.getBytes());
			}
		} 
		catch (Exception e) {
			System.out.println("파일 저장 실패 " + e);
		}
			
		}
		void load() {
			try {
				FileInputStream inputStream = new FileInputStream("D:/자바/방문록.txt");
				byte[] bytes = new byte[1024]; 
				inputStream.read(bytes); 
				String file = new String(bytes); 
				String[]list = file.split("\n"); 
				int i = 0;
				for(String temp : list) {
					if( i+1 == list.length ) {
						break; 
					}
					String[] field = temp.split(",");
					Content temp2 = new Content(field[0],field[1], field[2], field[3]);
					blist.add(temp2);
					i++;
				}
				
			}
			catch (Exception e) {
				System.out.println("파일 불러오기 실패 " + e);
			}
			
			
		}
}
