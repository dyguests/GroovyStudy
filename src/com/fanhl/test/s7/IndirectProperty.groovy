class Car2 {
    int miles, fuelLevel
}

car = new Car2(miles: 100, fuelLevel: 1000)

println car['miles']

class Person2 {
    def walk() { println 'walking...' }
    def walk(miles) { println "walking $miles miles..." }
    def walk(miles, where) { println "walking $miles miles $where" }
}

peter=new Person2()
peter.invokeMethod('walk',null)
peter.invokeMethod('walk',100)
//peter.invokeMethod('walk',100,'Tokyo')//错误的写法
peter.invokeMethod('walk',[100,'Tokyo'])

