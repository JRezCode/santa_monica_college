<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.btnCompute = New System.Windows.Forms.Button()
        Me.lblResult = New System.Windows.Forms.Label()
        Me.lblIntNumber = New System.Windows.Forms.Label()
        Me.txtEnterIntNumber = New System.Windows.Forms.TextBox()
        Me.SuspendLayout()
        '
        'btnCompute
        '
        Me.btnCompute.Location = New System.Drawing.Point(216, 288)
        Me.btnCompute.Name = "btnCompute"
        Me.btnCompute.Size = New System.Drawing.Size(124, 43)
        Me.btnCompute.TabIndex = 0
        Me.btnCompute.Text = "Compute"
        Me.btnCompute.UseVisualStyleBackColor = True
        '
        'lblResult
        '
        Me.lblResult.AutoSize = True
        Me.lblResult.Location = New System.Drawing.Point(201, 214)
        Me.lblResult.Name = "lblResult"
        Me.lblResult.Size = New System.Drawing.Size(139, 20)
        Me.lblResult.TabIndex = 1
        Me.lblResult.Text = "Display IntNumber"
        '
        'lblIntNumber
        '
        Me.lblIntNumber.AutoSize = True
        Me.lblIntNumber.Location = New System.Drawing.Point(201, 89)
        Me.lblIntNumber.Name = "lblIntNumber"
        Me.lblIntNumber.Size = New System.Drawing.Size(204, 20)
        Me.lblIntNumber.TabIndex = 2
        Me.lblIntNumber.Text = "Enter a value for IntNumber"
        '
        'txtEnterIntNumber
        '
        Me.txtEnterIntNumber.Location = New System.Drawing.Point(205, 143)
        Me.txtEnterIntNumber.Name = "txtEnterIntNumber"
        Me.txtEnterIntNumber.Size = New System.Drawing.Size(173, 26)
        Me.txtEnterIntNumber.TabIndex = 3
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(9.0!, 20.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.txtEnterIntNumber)
        Me.Controls.Add(Me.lblIntNumber)
        Me.Controls.Add(Me.lblResult)
        Me.Controls.Add(Me.btnCompute)
        Me.Name = "Form1"
        Me.Text = "Selection Homework - Jonathan"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents btnCompute As Button
    Friend WithEvents lblResult As Label
    Friend WithEvents lblIntNumber As Label
    Friend WithEvents txtEnterIntNumber As TextBox
End Class
