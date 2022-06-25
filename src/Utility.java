public class Utility {


    public static void printSudokuHorizontal(int[] initialStateHorizontal) {
        int n = 0;
        System.out.println("Your Sudoku is:");
        for (int i = 0; i < 9; i++) {
            System.out.println("+-----+-----+-----+  +-----+-----+-----+  +-----+-----+-----+");
            System.out.println("|  " + (initialStateHorizontal[n] == 0 ? " " : initialStateHorizontal[n]) + "  |  " + (initialStateHorizontal[n + 1] == 0 ? " " : initialStateHorizontal[n + 1]) + "  |  " + (initialStateHorizontal[n + 2] == 0 ? " " : initialStateHorizontal[n + 2]) + "  |  |  " + (initialStateHorizontal[n + 3] == 0 ? " " : initialStateHorizontal[n + 3]) + "  |  " + (initialStateHorizontal[n + 4] == 0 ? " " : initialStateHorizontal[n + 4]) + "  |  " + (initialStateHorizontal[n + 5] == 0 ? " " : initialStateHorizontal[n + 5]) + "  |  |  " + (initialStateHorizontal[n + 6] == 0 ? " " : initialStateHorizontal[n + 6]) + "  |  " + (initialStateHorizontal[n + 7] == 0 ? " " : initialStateHorizontal[n + 7]) + "  |  " + (initialStateHorizontal[n + 8] == 0 ? " " : initialStateHorizontal[n + 8]) + "  |  ");
            if((i + 1 )% 3 == 0 && (i + 1 != 9)){
                System.out.println("+-----+-----+-----+  +-----+-----+-----+  +-----+-----+-----+");
            }

            n += 9;
        }
        System.out.println("+-----+-----+-----+  +-----+-----+-----+  +-----+-----+-----+");
    }

    public static void printSudokuVertical(int[] sudokuVertical) {
        int n = 0;
        System.out.println("Your Sudoku Vertical is:");
        for (int i = 0; i < 9; i++) {
            System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
             System.out.println("|  "+sudokuVertical[i] + "  " +"|  "+sudokuVertical[i*2] + "  " +"|  "+sudokuVertical[i*3] + "  " +"|  "+sudokuVertical[i*4] + "  " +"|  "+sudokuVertical[i*5] + "  " +"|  "+sudokuVertical[i*6] + "  " +"|  "+sudokuVertical[i*7] + "  " +"|  "+sudokuVertical[i*8] + "  " +"|  "+sudokuVertical[i*9] + "  " +"|");
        }

        System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
    }
}
