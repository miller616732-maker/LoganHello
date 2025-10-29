import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloWorld {
    public static void main(String[] args) {
        // Create a scanner or smth //
        Scanner scan = new Scanner(in);
        Random rand = new Random();
        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(6, 7);
        String firstName = "";
        String average;
        String bigChoice;
        String forString;
        StringBuilder forString2 = new StringBuilder(" ");
        int forNum1;
        int forNum2;
        int x = 0;
        int y = 0;
        int l;
        int n;
        int m;
        int price;
        double extraCost;
        int total;
        int yourCode;
        int yourAge = 0;
        double yourGpa = 0;
        int randomNumber;
        int lengthOfYourName;
        int smallerLength;
        int currentTest;
        int testCount = 0;
        int testSum = 0;
        int yourDie = 0;
        double testAvg;
        String continueYN = "";
        int birthMonth = 0;
        boolean validInput = false;
        int currentTemp;
        int tempCount = 0;
        int tempSum = 0;
        int forRCount = 0;
        int forCurrentNum;
        int forTotalSum = 0;
        int forYourCurrentScore;
        int forYourScore = 0;
        double tempAvg;
        boolean forValid = false;
        out.println("What is your big choice? Main, Month, Test Scores, Temp, Name, \n2Num, forLoopTest, Gamble, Classes, Rectangle ");
        bigChoice = scan.nextLine();
        switch (bigChoice.toUpperCase()) {
            case ("FORLOOPTEST"):
                out.println("Give 2 Numbers");
                forNum1 = scan.nextInt();
                forNum2 = scan.nextInt();
                for (int i = forNum1; i <= forNum2; i++) {
                    if (i % 2 == 1) {
                        out.print(i + " ");
                    }
                }
                out.println("\nEnter a String");
                scan.nextLine();
                forString = scan.nextLine();
                for (int i = 0; i < forString.length(); i++) {
                    String forCurrentLetter = forString.substring(i, i + 1);
                    out.println(forCurrentLetter);
                }
                out.println("Example 2");
                for (int i = forString.length() - 1; i >= 0; i--) {
                    String forCurrentLetter = forString.substring(i, i + 1);
                    out.println(forCurrentLetter);
                }
                out.println("Example 3");
                for (int i = 0; i < forString.length(); i++) {
                    if (forString.charAt(i) == 'r') {
                        forRCount++;
                    }
                }
                out.println("The amount of R's is " + forRCount);
                out.println("\nExample 4");
                forString = forString.toLowerCase();
                for (int i = 0; i < forString.length(); i++) {
                    String forCurrentLetter = forString.substring(i, i + 1);
                    if (!(forCurrentLetter.equals("r"))) {
                        forString2.append(forCurrentLetter);
                    }
                }
                out.println(forString2);
                out.println("Example 5");
                for (int i = 0; i < forString.length(); i++) {
                    for (int j = i; j < forString.length(); j++) {
                        out.println((forString.charAt(j)));
                    }
                }
                out.println("Example 6");
                for (int i = 10; i > 0; i--) {
                    for (int j = 1; j <= i; j++) {
                        out.println(i);
                    }
                }
                out.println("Example 7");
                out.println("Please enter a number, -1 to stop");
                forCurrentNum = scan.nextInt();
                while (forCurrentNum != -1) {
                    forTotalSum = forTotalSum + forCurrentNum;
                    forCurrentNum = scan.nextInt();
                }
                out.println("The sum of the entered numbers is " + forTotalSum);
                out.println("Example 8");
                out.println("Please enter your scores, -1 to stop");
                while (!forValid) {
                    forYourCurrentScore = scan.nextInt();
                    if (forYourCurrentScore != -1) {
                        if (forYourScore < forYourCurrentScore) {
                            forYourScore = forYourCurrentScore;
                        }
                    } else {
                        forValid = true;
                    }
                }
                out.println("Your high score was " + forYourScore);
                break;
            case ("MONTH"):
                do {
                    out.println("Enter your birth month [1-12].");
                    if (scan.hasNextInt()) {
                        birthMonth = scan.nextInt();
                        if (birthMonth >= 1 && birthMonth <= 12) {
                            validInput = true;
                        } else {
                            out.println("Wrong month number");
                        }
                    } else {
                        scan.nextLine();
                        out.println("Wrong data type");
                    }
                } while (!validInput);
                out.println("you entered " + birthMonth);
                break;
            case ("TEMP"):
                do {
                    out.println("Enter the temperature");
                    if (scan.hasNextInt()) {
                        currentTemp = scan.nextInt();
                        tempCount++;
                        tempSum = currentTemp + tempSum;
                        scan.nextLine();
                        out.println("Continue? [Y/N]");
                        continueYN = scan.nextLine();

                    } else {
                        out.println("Incorrect data type");
                        scan.nextLine();
                    }
                } while (!continueYN.equalsIgnoreCase("N"));
                if (tempCount == 0) {
                    out.println("Non-Existent Temp");
                    scan.nextLine();
                } else {
                    tempAvg = (double) tempSum / tempCount;
                    out.println("The average is " + tempAvg);
                }
                break;
            case "TESTSCORES":
                out.println("Enter your test scores");
                do {
                    out.println("Enter test scores [0-100].");
                    if (scan.hasNextInt()) {
                        currentTest = scan.nextInt();
                        if (currentTest >= 0 && currentTest <= 100) {
                            testCount++;
                            testSum = currentTest + testSum;
                            scan.nextLine();
                            out.println("Do you want to continue? [Y/N]");
                            continueYN = scan.nextLine();
                        } else {
                            out.println("Invalid score");
                            scan.nextLine();
                        }
                    } else {
                        out.println("Incorrect data type");
                        scan.nextLine();
                    }
                } while (!continueYN.equalsIgnoreCase("N"));
                testAvg = (double) testSum / testCount;
                if (testCount == 0) {
                    out.println("No Scores?");
                } else {
                    out.println("The average is " + testAvg);
                }
                break;
            case "NAME":
                out.println("What is your first name");
                firstName = scan.nextLine();
                if (Objects.equals(firstName, "Logan")) {
                    out.println("Hello Sir Logan");
                } else if (Objects.equals(firstName, "Emory")) {
                    out.println("Hi Mistah George");
                } else if (Objects.equals(firstName, "67")) {
                    exit(67);
                } else {
                    out.println("Hello " + firstName);
                }
                lengthOfYourName = firstName.length();
                smallerLength = lengthOfYourName - 2;
                out.print(firstName.indexOf("Logan"));
                out.println("\nYour name is " + lengthOfYourName + " letters long");
                out.println(firstName.substring(0, 2));
                out.println(firstName.substring(smallerLength, lengthOfYourName));
                out.println(firstName.compareTo("CoolGuy"));
                break;
            case "2NUM":
                out.println("Gimme two integer values");
                if (scan.hasNextInt()) {
                    x = scan.nextInt();
                } else {
                    out.println("Wrong Number Type Dum Dum");
                    exit(0);
                }
                if (scan.hasNextInt()) {
                    y = scan.nextInt();
                } else {
                    out.println("Wrong Number Type Dum Dum");
                    exit(0);
                }
                out.println("Your numbers added together = " + (x + y));
                out.println("Your numbers multiplied together = " + (x * y));
                out.println("Your numbers subtracted = " + (x - y));
                out.println("Your numbers divided together = " + ((double) x / y));
                break;
            case "LISTTEST":
                out.printf("%s%7d%7s", "Logan", 14, "Purple");
                out.printf("\n%s%7d%7s", "Emory George", 99999, "Green");
                out.printf("\n%s%14s%14s", "CoolGuy", "CoolNumber", "CoolColor");
                break;
            case "MAIN":
                out.println("Enter your test scores");
                l = scan.nextInt();
                n = scan.nextInt();
                m = scan.nextInt();
                average = String.valueOf(((double) (l + n + m) / 3));
                out.println("Your average score is + " + (average));
                int A = 8;
                int B;
                out.println("Enter your total price");
                price = scan.nextInt();
                extraCost = ((double) price * 0.05) + 3;
                total = (int) (price + extraCost);
                out.println("Your total price is " + total);
                B = A / 4;
                out.println(B);
                out.println("Wowzers");
                out.println("Whats the password");
                yourCode = scan.nextInt();
                if (yourCode == 1234) {
                    out.println("Super Duper Password Locked Wowzers");
                } else {
                    out.println("GET OUT OF MY SWAMP");
                    exit(1);
                }
                out.println("Enter your Age");
                scan.nextLine();
                if (scan.hasNextInt()) {
                    yourAge = scan.nextInt();
                } else
                    exit(0);
                out.println("Enter your GPA");
                if (scan.hasNextDouble()) {
                    yourGpa = scan.nextDouble();
                }
                out.println("Hello " + firstName + " you are " + yourAge + " and your GPA is " + yourGpa);
                break;
            case "GAMBLE":
                out.println("How many sides does your die have");
                if (scan.hasNextInt()) {
                    yourDie = scan.nextInt();
                } else {
                    exit(2);
                }
                randomNumber = rand.nextInt(yourDie) + 1;
                out.println("Your roll is " + randomNumber);
                break;
            case "CLASSES":
                out.println("Check For A's");
                findNumA(scan.nextLine());
                out.println("Reverse a String");
                reverser(scan.nextLine());
                break;
            case "RECTANGLE":
                out.println("r1 Info: ");
                r1.printRectangle();
                out.println("Update");
                r1.setLength(5);
                r1.setWidth(5);
                r1.printRectangle();
                out.println("r2 Info");
                r2.printRectangle();
                out.println("Update");
                r2.setLength(3);
                r2.setWidth(3);
                r2.printRectangle();
        }
    }


    public static void findNumA(String aCheck) {
        int aCount = 0;
        for (int i = 0; i < aCheck.length(); i++) {
            String currentLetter = aCheck.substring(i, i + 1);
            if (currentLetter.equalsIgnoreCase("a")) {
                aCount++;
            }
        }
        out.println(aCount);
    }
    public static void reverser(String aCheck){
        for (int i = aCheck.length() - 1; i >= 0; i--) {
            String currentLetter = aCheck.substring(i,  i+1);
            out.print(currentLetter);
        }
    }
}