// Assembly code emitted by HLA compiler
// Version 2.16 build 4409 (prototype)
// HLA compiler written by Randall Hyde
// GAS compatible output


        .global    QuitMain__hla_
        .global    DfltExHndlr__hla_
        .global    _HLAMain
        .global    InstallSignals__hla_


  .text


        .extern    STDOUT_PUTI16
        .extern    _HLA_GET_EXCEPTIONPTREBP
        .extern    _HLA_PUSH_EXCEPTIONPTR
        .extern    STDOUT_NEWLN
        .extern    DefaultExceptionHandler__hla_
        .extern    abstract__hla_
        .extern    _HLA_SET_EXCEPTIONPTR
        .extern    HardwareException__hla_
        .extern    excepts_install_signals
        .extern    BuildExcepts__hla_
        .extern    STDOUT_PUTS
        .extern    STDIN_GETI16
        .extern    Raise__hla_
        .extern    shortDfltExcept__hla_






  .text



        .type      InstallSignals__hla_,@function

InstallSignals__hla_:
        jmp        excepts_install_signals
End_InstallSignals__hla__2124:
  .size InstallSignals__hla_,End_InstallSignals__hla__2124-InstallSignals__hla_



        .type      DfltExHndlr__hla_,@function

DfltExHndlr__hla_:
        jmp        DefaultExceptionHandler__hla_
End_DfltExHndlr__hla__2125:
  .size DfltExHndlr__hla_,End_DfltExHndlr__hla__2125-DfltExHndlr__hla_





        .type      _HLAMain,@function

_HLAMain:
 nop
 .global _start
_start:
/*      movl       %esp, %eax */
        .byte      0x89 /*  */
        .byte      0xe0 /* mod-reg-r/m */
_findEnvp_$$_:
/*      addl       $4, %eax */
        .byte      0x83 /*  */
        .byte      0xc0 /*  */
        .byte      0x4 /*  */
/*      cmpl       $0, (%eax) */
        .byte      0x83 /*  */
        .byte      0x38 /*  */
        .byte      0x0 /*  */
        jne        _findEnvp_$$_
/*      addl       $4, %eax */
        .byte      0x83 /*  */
        .byte      0xc0 /*  */
        .byte      0x4 /*  */
/*      mov        %eax, _envp__hla_ */
        .byte      0xa3 /*  */
        .long      (_envp__hla_+0)
/*      lea        4(%esp), %eax */
        .byte      0x8d /*  */
        .byte      0x44 /*  */
        .byte      0x24 /*  */
        .byte      0x4 /*  */
/*      mov        %eax, _argv__hla_ */
        .byte      0xa3 /*  */
        .long      (_argv__hla_+0)
/*      mov        (%esp), %eax */
        .byte      0x8b /*  */
        .byte      0x4 /*  */
        .byte      0x24 /*  */
/*      mov        %eax, _argc__hla_ */
        .byte      0xa3 /*  */
        .long      (_argc__hla_+0)
        call       BuildExcepts__hla_
/*      pushl      $0 */
        .byte      0x6a /*  */
        .byte      0x0 /*  */
/*      pushl      %ebp */
        .byte      0x55 /*  */
/*      pushl      %ebp */
        .byte      0x55 /*  */
/*      lea        4(%esp), %ebp */
        .byte      0x8d /*  */
        .byte      0x6c /*  */
        .byte      0x24 /*  */
        .byte      0x4 /*  */


/*      pushl      $str__hla_2126 */
        .byte      0x68 /*  */
        .long      str__hla_2126
        call       STDOUT_PUTS
/*      pushl      %eax */
        .byte      0x50 /*  */
        call       STDIN_GETI16
/*      mov        %ax, num__hla_2120 */
        .word      0xa366
        .long      (num__hla_2120+0)
/*      popl       %eax */
        .byte      0x58 /*  */
        jmp        continue__hla_2135
while__hla_2135:
/*      mov        num__hla_2120, %ax */
        .word      0xa166
        .long      (num__hla_2120+0)
/*      addw       %ax, sum__hla_2121 */
        .byte      0x66 /* size prefix */
        .byte      0x1 /*  */
        .byte      0x5 /*  */
        .long      sum__hla_2121
/*      cmpw       $0, num__hla_2120 */
        .byte      0x66 /* size prefix */
        .byte      0x83 /*  */
        .byte      0x3d /*  */
        .long      num__hla_2120
        .byte      0x0 /*  */
        jng        false__hla_2137
/*      addw       $1, posCount__hla_2122 */
        .byte      0x66 /* size prefix */
        .byte      0x83 /*  */
        .byte      0x5 /*  */
        .long      posCount__hla_2122
        .byte      0x1 /*  */
        jmp        endif__hla_2137
