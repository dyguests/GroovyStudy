def completeOrder(amount, taxComputer) {
    if (taxComputer.maximumNumberOfParameters == 2) {
        println taxComputer(amount, 6.05)
    } else {
        println taxComputer(amount)
    }
}

completeOrder(10000){it*0.0825}
completeOrder(10000){amount,rate->amount*rate/100}