import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String c = scanner.nextLine();
        for(String s : str.split(c)) {
            System.out.print(s);
        }
    }
}