public class KnightsTour2
{
    private int[][] ChessBoard = new int[9][9];
    private int[][] Location = new int[9][9];
    private boolean[] Taken = new boolean[9];
    private int[] Horizontal = {0, 1, 2 , 2, 1, -1, -2, -2, -1};
    private int[] Vertical = {0, -2, -1 , 1, 2, 2, 1, -1, -2};
    private int myRow, myCol;
    private int moveCount;

    public KnightsTour2()
    {
        
        ChessBoard[1][1] = 1;
        moveCount = 1;
        myRow = 1;
        myCol = 1;

    }

    public void doKnightsTour()
    {
        while(moveKnight() == true)
        {
            ///no code on purpose
            ///no code on purpose
            ///no code on purpose


        }
        printChessBoard();
    } 

    private boolean allTakenNearby()
    {
        boolean everythingFilled = true;
        int tempRow;
        int tempCol;

        for(int k = 1; k < Taken.length; k++)
        {
            Taken[k] = false;
        }

        for(int i = 1; i < Taken.length; i++)
        {
            tempRow = myRow + Vertical[i];
            tempCol = myCol + Horizontal[i];
            if(tempRow >= 1 && tempRow < Taken.length && tempCol >= 1 &&  tempCol < Taken.length)
            {
                if(ChessBoard[tempRow][tempCol] > 0)
                {
                    
                    
                        Taken[i] = true;

                    
                }

                else
                {
                    everythingFilled = false;
                }
            }
            else
            {
                Taken[i] = true;

            }

        }

        return everythingFilled;
    }

    private boolean moveKnight()
    {
        boolean moveMade = false;
        int randPos;
        int size2DArray = 64;
        
        if(moveCount == size2DArray)
        {
            return true;
        }
        
        int rndPosition = (int)(Math.random() * 8) + 1;

        for(int i = 1; i < Taken.length; i++)
        {
            myRow += Vertical[rndPosition];
            myCol += Horizontal[rndPosition];
            moveCount++;
            ChessBoard[myRow][myCol] = moveCount;
            moveMade = true;
        } 
        return moveMade;
        
    }

    private void printChessBoard()
    {
        for(int row = 1; row < Taken.length; row++)
        {
            for(int collum = 1; collum < Taken.length; collum++)
            {
                if(ChessBoard[row][collum] == 0)
                {
                    System.out.print(" - ");
                }

                else if(ChessBoard[row][collum] >= 1 && ChessBoard[row][collum] <= 9)
                {
                    System.out.print(" 0" + ChessBoard[row][collum]);
                }

                else
                {
                    System.out.print(" " + ChessBoard[row][collum]);

                }
            }
            System.out.println();
        }
        System.out.println("Number of moves made: " + moveCount);
    }
    
}