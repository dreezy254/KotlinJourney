package com.example.dreezy

class StockBroker {
    private val stockPrices:MutableMap<String, Double> = mutableMapOf()
    fun setStockPrice(symbol: String, price: Double){
        stockPrices[symbol]= price
    }

    fun buyShares(symbol: String, quantity:Int, customer: SavingsAccount){
        val stockPrice = stockPrices[symbol]

        if (stockPrice != null) {
            val totalCost = quantity * stockPrice

            if (customer.getBalance() >= totalCost){
                customer.setBalance(customer.getBalance() - totalCost)
            println("bought $quantity shares of $symbol for $totalCost  remaining balance: ${customer.getBalance()}")
            }else{
                println("insufficient funds")
            }
        }else{
            println("stock price for $symbol not available")
        }
    }
}