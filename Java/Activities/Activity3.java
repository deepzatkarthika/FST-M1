import java.util.Scanner;

public class Activity3 {

    public static void main(String[] args) {
        double  urAge=1000000000;
        double earthSec=31557600;
        double mercurySec=0.2408467;
        double venusSec=0.2408467;
        double marsSec=1.8808158;
        double jupiterSec=11.862615;
        double saturnSec=29.447498;
        double uranusSec=84.016846;
        double neptuneSec=164.79132;
        double earthYrs=(double)Math.round( (urAge/31556952)*100)/100;

        System.out.println("Years in Earth "+earthYrs);
        System.out.println("Years in Mercury "+earthYrs/mercurySec);
        System.out.println("Years in Venus "+earthYrs/venusSec);
        System.out.println("Years in Mars "+earthYrs/marsSec);
        System.out.println("Years in Jupiter "+earthYrs/jupiterSec);
        System.out.println("Years in saturn "+earthYrs/saturnSec);
        System.out.println("Years in Uranus "+earthYrs/uranusSec);
        System.out.println("Years in Neptune "+earthYrs/neptuneSec);



    }

}
