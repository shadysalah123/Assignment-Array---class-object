import java.util.Scanner;

public class assignmentArray1 {
    public static void main(String[] args) {
        int[] scores = {85,92,78,96,88};
        //find the maximum score
        int maxscore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if ( scores[i] > maxscore ) {
                maxscore = scores[i];
            }
        }
        System.out.println("the maximum score is : " + maxscore);

        //calculate and print the sum and average of all scores
        int sum =0 ;
        for (int i=0 ; i<scores.length ; i++) {
            sum += scores[i] ;
        }
        int average = sum/scores.length;
        System.out.println("the sum of scores is : " + sum);
        System.out.println("the average score is : " + average);

        //search for a specific value and display its index e.g.,92
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the scores : ");
        int svalue = sc.nextInt();
        for (int i=0 ; i<scores.length ; i++ ) {
            if ( scores[i] == svalue ) {
                System.out.println("the " + svalue +" index is : " + i );
                break;
            }
            else if (i==scores.length-1) {
                System.out.println("this value isn't fount ");
            }
        }



    }
}
