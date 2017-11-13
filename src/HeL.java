
import java.util.Scanner;

public class HeL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Nummer = (int) (Math.random() * 13);
        System.out.println(Nummer);

        System.out.println("Gissa om nästa nummer är högre eller lägre.");

        String Gissning = sc.nextLine();
        Gissning = Gissning.toUpperCase();


        int Nummer1 = (int) (Math.random() * 13);
        System.out.println(Nummer1);

        boolean sp = true;

         while ( sp )  {
            if (Gissning.equals("HÖGRE")) {
                if (Nummer < Nummer1) {
                    System.out.println("Fortsätt");
                    //break;
                } else if (Nummer > Nummer1) {
                    System.out.println("Du förlorade, testa igen.");
                    sp = false;
                }
            } else {//if (Gissning.equals("LÄGRE")) {
                if (Nummer > Nummer1) {
                    System.out.println("Fortsätt");
                    //break;
                } else if (Nummer < Nummer1) {
                    System.out.println("Du förlorade, testa igen.");
                    sp = false;
                }
            }
        }
    }
}

