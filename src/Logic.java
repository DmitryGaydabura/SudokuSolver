import java.util.Scanner;

public class Logic {
    public static void startApp() {

        //TODO этап получения условия и создания трех массивов.

        // Asking for the initial state of the sudoku and printing it.
        int[] initialStateHorizontal = askForInitialState();
        Utility.printSudokuHorizontal(initialStateHorizontal);

        // Creating three arrays.
        int[] horizontal = initialStateHorizontal;
        int[] vertical;
        int[] square;

        //TODO Этап решения судоку
        //Три цикла(Горизонт. Вертик. Квадратный) для проверки недостающего 1 числа .
        //вставить число в три массива
        //Проверить все ли числа на месте
        // Если нет, начинаем с начала.
        int i = 1;
        while (i < 181) {
            // Checking the horizontal array and then converting it to a vertical array.
            checkHorizontal(horizontal);
            vertical = horizontalToVerticalConverter(horizontal);


            // Checking the vertical array and then converting it to a horizontal array.
            checkVertical(vertical);
            horizontal = horizontalToVerticalConverter(vertical);

            // Converting the horizontal array to a square array and then checking it.
            square = horizontalToSquareConverter(horizontal);
            checkSquare(square);

            // Converting the square array to a horizontal array.
            horizontal = horizontalToSquareConverter(square);

            i++;
        }


        //TODO Этап проверки и принта решения

        // It prints the sudoku in a horizontal way.
        Utility.printSudokuHorizontal(horizontal);
    }

    private static void checkSquare(int[] square) {
        getInts(square);
    }

    private static void getInts(int[] square) {
        for (int j = 0; j < 9; j++) {

            int n = 0;
            int[] currentLine = new int[9];
            // Checking the current line of the sudoku.
            for (int i = 0; i < 9; i++) {

                currentLine[i] = square[9 * j + i];
                if (currentLine[i] == 0) {
                    n++;
                }
            }
            if (n == 1) {
                // Finding the index of the zero in the current line.
                int indexOfZero = 0;
                for (int i = 0; i < 9; i++) {
                    if (currentLine[i] == 0) {
                        indexOfZero = i;
                    }
                }
                // Creating an array of numbers from 1 to 9 and then it is checking if the current line of the sudoku
                // contains any of these numbers. If it does, it is changing the number to 0.
                int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                for (int i = 0; i < 9; i++) {
                    for (int k = 0; k < 9; k++) {
                        if (currentLine[i] == numbers[k]) {
                            numbers[k] = 0;
                        }
                    }
                }
                // Finding the missing number in the current line of the sudoku.
                int missingNumber = 0;
                for (int i = 0; i < 9; i++) {
                    if (numbers[i] != 0) {
                        missingNumber = numbers[i];
                    }
                }
                // Finding the missing number in the current line of the sudoku and then it is inserting it into the
                // current line.
                currentLine[indexOfZero] = missingNumber;
                // A for loop.
                System.arraycopy(currentLine, 0, square, 9 * j, 9);
            }

        }
    }

    private static void checkVertical(int[] vertical) {
        getInts(vertical);
    }

    private static void checkHorizontal(int[] horizontal) {

        getInts(horizontal);

    }

