public class J2DArrays {
    public static void main(String[] args) {

        String[] catnames = new String[8];

        catnames[0] = "Murzik";
        catnames[1] = "Chernysh";
        catnames[2] = "Murka";
        catnames[3] = "Barsik";
        catnames[4] = "Ryzhik";
        catnames[5] = "Ashley";
        catnames[6] = "Geena";
        catnames[7] = "Mashka";

//        int[] catsAges = {2, 3, 4, 1, 5, 6, 9, 10};

//        int min = 100;
//        for (int boxNumber = 0; boxNumber < catnames.length; boxNumber++) {
//            if (catsAges[boxNumber] < min) {
//                min = catsAges[boxNumber];
//            }
//        }
//
//        System.out.println(min);
//
//        int max = 0;
//        for (int boxNumber = 0; boxNumber < catsAges.length; boxNumber++) {
//            if(catsAges[boxNumber] > max) {
//                max = catsAges[boxNumber];
//
//            }
//
//        }
//        System.out.println(max);
//
//        int result = 0;
//        for (int boxNumber = 0; boxNumber < catsAges.length; boxNumber++ ) {
//
//            result = result + catsAges[boxNumber];
//
//        }
//        System.out.println(result/ catnames.length);

        String[] catsColors = new String[8];

        catsColors[0] = "Grey";
        catsColors[1] = "Black";
        catsColors[2] = "Grey";
        catsColors[3] = "Brown";
        catsColors[4] = "Red";
        catsColors[5] = "Grey";
        catsColors[6] = "Red";
        catsColors[7] = "Gray";

        int[] catsAges = {2, 3, 4, 1, 5, 6, 9, 10};
        String[] catsAgesString = new String[8];
        for (int boxNumber = 0; boxNumber < catnames.length; boxNumber++) {
            catsAgesString[boxNumber] = String.valueOf(catsAges[boxNumber]);
            System.out.println(catsAgesString[boxNumber]);

        }


        // String[] to int[];
        String numberString = "1";
        int number = 1;
        int numberInt = Integer.parseInt(numberString);
        System.out.println(numberInt);
        if (number == numberInt) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // String[] to double[];

        double numberDouble = Double.parseDouble(numberString);
        System.out.println(numberDouble);

        //String[] to int[];

        int[] catsAgesInt = new int[8];

        for (int i = 0; i < catsAgesString.length; i++) {
            catsAgesInt[i] = Integer.parseInt(catsAgesString[i]);
            System.out.println(catsAgesInt[i]);

        }

//        String [][] cats = new String[3][8];
//        for(int row = 0; row < 3; row ++) {
//            for(int cell = 0; cell < 8; cell ++) {
//                if (row == 0) {
//                    cats[row][cell] = catnames[cell];
//                }
//                else if (row == 1) {
//                    cats[row][cell] = catsAgesString[cell];
//                }
//                else if (row == 2) {
//                    cats[row][cell] = catsColors[cell];
//                }
//            }
//
//        }
//
//        for(int cell = 0; cell < 8; cell ++) {
//            for(int row = 0; row < 3; row ++) {
//                System.out.println(cats[row][cell]);
//
//            }
//            System.out.println("____________________");
//        }
//
////        Ryzhik cat[0][4], cat[1][4], cat[]2[4];
//        System.out.println(catnames[4]);
//        System.out.println(cats[0][4] + ", " + cats[1][4] + ", " + cats[2][4]);




    }
    }




