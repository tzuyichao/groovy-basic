assert '$5' == "\$5"
assert '${name}' == "\${name}"

def number = 3.14
groovy.test.GroovyAssert.shouldFail(MissingPropertyException) {
    println "$number.toString()"
}