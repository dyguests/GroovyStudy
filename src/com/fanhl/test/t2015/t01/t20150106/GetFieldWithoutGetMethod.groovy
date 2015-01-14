import java.lang.reflect.Field

//there is a probelm: getA() no match field a
class ClassA {
    def a = 1, b = 1000

    def getA() {
        return b
    }
}

def instance = new ClassA()

//so I can't get field a
println instance.a

//lucky there's another say.
Field field = ClassA.class.getDeclaredField("a")
field.setAccessible(true)
println field.get(instance)