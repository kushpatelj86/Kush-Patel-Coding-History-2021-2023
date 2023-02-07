/**
 * @student.info
 *<BR> Name:          Kush Patel
 *<BR> Date:          3-31-2022
 *<BR> Period:        2
 *<BR> Assignment:    AP Picture Lab
 *<BR> Description:   We will be doing the picture lab
 *<BR> Cite Sources:  Mr.Elliot explained to us how to use infared
 */


/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
    /** Method to test mirrorArms */
    public static void testMirrorArms()
    {
      Picture snowman = new Picture("snowman.jpg");
      snowman.explore();
      snowman.mirrorArms();
      snowman.explore();
    }
    
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
    /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
    Picture motor = new Picture("blueMotorCycle.jpg");
    motor.keepOnlyBlue();
    motor.explore();
  }
    /** Method to test keepOnlyRed */
  public static void testKeepOnlyRed()
  {
    Picture jenny = new Picture("jenny-red.jpg");
    jenny.keepOnlyRed();
    jenny.explore();
  }
    /** Method to test keepOnlyGreen */
    public static void testKeepOnlyGreen()
    {
      Picture flower1 = new Picture("flower1.jpg");
      flower1.keepOnlyGreen();
      flower1.explore();
    }

    /** Method to test negate */
    public static void testNegate()
    {
      Picture robot = new Picture("robot.jpg");
      robot.negate();
      robot.explore();
    }

    /** Method to test grayScale */
    public static void testGrayscale()
    {
      Picture seagull = new Picture("seagull.jpg");
      seagull.grayScale();
      seagull.explore();
    }

    /** Method to test FixUnderwater */
    public static void testFixUnderwater()
    {
      Picture fix = new Picture("water.jpg");
      fix.fixUnderwater();
      fix.explore();
    }

    /** Method to test MirrorDiagonal */
    public static void testMirrorDiagonal()
    {
      Picture arch = new Picture("arch.jpg");
      arch.mirrorDiagonal();
      arch.explore();
    }
/** Method to test mirrorVerticalLeftToRight */
public static void testMirrorVerticalRightToLeft()
{
  Picture caterpillar = new Picture("caterpillar.jpg");
  caterpillar.explore();
  caterpillar.mirrorVerticalRightToLeft();
  caterpillar.explore();
}
/** Method to test mirrorVerticalLeftToRight */
public static void testMirrorHorizontal()
{
  Picture caterpillar = new Picture("caterpillar.jpg");
  caterpillar.explore();
  caterpillar.mirrorHorizontal();
  caterpillar.explore();
}

/** Method to test mirrorHorizontalBottomToTop */
public static void testMirrorHorizontalBottomToTop()
{
  Picture caterpillar = new Picture("caterpillar.jpg");
  caterpillar.explore();
  caterpillar.mirrorHorizontalBottomToTop();
  caterpillar.explore();
}

/** Method to test mirrorGull */
public static void testMirrorGull()
{
  Picture seagull = new Picture("seagull.jpg");
  seagull.explore();
  seagull.mirrorGull();
  seagull.explore();
}

  /** Main method for testing.  Every class can have a main
    * @param args the array of arguments sent to the main method
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	
	
    //testZeroBlue();
    //testKeepOnlyBlue();
   // testKeepOnlyRed();
   // testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
   // testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
   //testMirrorHorizontal();
   //testMirrorHorizontalBottomToTop();
  //testMirrorTemple();
   /// testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	
  }
}
/* Run Output:



*/