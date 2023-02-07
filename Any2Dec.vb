Rem		Any2Dec - Convert from any numeric base to decimal
Rem		http://www.devx.com/vb2themax/Tip/19411
Rem		by Francesco Balena
Rem 	Convert from any base to decimal.  BASE can be in the range 2-36


Const Digits As String = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"

Rem You may not need both parameters if you are using global values in Java
Function Any2Dec(ByVal otherBaseString As String, ByVal base As Integer) As Integer

    Dim i As Integer
    Dim digitValue As Long
	Dim result As Integer
	Dim power As Integer = 0
	Dim length As Integer
	Dim myChar As Char
	
	Rem make sure String to be converted is UPPERCASE
	Rem this is not needed if already done in constructor
	otherBaseString = otherBaseString.ToUpper()
	length = Len(otherBaseString)
	
	Rem check length of otherBaseString
	If length = 0
		Rem PRINT error message about an "empty number string"
		Return -1	
	End If

    Rem check base
    If base < 2 Or base > 36 Then
        Rem PRINT error message such as "base must be in the  range 2 to 36"
		Return -1
    End If

    Rem convert to decimal
	Rem IMPORTANT:  VB measures string positions from "1 to length", not "0 to length - 1" like Java does!! 
	Rem for loop counts down from length to 1!
    For i = length to 1 Step -1
        Rem get one character from the String, and convert to its numerical value
		myChar = otherBaseString.Chars(i)
        digitValue = digits.IndexOf(myChar)
        Rem error if invalid digit
        If digitValue < 0 Then
            Rem PRINT error message for an "invalid character which doesn't fit this base"
			Return -1
		ElseIf digitValue >= base then
			Rem PRINT error message for a "digit beyond the range of the base"
			Return -1
        End If
        Rem add to running result integer
		Rem IMPORTANT:  in Java, use of Math.pow(), which returns a *double*, may create an error here!!
        result = result + digitValue * (base ^ power)
		power = power + 1
    Next
	
	Return result
	
End Function
