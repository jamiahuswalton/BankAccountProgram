package com.jamiahus.bankaccountprogram

fun main(){

    val jamiahusBankAccount = BankAccount("Jamiahus", 20000.56)

    jamiahusBankAccount.deposit(200.19)
    jamiahusBankAccount.withdraw(1200.0)
    jamiahusBankAccount.deposit(2000.0)
    jamiahusBankAccount.deposit(3000.0)
    jamiahusBankAccount.withdraw(3333.15)
    jamiahusBankAccount.displayTransactionHistory()

    println("${jamiahusBankAccount.accountHolder}'s balance is ${jamiahusBankAccount.acctBalance()}")

    val sarahBankAccoun = BankAccount("Sarah", 0.0)

    sarahBankAccoun.deposit(100.0)
    sarahBankAccoun.withdraw(10.0)
    sarahBankAccoun.deposit(300.0)
    sarahBankAccoun.displayTransactionHistory()
    println("${sarahBankAccoun.accountHolder}'s balance is ${sarahBankAccoun.acctBalance()}")
}