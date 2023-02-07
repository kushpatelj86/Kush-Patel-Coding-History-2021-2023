Rem		Dec2Any - Convert a decimal number to any other base
Rem 	http://www.devx.com/vb2themax/Tip/19414
Rem		by Francesco Balena
Rem 	Convert a positive number to any base.  BASE can be in the range 2-36


Const Digits As String = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"


Rem If using Global Variables for number and base, then parameters would
Rem be empty, AND you **MUST** make a copy of the global "number" so that it
Rem is not changed!!
Function Dec2Any(ByVal number As Integer, ByVal base As Integer) As String

    Dim digitValue As Integer
    Dim Result As String

    Rem check base and value
    If number < 0 Then
        Rem Return error message such as "value to be converted must be a positive number"
    ElseIf base < 2 Or base > 36 Then
        Rem Return error message such as "base must be in the range 2 to 36"
	Else
		Rem convert to the other base
		Do While number > 0
			digitValue = number Mod base
			Rem convert digitValue to a character using digits string
			Rem and **concatenate** it to the LEFT of the current result
			Result = digits.Chars(digitValue) + Result;
			number = number / base
		Loop
	End If

    Return Result
	
End Function
