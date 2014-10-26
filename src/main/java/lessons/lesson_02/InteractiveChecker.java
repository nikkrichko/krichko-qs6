package lessons.lesson_02;

/**
 * Created by bionic on 10/22/14.
 */
public class InteractiveChecker {

    private int katet1, katet2, gipotenusa;
    private int step;
    int counter = 0;

    public InteractiveChecker(int step) {
        this.step = step;
    }

    public void printInts(){
        for(katet1 = 1; katet1< step; katet1++){
            for(katet2 = step; katet2 >0; katet2--) {
                double temp = Math.sqrt(katet1*katet1 + katet2*katet2);
                if ((int)temp == temp){
                    System.out.println("katet1 = " + katet1);
                    System.out.println("katet2 = " + katet2);
                    System.out.println("gipotenuza = " + temp);
                    System.out.println("===========");
                    System.out.println();
                    counter++;
                    if (katet1 == katet2) {return;}
                }
            }
        }
        System.out.println("all variants: " + counter);
    }

}
