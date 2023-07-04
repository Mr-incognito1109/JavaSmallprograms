import java.util.Scanner;

public class Mchoice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] responses = {"","",""};
        String[] answers = {"b","d","a"};

        System.out.println("A colour ?");
        System.out.println("(a) Monk");
        System.out.println("(b) Blue");
        System.out.println("(c) Rare");
        System.out.println("(d) Star");

        responses[0] = scan.next();

        System.out.println("How many colours does a rainbow have ?");
        System.out.println("(a) 2");
        System.out.println("(b) 3");
        System.out.println("(c) 5");
        System.out.println("(d) 7");

        responses[1] = scan.next();

        System.out.println("Who is the king of jungle ?");
        System.out.println("(a) Lion");
        System.out.println("(b) Tiger");
        System.out.println("(c) Rabbit");
        System.out.println("(d) Wolf");

        responses[2] = scan.next();
        int score = 0;

        for (int i = 0 ; i<3 ; i++) {
            if(responses[i].equalsIgnoreCase(answers[i])) {
                score++;
            }
        }

        System.out.println("Marks: "+score+"/3");
    }
}