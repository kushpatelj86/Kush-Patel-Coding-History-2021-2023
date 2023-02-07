/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          02-15-2022
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 23.2
 *<BR> Description:  We will be seeing how many moves the knight can make
 *<BR> Cite Sources:  Mr Elliot discussed what determines the location on the board;https://courses.mreliot.com/pluginfile.php/2326/mod_resource/content/27/apcsa_ICT_L23_pseudocode.pdf
*/
public class KnightsTourTester
{
    public static void main(String[] args) 
    {
        KnightsTour tour = new KnightsTour();
        
        

        tour.doKnightsTour();
    }
}
/*
RUN OUTPUT:

  01  --  49  42  09  --  --  --
  40  43  08  03  48  --  --  13
  --  02  41  10  07  14  --  --
  44  39  06  15  04  47  12  21
  35  26  --  46  11  22  17  --
  38  45  36  05  16  29  20  31
  25  34  27  --  23  32  --  18
  --  37  24  33  28  19  30  --

  Number of moves made: 49

  01  20  --  16  53  56  35  38
  --  17  02  25  36  39  14  55
  21  24  19  52  15  54  37  34
  18  47  22  03  26  --  40  13
  23  04  27  46  51  42  33  --
  48  07  50  --  30  09  12  41
  05  28  45  08  11  --  43  32
  --  49  06  29  44  31  10  --

  Number of moves made: 56

  01  30  --  24  --  32  07  --
  --  --  28  31  06  --  --  33
  29  02  25  --  23  08  --  --
  --  --  20  27  --  05  22  --
  --  26  03  18  21  --  09  --
  --  19  --  15  04  11  --  --
  --  --  17  --  13  --  --  10
  --  --  14  --  16  --  12  --

  Number of moves made: 33
 
  01  --  09  --  --  --  --  --
  10  05  --  --  08  --  20  --
  --  02  07  04  --  --  23  --
  06  11  --  --  --  19  --  21
  --  --  03  12  --  22  --  24
  --  --  --  --  18  15  --  --
  --  --  --  --  13  --  17  --
  --  --  --  --  16  --  14  --

  Number of moves made: 24

  01  18  31  --  11  16  33  --
  04  --  02  17  32  --  12  15
  19  30  05  08  13  10  25  34
  06  03  28  --  --  --  14  --
  29  20  07  22  09  26  35  24
  --  41  --  27  --  23  --  37
  --  --  21  42  39  36  --  44
  --  --  40  --  --  43  38  --

  Number of moves made: 44
*/