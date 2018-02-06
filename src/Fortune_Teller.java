import java.util.*;

public class Fortune_Teller {
    public static void main(String[] args){
        Scanner keyin = new Scanner(System.in);

        int val;

        System.out.print("Please type either 1 or 2: ");

        val = keyin.nextInt();

        switch (val){
            case 1:
                System.out.println("You typed 1");
                break;
            case 2:
                System.out.println("You typed 2");
                break;

        }
    }
}

