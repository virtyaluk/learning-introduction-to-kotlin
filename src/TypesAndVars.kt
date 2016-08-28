fun main(args: Array<String>) {
  var_declarations()
}

fun var_declarations() {
  val a: Int = 24
  val b: Long = 334
  val c: Float = 4.3f
  val d: Double = 45.3e5

  println("$a $b $c $d")

  var e: Int;
  e = a;
  //e = 4;

  val f: StringBuffer = StringBuffer("test")
  f.replace(0, 1, "T")
  //f = StringBuffer("Foo")

  println(f)

  var g: Int = 352
  g = 34

  println("$g")
}
