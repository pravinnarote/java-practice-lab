package main;

public class Loop {
    public static void main(String[] args) {

//******************************************************* */
        int j = 1;

        while (j<=5) {
            System.out.println("Hi " + j);
            j++;
        }

//**********************************************************/
        int s = 4;
        do {
            System.out.println("Hello " + s);
            s--;
        }while (s>=0);

//********************************************************* */
        for(int i=0; i<=5;i++){
            System.out.println("Day " + i);
        }


    }
}
