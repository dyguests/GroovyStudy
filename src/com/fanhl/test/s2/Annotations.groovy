import groovy.transform.Canonical
import groovy.transform.Immutable

@Canonical(excludes = "lastName,age")
class Person {
    String firstName
    String lastName
    int age
}

def sara = new Person(firstName: "Sara", lastName: "Walker", age: 49)

println sara

@Newify(Person)

def ful() {
    println "-------------------------"
    println Person.new(firstName: "JJJJ", lastName: "LLLL", age: 999)
}

ful()

@Immutable
class CreditCard {
    String name
    int id
}

@Newify(CreditCard)
def cc() {

}

println CreditCard("fanhl", 24)

////@Singleton(lazy = true)
//class TheUnique {
//    private TheUnique() { println 'Instance created' }
//
//    def hello() { println 'hello' }
//}
//
//println '-----------------'
//TheUnique.instance.hello()
//TheUnique.instance.hello()
//TheUnique.instance.hello()