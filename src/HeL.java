
import java.util.Scanner;

public class HeL {
    public static void main(String[] args) {
        System.out.println(
                "*-------------*\n" +
                "|  \\|/        |\n" +
                "| M-O-RNING   |\n" +
                "|  /|\\8=WOO=D |\n" +
                "| INTERACTIVE |\n" +
                "*-------------*");
        boolean lp = true;
        boolean sp = true;
        int streak = 0;

        while (lp) {
            Scanner sc = new Scanner(System.in);
            int nummer = (int) (Math.random() * 13);
            System.out.println(nummer);

            System.out.println("Gissa om nästa nummer är högre eller lägre.");

            String gissning = sc.nextLine();
            gissning = gissning.toUpperCase();

            int nummer1 = (int) (Math.random() * 13);
            System.out.println(nummer1);


            while (sp) {

                if (gissning.equals("HÖGRE")) {
                    if (nummer > nummer1) {
                        System.out.println("FÖRLUST -25 mmr");
                        sp = false;
                        lp = false;
                    } else {
                        System.out.println("VINST");
                        streak = streak + 1;
                        System.out.println("streak:" + streak );
                        break;

                       /* System.out.println("Vill du fortsätta eller börja om?");
                        Scanner sc1 = new Scanner(System.in);
                        String feb = sc1.nextLine();

                            if (feb.equals ("Fortsätta")){

                            }*/
                    }
                }
                if (gissning.equals("LÄGRE")) {
                    if (nummer < nummer1) {
                        System.out.println("FÖRLUST -25 mmr");
                        sp = false;
                        lp = false;
                    } else {
                        System.out.println("VINST");
                        streak = streak + 1;
                        System.out.println("streak:" + streak);
                        break;
                    }
                } //else {
                //System.out.println("lägg ner det här är allvar /votekick");
                //}
            }
        }
    }
}
