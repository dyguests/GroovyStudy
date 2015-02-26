package main

import "fmt"
import "time"

//求和
func 耗时方法(values [] int,resultChan chan int){
    sum:=0
    for _,value:=range values{
        fmt.Println("loop: ",value)
        time.Sleep(time.Second)
        sum+=value
    }
    resultChan<-sum
}

func main(){
    values:=[] int{1,2,3,4,5,6,7,8,9,10}
    
    resultChan:=make(chan int,2)
    go 耗时方法(values[:len(values)/2],resultChan)
    go 耗时方法(values[len(values)/2:],resultChan)
    sum1,sum2:=<-resultChan,<-resultChan
    
    fmt.Println("Result: ",sum1,sum2,sum1+sum2)
}