
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int s;
    Scanner inp=new Scanner(System.in);

    System.out.println("Sayiyi Giriniz");
    s= inp.nextInt();

    for (int i=1; i<=s; i++){
        if(i%2==0){
            System.out.println(i);
        }

    }
    }
}
