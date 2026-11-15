import java.util.Scanner;

public class Main_enum {



        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Input a state: ");

            String state = input.nextLine();


            for (GeoPoliticalZone geoPoliticalZone : GeoPoliticalZone.values()) {

                if (geoPoliticalZone.hasState(state)) {

                    System.out.println(state + " belongs to  " + geoPoliticalZone + " zone");
                }

            }


        }

}
