class Robot {
    def type,name

    def access(l, w, f) {
        println "$l $w $f"
    }
}

robot =new Robot(type: 'O',name: 'fanhl')
println "$robot.type,$robot.name"
robot.access(x:30,y:33,z:40,12345,true)
robot.access(x:30,2,3)
robot.access(1,x:30,3)