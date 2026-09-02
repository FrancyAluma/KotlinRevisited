package Chapter4ClassesAndObjects

open class Parent {

    /*

    public : Makes the member visible everywhere that the class is visible.
    This is applied by default , so it can be omitted.

    private : Makes the member visible inside the class, and invisible elsewhere.
    protected : Makes the member visible inside the class, and any of its subclasses.
    internal : Makes the member visible to anything in the module that can see the class

     */

    var a = 1
    private var b = 2
    protected open var c = 3

    internal var d = 4
}

class child : Parent() {

    override var c = 6
}