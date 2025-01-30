```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
}

val myInstance = new MyClass()
println(myInstance.x) //Prints 0

class AnotherClass(val x: Int) {
  def this() = this(0) // Added auxiliary constructor
}

val anotherInstance = new AnotherClass()
println(anotherInstance.x) // Prints 0
```