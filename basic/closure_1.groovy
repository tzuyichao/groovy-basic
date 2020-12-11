class Enclosing {
    void run() {
        def whatIsThisObject = { getThisObject() }
        assert whatIsThisObject() == this
        def whatIsThis = { this }
        assert whatIsThis() == this
        assert whatIsThis() == whatIsThisObject()
    }
}

def obj = new Enclosing()
obj.run()

def listener = { e -> println "Clicked on $e.source" }

assert listener instanceof Closure

def code = { 123 }

assert code.call() == 123
assert code() == 123

def isOdd = { int i -> i % 2 != 0 }
assert isOdd(3) == true
assert isOdd.call(2) == false

def isEven = { it % 2 == 0 }
assert isEven(3) == false
assert isEven.call(2) == true

class NestedClosures {
    void run() {
        def nestedClosures = {
            def cl = { this }
            cl()
        }
        assert nestedClosures() == this
    }
}

def nestedClosures = new NestedClosures()
nestedClosures.run()
