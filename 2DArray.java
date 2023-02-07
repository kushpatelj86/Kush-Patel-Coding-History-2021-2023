public class 2DArray{

public static void main(String[] args) 
{
    int[][] array = new int[3][3];

    array[0][0] = 1;
    array[0][1] = 2;
    array[0][2] = 3;
    array[1][0] = 4;
    array[1][1] = 5;
    array[1][2] = 6;
    array[2][0] = 7;
    array[2][1] = 8;
    array[2][2] = 9;



    System.out.println("Acesing a element " + array[0][1]);
    System.out.println("Length of inner array " + array[0].length);
    System.out.println("Length of outer array " + array.length);




}




}