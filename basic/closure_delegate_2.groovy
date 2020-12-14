class Person {
    String name
    def pretty = { "My name is $name" }
    String toString() {
        pretty()
    }
}

class Thing {
    String name
}

def p = new Person(name: 'Sarah')
def t = new Thing(name: 'Teapot')

assert p.toString() == 'My name is Sarah'
// closure default resolve strategy: Closure.OWNER_FIRST
p.pretty.delegate = t
assert p.toString() == 'My name is Sarah'

def cl = p.pretty
//def cl = {1}
println Closure.DELEGATE_FIRST
println cl.getResolveStrategy()
try {
    cl.setResolveStrategy(Colsure.DELEGATE_FIRST)
    cl.delegate = t
    assert cl() == 'My name is Teapot'
} catch (MissingPropertyException e) {
    e.printStackTrace()
}