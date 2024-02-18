package about.me;

public class Homework02 {
    public static void main(String[] args) {
        System.out.println("Task 1:");


        byte age = 37;
        String name = "Rustam Zamanov. ";
        String day = " Heute ist Freitag.";
        String me = name + age;
        System.out.println( "Mein Name ist: " + me + " Jahre alt.");
        boolean weekend = false;
        boolean workingweek = true;

        if (workingweek) {
            System.out.println("Es ist Arbeitswoche, kein Wochenende.");
        }
        else {
            System.out.println("Es ist Wochenende.");
        }


        System.out.println("-------------------------------------------------");
        System.out.println("Task 2:");


        int number1 = 10;
        int number2 = 10;
        int result = (number1 + number2);
        System.out.println( "Das Ergebnis ist:" + result);


        System.out.println("-------------------------------------------------");

        System.out.println("Task 3");

        String song = "Der Name des Songs ist: Undercover.";
        String album = " Das Album heißt: Sentient.";
        String songInfo = song + " " +  album;
        System.out.println(songInfo);

        System.out.println("-------------------------------------------------");


    }
}
