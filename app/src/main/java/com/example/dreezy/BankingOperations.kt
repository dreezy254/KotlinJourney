package com.example.dreezy

interface BankAccount {
    fun deposit (amount: Double)
    fun withdrawFromTeller (amount: Double)
    fun withdrawFromATM (amount: Double)
    fun getBalance(): Double
}

abstract class AbstractAccount(private var balance: Double) : BankAccount {
    override fun deposit(amount: Double) {
        if (amount > 0) {


            balance += amount
        }
    }

    override fun withdrawFromTeller(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
        }
    }

    override fun withdrawFromATM(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
        }
    }

    override fun getBalance(): Double {
        return balance
    }
    fun setBalance(newBalance:Double){
        balance = newBalance
    }

        abstract fun accountType(): String
}

class SavingsAccount(balance:Double) :AbstractAccount(balance){
    override fun accountType(): String {
        return "savings account"
    }
}