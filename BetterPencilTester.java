/** @student.info
 *<BR> Name:			Mr. Eliot
 *<BR> Date:			10-18-2013, 10-08-2015, 10-5-2016
 *<BR> Assignment:		QUIZ 02:  Review Session Example
 */

public class BetterPencilTester
{
    public static void main(String[] args)
    {
		//Create Pencil Objects
		BetterPencil MyPencil01 = new BetterPencil();
		BetterPencil MyPencil02 = new BetterPencil(5.5, 0.20);
		BetterPencil MyPencil03 = new BetterPencil(MyPencil02);

		//ALL PENCILS BEFORE
		System.out.println("ALL PENCILS BEFORE");
		System.out.println("Pencil01 Pencil Length: " + MyPencil01.getPencilLength());
		System.out.println("Pencil01 Eraser Length: " + MyPencil01.getEraserLength());
		System.out.println("Pencil02 Pencil Length: " + MyPencil02.getPencilLength());
		System.out.println("Pencil02 Eraser Length: " + MyPencil02.getEraserLength());
		System.out.println("Pencil03 Pencil Length: " + MyPencil03.getPencilLength());
		System.out.println("Pencil03 Eraser Length: " + MyPencil03.getEraserLength());
		System.out.println();
		System.out.println();

		//Use Pencils Set 01
		MyPencil01.sharpen();
		MyPencil02.write();
		MyPencil03.write();
		MyPencil03.erase();
		MyPencil03.erase();
		
		//Use Pencils Set 02
		MyPencil01.write();
		MyPencil02.sharpen();
		MyPencil02.erase();
		MyPencil03.sharpen();

		//Use Pencils Set 03
		MyPencil01.sharpen();
		MyPencil01.erase();
		MyPencil02.write();
		MyPencil02.write();
		MyPencil03.write();
		
		//Use Pencils Set 03
		MyPencil01.erase();
		MyPencil01.erase();
		MyPencil02.erase();
		MyPencil03.erase();

		//ALL PENCILS AFTER
		System.out.println("ALL PENCILS AFTER");
		System.out.println("Pencil01 Pencil Length: " + MyPencil01.getPencilLength());
		System.out.println("Pencil01 Eraser Length: " + MyPencil01.getEraserLength());
		System.out.println("Pencil02 Pencil Length: " + MyPencil02.getPencilLength());
		System.out.println("Pencil02 Eraser Length: " + MyPencil02.getEraserLength());
		System.out.println("Pencil03 Pencil Length: " + MyPencil03.getPencilLength());
		System.out.println("Pencil03 Eraser Length: " + MyPencil03.getEraserLength());
    }
}

/*
RUN OUTPUT:

Process started >>>
ALL PENCILS BEFORE
Pencil01 Pencil Length: 7.5
Pencil01 Eraser Length: 0.25
Pencil02 Pencil Length: 5.5
Pencil02 Eraser Length: 0.2
Pencil03 Pencil Length: 5.5
Pencil03 Eraser Length: 0.2


ALL PENCILS AFTER
Pencil01 Pencil Length: 6.475
Pencil01 Eraser Length: 0.10000000000000002
Pencil02 Pencil Length: 4.924999999999999
Pencil02 Eraser Length: 0.10000000000000002
Pencil03 Pencil Length: 4.949999999999999
Pencil03 Eraser Length: 0.05000000000000002
<<< Process finished. (Exit code 0)

*/