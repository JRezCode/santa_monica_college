Public Class Form1
    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles txtEnterIntNumber.TextChanged

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles btnCompute.Click
        Dim intNumber As Integer
        If intNumber <= 100 Then
            intNumber = intNumber * 2
        ElseIf intNumber > 500 Then
            intNumber = intNumber * 3
        End If
    End Sub
End Class
