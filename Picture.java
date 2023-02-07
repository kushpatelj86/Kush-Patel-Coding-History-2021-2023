/**
 * @student.info
 *<BR> Name:          Kush Patel
 *<BR> Date:          3-31-2022
 *<BR> Period:        2
 *<BR> Assignment:    AP Picture Lab
 *<BR> Description:   We will be doing the picture lab
 *<BR> Cite Sources:  Mr.Elliot explained to us how to use infared
 */


import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    for (int row = 27; row < 97; row++)
    {
      for (int col = 13; col < mirrorPoint; col++)
      {
        count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
  
      }
    }
    System.out.println("Count: " + count);
  }
   /** Mirror the arms of a snowman hoizontally */
   public void mirrorArms()
   {
     int mirrorPoint = 190;
     Pixel topPixel = null;
     Pixel bottomPixel = null;
     Pixel[][] pixels = this.getPixels2D();
     
     // loop through the left arm
     for(int row = 160; row < mirrorPoint; row++)
     {
       for(int col = 70; col < 170; col++)
       {
         topPixel = pixels[row][col];
         bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
         bottomPixel.setColor(topPixel.getColor());
       }
     }

     int mirrorPoint2 = 189;
     Pixel topPixel2 = null;
     Pixel bottomPixel2 = null;

     // loop through the right arm

     for(int row = 160; row < mirrorPoint2; row++)
     {
       for(int col = 239; col < 294; col++)
       {
         topPixel2 = pixels[row][col];
         bottomPixel2 = pixels[mirrorPoint2 - row + mirrorPoint2][col];
         bottomPixel2.setColor(topPixel2.getColor());
       }
     }

   }


  /**to mirror the seagull  to the right so that there are two seagulls on the beach near each other. */
   public void mirrorGull()
   {
     int mirrorPoint = 348;
     Pixel leftPixel = null;
     Pixel rightPixel = null;
     Pixel[][] pixels = this.getPixels2D();
     
     // seagull
     for (int row = 224; row < 332; row++)
     {
       for (int col = 219; col < mirrorPoint; col++)
       {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
       }
     }

     
   }



  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }

  
  /** Method keepss the blue parts of the image while removes all other primary colors and sets green and red values to zero */

  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for(Pixel[] rowArray : pixels)
    {
      for(Pixel item : rowArray)
      {
        item.setGreen(0);
        item.setRed(0);
      }
    }
  }

   /** Method keepss the red parts of the image while removes all other primary colors and sets green and blue values to zero */

   public void keepOnlyRed()
   {
     Pixel[][] pixels = this.getPixels2D();
     for(Pixel[] rowArray : pixels)
     {
       for(Pixel item : rowArray)
       {
         item.setGreen(0);
         item.setBlue(0);
       }
     }
   }

      /** Method keepss the green parts of the image while removes all other primary colors and sets red and blue values to zero */

      public void keepOnlyGreen()
      {
        Pixel[][] pixels = this.getPixels2D();
        for(Pixel[] rowArray : pixels)
        {
          for(Pixel item : rowArray)
          {
            item.setRed(0);
            item.setBlue(0);
          }
        }
      }
  /** Method gets rid of or negate all the pixels in a image */

  public void negate()
  {
    Pixel[][] pixels =  this.getPixels2D();
    for(Pixel[] rowArray : pixels)
    {
      for(Pixel item : rowArray)
      {
        item.setBlue(item.getBlue() - 255);
        item.setGreen(item.getGreen() - 255);
        item.setRed(item.getRed() - 255);

      }
    }
  }
  
  /** Method turns the image into shades of grey, sets the red, fren and blue values to the average of the current red, green and blue values */
  public void grayScale()
  {
    Pixel[][] pixels = this.getPixels2D();
    for(Pixel[] rowArray : pixels)
    {
      for(Pixel item : rowArray)
      {
        int average = (int) ((item.getBlue() + item.getGreen() + item.getRed()) / 3);
        item.setBlue(average);
        item.setGreen(average);
        item.setRed(average);


      }
    }
  }

  /** Method turns changes rhe pixel colors to make the fish easier and more clear to see */

  public void fixUnderwater()
  {
    Pixel[][] pixels = this.getPixels2D();
    for( Pixel[] rowArray : pixels)
    {
      for(Pixel item : rowArray)
      {
        item.setRed(item.getRed() * 4);
        



      }
    }
  }

  
  
  /** Method mirrors a picture around a mirror placed vertically from right to left. */
public void mirrorVerticalRightToLeft()
{
  Pixel[][] pixels = this.getPixels2D();
  Pixel leftPixel = null;
  Pixel rightPixel = null;
  int width = pixels[0].length;

  for(int row = 0; row < pixels.length; row ++)
  {
    for(int col = 0; col < width / 2; col++)
    {
      leftPixel = pixels[row][col];
      rightPixel = pixels[row][width - 1 - col];
      leftPixel.setColor(rightPixel.getColor());
    }
  }
}

  /** Method mirrors a picture around a mirror placed horizontally at the middle of the height of the picture. */
public void mirrorHorizontal()
{
  Pixel[][] pixels = this.getPixels2D();
  Pixel topPixel = null;
  Pixel bottomPixel = null;
  int height = pixels.length;

  for(int row = 0; row < (height / 2); row++)
  {
    for(int col = 0; col < pixels[0].length; col++)
    {
      topPixel = pixels[row][col];
      bottomPixel = pixels[height - row - 1][col];
      bottomPixel.setColor(topPixel.getColor());
    }
  }
}
  /** mirrors the picture around a mirror placed horizontally from bottom to top. */
public void mirrorHorizontalBottomToTop()
{
  Pixel[][] pixels = this.getPixels2D();
  Pixel topPixel = null;
  Pixel bottomPixel = null;
  int height = pixels.length;


  for(int row = 0; row < (height / 2); row++)
  {
    for(int col = 0; col < pixels[0].length; col++)
    {
      topPixel = pixels[row][col];
      bottomPixel = pixels[height - 1 - row][col];
      topPixel.setColor(bottomPixel.getColor());
    }
  }
}
  /** that mirrors just a square part of the picture from bottom left to top right around a mirror placed on the diagonal line (the diagonal line is the one where the row index equals the column index). */
public void mirrorDiagonal()
{
  Pixel[][] pixels = this.getPixels2D();
  Pixel bottomLeftPixel = null;
  Pixel topRightPixel = null;
  int maxLength = pixels.length;
  if (pixels[0].length < maxLength) 
  { 
    maxLength = pixels[0].length; 
  }
  else
  {
    maxLength = pixels.length;
  }
  
  for(int row = 1; row < maxLength; row++)
  {
    for(int col = 0; col < row; col++)
    {
      bottomLeftPixel = pixels[row][col];
      topRightPixel = pixels[col][row];
      topRightPixel.setColor(bottomLeftPixel.getColor());
    }
  }
}


  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