false__hla_2137:
/*      cmpw       $0, num__hla_2120 */
        .byte      0x66 /* size prefix */
        .byte      0x83 /*  */
        .byte      0x3d /*  */
        .long      num__hla_2120
        .byte      0x0 /*  */
        jnl        false__hla_2138
/*      addw       $1, negCount__hla_2123 */
        .byte      0x66 /* size prefix */
        .byte      0x83 /*  */
        .byte      0x5 /*  */
        .long      negCount__hla_2123
        .byte      0x1 /*  */
false__hla_2138:
endif__hla_2137:
/*      pushl      $str__hla_2126 */
        .byte      0x68 /*  */
        .long      str__hla_2126
        call       STDOUT_PUTS
/*      pushl      %eax */
        .byte      0x50 /*  */
        call       STDIN_GETI16
/*      mov        %ax, num__hla_2120 */
        .word      0xa366
        .long      (num__hla_2120+0)
/*      popl       %eax */
        .byte      0x58 /*  */
continue__hla_2135:
/*      cmpw       $0, num__hla_2120 */
        .byte      0x66 /* size prefix */
        .byte      0x83 /*  */
        .byte      0x3d /*  */
        .long      num__hla_2120
        .byte      0x0 /*  */
        jne        while__hla_2135
exitloop__hla_2135:

        call       STDOUT_NEWLN
/*      pushl      $str__hla_2147 */
        .byte      0x68 /*  */
        .long      str__hla_2147
        call       STDOUT_PUTS
/*      pushw      $0 */
        .word      0x6a66
        .byte      0x0 /*  */
/*      pushw      sum__hla_2121 */
        .byte      0x66 /* size prefix */
        .byte      0xff /*  */
        .byte      0x35 /*  */
        .long      sum__hla_2121
        call       STDOUT_PUTI16
/*      pushl      $str__hla_2148 */
        .byte      0x68 /*  */
        .long      str__hla_2148
        call       STDOUT_PUTS
/*      pushl      $str__hla_2149 */
        .byte      0x68 /*  */
        .long      str__hla_2149
        call       STDOUT_PUTS
/*      pushw      $0 */
        .word      0x6a66
        .byte      0x0 /*  */
/*      pushw      negCount__hla_2123 */
        .byte      0x66 /* size prefix */
        .byte      0xff /*  */
        .byte      0x35 /*  */
        .long      negCount__hla_2123
        call       STDOUT_PUTI16
/*      pushl      $str__hla_2148 */
        .byte      0x68 /*  */
        .long      str__hla_2148
        call       STDOUT_PUTS
/*      pushl      $str__hla_2150 */
        .byte      0x68 /*  */
        .long      str__hla_2150
        call       STDOUT_PUTS
/*      pushw      $0 */
        .word      0x6a66
        .byte      0x0 /*  */
/*      pushw      posCount__hla_2122 */
        .byte      0x66 /* size prefix */
        .byte      0xff /*  */
        .byte      0x35 /*  */
        .long      posCount__hla_2122
        call       STDOUT_PUTI16
/*      pushl      $str__hla_2148 */
        .byte      0x68 /*  */
        .long      str__hla_2148
        call       STDOUT_PUTS
QuitMain__hla_:
/*      mov        $1, %eax */
        .byte      0xb8 /*  */
        .long      0x1
/*      xorl       %ebx, %ebx */
        .byte      0x31 /*  */
        .byte      0xdb /* mod-reg-r/m */
/*      int        $128 */
        .word      0x80cd
End__HLAMain_2151:
  .size _HLAMain,End__HLAMain_2151-_HLAMain









  .text


        .balign    (4)
len__hla_2126 :.long      0x10
        .long      0x10
str__hla_2126:

 .ascii "Enter a number: "
 .byte 0

 .byte 0
 .byte 0
 .byte 0

        .balign    (4)
len__hla_2147 :.long      0x6
        .long      0x6
str__hla_2147:

 .ascii "Sum = "
 .byte 0

 .byte 0

        .balign    (4)
len__hla_2148 :.long      0x1
        .long      0x1
str__hla_2148:
 .byte 0xa
 .byte 0

 .byte 0
 .byte 0

        .balign    (4)
len__hla_2149 :.long      0x16
        .long      0x16
str__hla_2149:

 .ascii "Number of negatives = "
 .byte 0

 .byte 0

        .balign    (4)
len__hla_2150 :.long      0x16
        .long      0x16
str__hla_2150:

 .ascii "Number of Positives = "
 .byte 0

 .byte 0




  .data

        .extern    ExceptionPtr__hla_
        .extern    MainPgmCoroutine__hla_
        .balign    (4)
num__hla_2120 :.space     2
sum__hla_2121 :.word  0x0
posCount__hla_2122 :.word  0x0
negCount__hla_2123 :.word  0x0


 .data
 .global _envp__hla_
 .global _argc__hla_
 .global _argv__hla_
_argc__hla_: .long 0
_argv__hla_: .long 0
_envp__hla_: .long 0





