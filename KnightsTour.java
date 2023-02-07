/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          02-15-2022
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 23.2
 *<BR> Description:  We will be seeing how many moves the knight can make
 *<BR> Cite Sources:  Mr Elliot discussed what determines the location on the board
*/
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class KnightsTour
{
    private int[][] ChessBoard = new int[9][9];
    private boolean[] Taken = new boolean[9];
    private int[] Horizontal = {0, 1, 2 , 2, 1, -1, -2, -2, -1};
    private int[] Vertical = {0, -2, -1 , 1, 2, 2, 1, -1, -2};
    private int myRow, myCol;
    private int moveCount;

    public KnightsTour()
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
        int size2DArray = Horizontal.length * Vertical.length;
        
        
        


        if(moveCount < size2DArray)
        {
            if(allTakenNearby() == false)
            {
                while(moveMade == false)
                {
                    randPos = (int) (Math.random() * 8) + 1;

                    if(Taken[randPos] == false)
                    {
                        myRow += Vertical[randPos];
                        myCol += Horizontal[randPos];
                        moveCount++;
                        ChessBoard[myRow][myCol] = moveCount;
                        moveMade = true;

                    }
                }
            }
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
                    System.out.print("  --");
                }

                else if(ChessBoard[row][collum] >= 1 && ChessBoard[row][collum] <= Taken.length)
                {
                    System.out.print("  0" + ChessBoard[row][collum]);
                }

                else
                {
                    System.out.print("  " + ChessBoard[row][collum]);

                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("  Number of moves made: " + moveCount);
    }

    
    

}