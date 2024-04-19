package com.jamiahus.bankaccountprogram

class BankAccount (
    var accountHolder: String,
    var balance :Double)
{
    private val transationHisotry = mutableListOf<String>()

    fun deposit(amount: Double){
        balance += amount
        transationHisotry.add("$accountHolder deposited $$amount")
    }

    fun withdraw (amount: Double){
        if (amount <= balance){
            balance -= amount
            transationHisotry.add("$accountHolder withdrew $$amount")
        } else {
            println("You do not have the funds to withdraw $$amount")
        }
    }

    fun displayTransactionHistory(){
        println("Transation History for $accountHolder")
        for (transation in transationHisotry){
            println(transation)
        }
    }

    fun acctBalance () :Double{
        return balance
    }
}