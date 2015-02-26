package com.fanhl.test.t2015.t02.t20150201

//这个要在控制台下执行才行
//def username = System.console().readLine 'What is your name?'
//println "Hello $username"

//这个可以用
//def readln = javax.swing.JOptionPane.&showInputDialog
//def username = readln 'What is your name?'
//println "Hello $username."

//这个好用
//Scanner input=new Scanner(System.in)
//def line=input.nextLine()
//println "line:$line"

//System.in.withReader {
//    println "Test: "
//    carrier = it.readLine()
//}

def reader = System.in.newReader()
def line = reader.readLine()
println line