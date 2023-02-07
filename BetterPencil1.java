/** @student.info
 *<BR> Name:			Mr. Eliot
 *<BR> Date:			10-18-2013, 10-08-2015, 10-5-2016
 *<BR> Assignment:		QUIZ 02:  Review Session Example
 */

public class BetterPencil1
{
		//private global variables available everywhere
		public double pencilLength;
		public double eraserLength;
		
		//constructor methods
		
		public BetterPencil1()
		{
			pencilLength = 7.5;
			eraserLength = 0.5;
		}

		public BetterPencil1(double pencil, double eraser)
		{
			pencilLength = pencil;
			eraserLength = eraser;
		}

		public BetterPencil1(BetterPencil1 Other)
		{
			Other.getPencilLength();
			Other.getEraserLength();
		}
		
		//other methods
	
		public void sharpen()
		{
			pencilLength = pencilLength - 0.5;
		}
		
		public void write()
		{
			pencilLength = pencilLength - 0.25;
		}

		public void erase()
		{
			eraserLength = eraserLength - 0.05;
		}

		public double getPencilLength()
		{
			return pencilLength;
		}
		
		public double getEraserLength()
		{
			return eraserLength;
		}
		
	
	
}










