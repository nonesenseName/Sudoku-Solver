public class Main {
    //Formatted for easy copy/paste when new tests are added
    static int freshBoard[][] = new int[][]
                { { 0,0,0, 0,0,0, 0,0,0 },
                  { 0,0,0, 0,0,0, 0,0,0 },
                  { 0,0,0, 0,0,0, 0,0,0 },

                  { 0,0,0, 0,0,0, 0,0,0 },
                  { 0,0,0, 0,0,0, 0,0,0 },
                  { 0,0,0, 0,0,0, 0,0,0 },

                  { 0,0,0, 0,0,0, 0,0,0 },
                  { 0,0,0, 0,0,0, 0,0,0 },
                  { 0,0,0, 0,0,0, 0,0,0 } };


    static int results[][] = new int[][]
                  { { 0,0,3, 9,0,5, 0,0,0 },
                    { 0,2,0, 0,0,0, 4,0,1 },
                    { 0,0,0, 0,1,0, 0,0,6 },

                    { 0,7,0, 0,9,0, 0,4,0 },
                    { 0,4,6, 0,3,0, 0,1,8 },
                    { 8,0,0, 0,0,0, 0,0,0 },

                    { 0,0,9, 0,0,0, 0,6,2 },
                    { 5,0,2, 3,0,0, 0,0,0 },
                    { 0,0,0, 0,7,0, 0,0,0 } };

    static int results2[][] = new int[][]
                  { { 0,4,0, 8,6,7, 0,0,0 },
                    { 0,3,0, 0,0,0, 0,0,0 },
                    { 0,0,8, 0,0,0, 9,0,0 },

                    { 0,0,0, 0,0,5, 2,0,0 },
                    { 7,8,0, 0,0,2, 6,0,0 },
                    { 0,0,0, 0,0,0, 0,4,0 },

                    { 8,1,4, 0,0,0, 0,5,0 },
                    { 6,9,0, 0,5,0, 4,0,0 },
                    { 0,2,0, 1,0,4, 0,0,8 } };


    static int resultsEasy[][] = new int[][]
                  { { 4,0,1, 3,0,8, 5,7,9 },
                    { 0,0,3, 0,0,0, 6,4,0 },
                    { 0,0,0, 0,0,5, 1,0,3 },

                    { 0,5,0, 0,0,4, 7,0,0 },
                    { 0,6,0, 9,0,1, 0,2,0 },
                    { 0,0,8, 7,0,0, 0,1,0 },

                    { 6,0,9, 2,0,0, 0,0,0 },
                    { 0,3,7, 0,0,0, 2,0,0 },
                    { 2,4,5, 8,0,6, 9,0,7 } };

    static int resultsMedium[][] = new int[][]
                  { { 0,9,0, 0,0,8, 2,0,0 },
                    { 3,0,5, 0,0,0, 0,1,4 },
                    { 2,0,0, 1,0,0, 0,7,0 },

                    { 8,0,0, 9,0,5, 0,0,0 },
                    { 0,0,0, 4,3,1, 0,0,0 },
                    { 0,0,0, 8,0,7, 0,0,2 },

                    { 0,8,0, 0,0,3, 0,0,9 },
                    { 6,4,0, 0,0,0, 3,0,7 },
                    { 0,0,7, 2,0,0, 0,5,0 } };

    static int resultsHard[][] = new int[][]
                  { { 0,0,0, 0,0,4, 5,0,8 },
                    { 0,6,0, 3,2,0, 0,0,0 },
                    { 4,0,1, 0,0,5, 0,0,0 },

                    { 0,7,0, 2,0,0, 4,0,3 },
                    { 0,0,0, 0,0,0, 0,0,0 },
                    { 2,0,8, 0,0,9, 0,6,0 },

                    { 0,0,0, 8,0,0, 2,0,1 },
                    { 0,0,0, 0,3,7, 0,4,0 },
                    { 9,0,3, 4,0,0, 0,0,0 } };

    static int resultsHarder[][] = new int[][]
                  { { 8,0,0, 6,0,0, 0,9,0 },
                    { 6,0,0, 1,0,8, 0,0,7 },
                    { 0,5,0, 9,0,0, 0,2,0 },

                    { 0,9,2, 0,0,0, 0,0,0 },
                    { 0,0,0, 2,0,1, 0,0,0 },
                    { 0,0,0, 0,0,0, 4,1,0 },

                    { 0,7,0, 0,0,6, 0,8,0 },
                    { 2,0,0, 8,0,9, 0,0,6 },
                    { 0,8,0, 0,0,7, 0,0,5 } };

    //Can solve all but these two, but online sudoku solvers can't solve them either.
    //TODO: Make it work for these two cases
    static int resultsHardest[][] = new int[][]
                  { { 8,0,0, 0,0,0, 0,0,0 },
                    { 0,0,3, 6,0,0, 0,0,0 },
                    { 0,7,0, 0,9,0, 2,0,0 },

                    { 0,5,0, 0,0,7, 0,0,0 },
                    { 0,0,0, 0,4,5, 7,0,0 },
                    { 0,0,0, 1,0,0, 0,3,0 },

                    { 0,0,1, 0,0,0, 0,6,8 },
                    { 0,0,8, 5,0,0, 0,1,0 },
                    { 0,9,0, 0,0,0, 4,0,0 } };

    static int resultsHardest2[][] = new int[][]
            { { 8,0,0, 0,0,0, 0,0,0 },
                    { 0,0,3, 6,0,0, 0,0,0 },
                    { 0,7,0, 0,9,0, 2,0,0 },

                    { 0,5,0, 0,0,7, 0,0,0 },
                    { 0,0,0, 0,4,5, 7,0,0 },
                    { 0,0,0, 1,0,0, 0,3,0 },

                    { 0,0,1, 0,0,0, 0,6,8 },
                    { 0,0,8, 5,0,0, 0,1,0 },
                    { 0,9,0, 0,0,0, 4,0,0 } };

    public static void main(String[] args) {
        Board a = new Board(resultsHarder);
        a.solve();
        a.printState();
    }
}
