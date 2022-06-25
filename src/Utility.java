public class Utility {
    public static void printSudokuHorizontal(int[] initialStateHorizontal) {
        // Printing the sudoku in a nice format.
        int n = 0;
        System.out.println("Your Sudoku is:");
        for (int i = 0; i < 9; i++) {
            System.out.println("+-----+-----+-----+  +-----+-----+-----+  +-----+-----+-----+");
            System.out.println("|  " + (initialStateHorizontal[n] == 0 ? " " : initialStateHorizontal[n]) + "  |  " + (initialStateHorizontal[n + 1] == 0 ? " " : initialStateHorizontal[n + 1]) + "  |  " + (initialStateHorizontal[n + 2] == 0 ? " " : initialStateHorizontal[n + 2]) + "  |  |  " + (initialStateHorizontal[n + 3] == 0 ? " " : initialStateHorizontal[n + 3]) + "  |  " + (initialStateHorizontal[n + 4] == 0 ? " " : initialStateHorizontal[n + 4]) + "  |  " + (initialStateHorizontal[n + 5] == 0 ? " " : initialStateHorizontal[n + 5]) + "  |  |  " + (initialStateHorizontal[n + 6] == 0 ? " " : initialStateHorizontal[n + 6]) + "  |  " + (initialStateHorizontal[n + 7] == 0 ? " " : initialStateHorizontal[n + 7]) + "  |  " + (initialStateHorizontal[n + 8] == 0 ? " " : initialStateHorizontal[n + 8]) + "  |  ");
            if ((i + 1) % 3 == 0 && (i + 1 != 9)) {
                System.out.println("+-----+-----+-----+  +-----+-----+-----+  +-----+-----+-----+");
            }

            n += 9;
        }
        System.out.println("+-----+-----+-----+  +-----+-----+-----+  +-----+-----+-----+");
    }
}
