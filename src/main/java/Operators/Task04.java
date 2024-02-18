package Operators;

public class Task04 {
    public static void main(String[] args) {
        int score = 70;
        if (score >=90){
            System.out.println("gut");
        }
        else if (score >=70 && score <=89){
            System.out.println("nicht schlecht");
        } else if (score>50 && score <=69) {
            System.out.println("befriedigend");
        } else {
            System.out.println("unzureichend");
        }
    }
}
