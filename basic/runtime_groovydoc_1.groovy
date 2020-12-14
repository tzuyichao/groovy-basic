
/**
 * test will not show
 */
 /**@
 * Some class groovydoc for Foo
 */
class Foo {
    /**@
     * Some method groovydoc for bar
     */
    void bar() {

    }
}

// groovy -D groovy.attach.runtime.groovydoc=true .\runtime_groovydoc_1.groovy
println Foo.class.groovydoc.content
println Foo.class.getMethod('bar', new Class[0]).groovydoc.content