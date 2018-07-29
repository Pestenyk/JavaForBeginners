import java.util.Scanner;

public class Lesson_4 {
	public static void main(String[] args) {
		
		// Ç÷èòóþ ïåðøå ÷èñëî
		System.out.println("Ââåä³òü ïåðøå ÷èñëî");
		int num1 = readNum();
		
		// Ç÷èòóþ äðóãå ÷èñëî
		System.out.println("Ââåä³òü äðóãå ÷èñëî");
		int num2 = readNum();

		/* Ïåðåâ³ðêà íà íàéá³ëüøå ÷èñëî ³ â³äïîâ³äíî äî îòðèìàíîãî 
		*ðåçóëüòàòó âèêîíóþ àðèôìåòè÷íó îïåðàö³þ íàä íèì òà âèâîäæó ðåçóëüòàò 
		*/
		if(num1>num2) {
			int result = num1 - num2;
			System.out.println("Âàø ðåçóëüòàò: " + result);
		} else {
			int result = num1 + num2;
			System.out.println("Âàø ðåçóëüòàò: " + result);
		}
						
	}	
		
	// Ñòâîðþþ ìåòîä äëÿ ç÷èòóâàííÿ ÷èñëà ç êîíñîë³
	public static int readNum() {

		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
}
