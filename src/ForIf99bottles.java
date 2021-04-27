import java.util.Locale;

public class ForIf99bottles {

    public static void main(String[] args) {

//        for (int beerBottlesCount = 99; beerBottlesCount >= 0; beerBottlesCount--) {
//
//            if (beerBottlesCount == 0) {
//                System.out.println("No more bottles of beer on the wall, no more bottles of beer");
//
//                System.out.print("Go to the store and buy some more");
//                beerBottlesCount = 99;
//                System.out.println(beerBottlesCount + " bottles of beer on the wall.");
//                System.out.println();
//                break;
//            }
//
//            if (beerBottlesCount == 1) {
//                System.out.print(beerBottlesCount + " bottle of beer on the wall, ");
//                System.out.println(beerBottlesCount + " bottle of beer on the wall, ");
//                System.out.print("Take one down and pass it around, ");
//                System.out.println(" no more bottles of beer on the wall.");
//                System.out.println();
//                continue;
//            }
//
//            if(beerBottlesCount == 2) {
//
//                System.out.print(beerBottlesCount + " bottles of beer on the wall, ");
//                System.out.println(beerBottlesCount + " bottles of beer.");
//                System.out.print("Take one down and pass it around, ");
//                System.out.println(beerBottlesCount - 1 + " bottle of beer on the wall.");
//                System.out.println();
//                continue;
//
//
//            }
//
//            System.out.print(beerBottlesCount + " bottles of beer on the wall, ");
//            System.out.println(beerBottlesCount + " bottles of beer.");
//            System.out.print("Take one down and pass it around, ");
//            System.out.println(beerBottlesCount - 1 + " bottles of beer on the wall.");
//            System.out.println();
//        }

//        for (int beerBottlesCount = 99; beerBottlesCount >= 0; beerBottlesCount--) {
//
//            if (beerBottlesCount == 0) {
//                System.out.println("No more bottles of beer on the wall, no more bottles of beer");
//
//                System.out.print("Go to the store and buy some more");
//           //     beerBottlesCount = 99;
//                System.out.println(" 99 bottles of beer on the wall.");
//                System.out.println();
//
//            } else if (beerBottlesCount == 1) {
//                System.out.print(beerBottlesCount + " bottle of beer on the wall, ");
//                System.out.println(beerBottlesCount + " bottle of beer on the wall, ");
//                System.out.print("Take one down and pass it around, ");
//                System.out.println(" no more bottles of beer on the wall.");
//                System.out.println();
//
//            } else if(beerBottlesCount == 2) {
//
//                System.out.print(beerBottlesCount + " bottles of beer on the wall, ");
//                System.out.println(beerBottlesCount + " bottles of beer.");
//                System.out.print("Take one down and pass it around, ");
//                System.out.println(beerBottlesCount - 1 + " bottle of beer on the wall.");
//                System.out.println();
//
//            } else {
//                System.out.print(beerBottlesCount + " bottles of beer on the wall, ");
//                System.out.println(beerBottlesCount + " bottles of beer.");
//                System.out.print("Take one down and pass it around, ");
//                System.out.println(beerBottlesCount - 1 + " bottles of beer on the wall.");
//                System.out.println();
//            }
//
//
//        }
        String bottlesOfBeer = " bottles of beer";
        String onTheWall = " on the wall";
        String noMore = "No more";

        for (int beerBottlesCount = 99; beerBottlesCount >= 0; beerBottlesCount--) {

            if (beerBottlesCount == 0) {
                printString(noMore);
                printString(bottlesOfBeer);
                printString(onTheWall);
                printString(", ");
                printString(toLowerCase(noMore));
                printString(bottlesOfBeer);
                printDot();
                printLn();
                System.out.print("Go to the store and buy some ");
                String fourLastLetters = getFourLastLetters(noMore);
                printString(", ");
                printInt(beerBottlesCount + 99);
                printString(bottlesOfBeer);
                printString(onTheWall);
                printLn();
                printLn();

            } else if (beerBottlesCount == 1) {
                printInt(beerBottlesCount);
                printString(removeSLetter(bottlesOfBeer));
                printString(onTheWall);
                printString(", ");
                printInt(beerBottlesCount);
                printString(removeSLetter(bottlesOfBeer));
                printDot();
                printLn();
                printTakeOneDown();
                printString(toLowerCase(noMore));
                printString(bottlesOfBeer);
                printString(onTheWall);
                printDot();
                printLn();
                printLn();


            } else if(beerBottlesCount == 2) {
                printInt(beerBottlesCount);
                printString(bottlesOfBeer);
                printString(onTheWall);
                printString(", ");
                printInt(beerBottlesCount);
                printString(bottlesOfBeer);
                printDot();
                printLn();
                printTakeOneDown();
                printInt(beerBottlesCount - 1);
                printString(bottlesOfBeer);
                printString(onTheWall);
                printDot();
                printLn();
                printLn();

            } else {
                printInt(beerBottlesCount);
                printString(bottlesOfBeer);
                printString(onTheWall);
                printString(", ");
                printInt(beerBottlesCount);
                printString(bottlesOfBeer);
                printDot();
                printLn();
                printTakeOneDown();
                printInt(beerBottlesCount - 1);
                printString(bottlesOfBeer);
                printString(onTheWall);
                printDot();
                printLn();
                printLn();
            }

        }

    }



    private static void printTakeOneDown () {
        System.out.print("Take one down and pass it around, ");
    }

    private static void printString(String string) {
        System.out.print(string);
    }

    private static void printDot () {
        System.out.print(". ");
    }

    private static void printLn () {
        System.out.println();
    }
    private static void printInt(int number) {
        System.out.print(number);
    }

    private static String toLowerCase(String string) {
        String newString = string.toLowerCase();
        return newString;
    }
    private static String removeSLetter(String string) {

        String newString = string.replace("s", "");
        return newString;
    }
    private static String getFourLastLetters (String string) {
        if(string.length() >=4) {
            return string.substring(string.length() - 4);
        }
        return null;
    }



 }