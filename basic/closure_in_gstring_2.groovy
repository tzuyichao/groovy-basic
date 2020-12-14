class Person {
    String name
    String toString() {
        name
    }
}

def sam = new Person(name: 'Sam')
def lucy = new Person(name: 'Lucy')

def p = sam 
def gs1 = "Name: ${p}"
def gs2 = "Name: ${-> p}"

println gs1
println gs2

p = lucy
println gs1
println gs2

sam.name = 'Lucy'
println gs1
println gs2
