import java.util.Scanner;

public class MadLib {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String noun1;
        String nounPlural;
        String noun2;
        String place;
        String adjective;
        String noun3;

        System.out.println(" Enter a noun ");
        noun1 = read.nextLine();
        System.out.println(" Enter a plural noun ");
        nounPlural = read.nextLine();
        System.out.println(" Enter another noun ");
        noun2 = read.nextLine();
        System.out.println(" Enter a location ");
        place = read.nextLine();

        System.out.println(" Be kind to your " + noun1 + " " + nounPlural + " For a duck may be somebody`s " + noun2 + " and i'll see you in " + place );

    }
}