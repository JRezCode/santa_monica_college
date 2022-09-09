Public Class Form1
    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Dim i As Integer
        Dim HowMuch As Integer
        HowMuch = 0
        For i = 1 To 10
            If i < 5 Then
                HowMuch = HowMuch + 1
            ElseIf i = 5 Then
                HowMuch = HowMuch - 5
            Else
                HowMuch = HowMuch + 3
            End If
            Print i, HowMuch 
    Next i
        Print HowMuch
    End Sub

End Class