    private static int[] horizontalToVerticalConverter(int[] initialStateHorizontal) {
        // Converting the horizontal array to a vertical array.
        int[] vertical = new int[81];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                vertical[j + 9 * i] = initialStateHorizontal[i + 9 * j];
            }
        }
        return vertical;
    }

    private static int[] horizontalToSquareConverter(int[] initialStateHorizontal) {
        // The above code is converting the initial state from a horizontal array to a square array.
        int[] square = new int[81];
        square[0] = initialStateHorizontal[0];
        square[1] = initialStateHorizontal[1];
        square[2] = initialStateHorizontal[2];
        square[3] = initialStateHorizontal[9];
        square[4] = initialStateHorizontal[10];
        square[5] = initialStateHorizontal[11];
        square[6] = initialStateHorizontal[18];
        square[7] = initialStateHorizontal[19];
        square[8] = initialStateHorizontal[20];

        square[9] = initialStateHorizontal[3];
        square[10] = initialStateHorizontal[4];
        square[11] = initialStateHorizontal[5];
        square[12] = initialStateHorizontal[12];
        square[13] = initialStateHorizontal[13];
        square[14] = initialStateHorizontal[14];
        square[15] = initialStateHorizontal[21];
        square[16] = initialStateHorizontal[22];
        square[17] = initialStateHorizontal[23];

        square[18] = initialStateHorizontal[6];
        square[19] = initialStateHorizontal[7];
        square[20] = initialStateHorizontal[8];
        square[21] = initialStateHorizontal[15];
        square[22] = initialStateHorizontal[16];
        square[23] = initialStateHorizontal[17];
        square[24] = initialStateHorizontal[24];
        square[25] = initialStateHorizontal[25];
        square[26] = initialStateHorizontal[26];

        square[27] = initialStateHorizontal[27];
        square[28] = initialStateHorizontal[28];
        square[29] = initialStateHorizontal[29];
        square[30] = initialStateHorizontal[36];
        square[31] = initialStateHorizontal[37];
        square[32] = initialStateHorizontal[38];
        square[33] = initialStateHorizontal[45];
        square[34] = initialStateHorizontal[46];
        square[35] = initialStateHorizontal[47];

        square[36] = initialStateHorizontal[30];
        square[37] = initialStateHorizontal[31];
        square[38] = initialStateHorizontal[32];
        square[39] = initialStateHorizontal[39];
        square[40] = initialStateHorizontal[40];
        square[41] = initialStateHorizontal[41];
        square[42] = initialStateHorizontal[48];
        square[43] = initialStateHorizontal[49];
        square[44] = initialStateHorizontal[50];

        square[45] = initialStateHorizontal[33];
        square[46] = initialStateHorizontal[34];
        square[47] = initialStateHorizontal[35];
        square[48] = initialStateHorizontal[42];
        square[49] = initialStateHorizontal[43];
        square[50] = initialStateHorizontal[44];
        square[51] = initialStateHorizontal[51];
        square[52] = initialStateHorizontal[52];
        square[53] = initialStateHorizontal[53];
        square[54] = initialStateHorizontal[54];

        square[55] = initialStateHorizontal[55];
        square[56] = initialStateHorizontal[56];
        square[57] = initialStateHorizontal[63];
        square[58] = initialStateHorizontal[64];
        square[59] = initialStateHorizontal[65];
        square[60] = initialStateHorizontal[72];
        square[61] = initialStateHorizontal[73];
        square[62] = initialStateHorizontal[74];
        square[63] = initialStateHorizontal[57];

        square[64] = initialStateHorizontal[58];
        square[65] = initialStateHorizontal[59];
        square[66] = initialStateHorizontal[66];
        square[67] = initialStateHorizontal[67];
        square[68] = initialStateHorizontal[68];
        square[69] = initialStateHorizontal[75];
        square[70] = initialStateHorizontal[76];
        square[71] = initialStateHorizontal[77];
        square[72] = initialStateHorizontal[60];

        square[73] = initialStateHorizontal[61];
        square[74] = initialStateHorizontal[62];
        square[75] = initialStateHorizontal[69];
        square[76] = initialStateHorizontal[70];
        square[77] = initialStateHorizontal[71];
        square[78] = initialStateHorizontal[78];
        square[79] = initialStateHorizontal[79];
        square[80] = initialStateHorizontal[80];


        return square;
    }


    private static int[] askForInitialState() {
        // Asking the user to enter the initial state of the sudoku.
        System.out.println("Please,enter each number of your sudoku(or type in \"0\", for each blank space)");
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        int[] initialStateHorizontal = new int[81];
        String[] initialStateHorizontalString = n.split(" ");
        for (int i = 0; i < 81; i++) {
            initialStateHorizontal[i] = Integer.parseInt(initialStateHorizontalString[i]);
        }

        return initialStateHorizontal;
    }
}
