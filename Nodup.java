import java.util.*;
class Nodup {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    String[] n = kbd.nextLine().split(" ");
    // int i=0;
    // System.out.print(n.length);
   	for(int i = 0; i < n.length - 1; i++)
			for(int j = i + 1; j < n.length; j++)
				if(n[i].equals(n[j])){
					System.out.println("no");
					return;
				}
		System.out.println("yes");
      
  }
}