```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
}

val myInstance = new MyClass()
println(myInstance.x) //This will print 0

class AnotherClass(val x: Int) {
  // Missing an auxiliary constructor which will cause error at runtime
}

val anotherInstance = new AnotherClass()
println(anotherInstance.x) //This will cause a MatchError at runtime
```