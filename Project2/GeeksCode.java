package Project2;

import java.util.Scanner;

public class GeeksCode {

    public static void main(String[] argv)
            throws Exception
    {

        String s = "Gfg true 9 + 6 = 12.0 false";

        // create a new scanner
        // with the specified String Object
        Scanner scanner = new Scanner(s);

        while (scanner.hasNext()) {

            // if the next is a Boolean,
            // print found and the Boolean
            if (scanner.hasNextBoolean()) {
                System.out.println("Found Boolean value :"
                        + scanner.nextBoolean());
            }

            // if no Boolean is foucnd,
            // print "Not Found:" and the token
            else {
                System.out.println("Not found Boolean() value :"
                        + scanner.next());
            }
        }
        scanner.close();
    }
}