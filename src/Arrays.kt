fun main(args: Array<String>) {
  var names: Array<String> = arrayOf("Jordy", "Robert", "Daan")
  names[0] = "Dyro"
  println(names.toList())

  var ages: IntArray = intArrayOf(23, 25, 22)
  println(ages.toList())

  val values = Array(10, {0.2})
  println(values.toList())

  val squares: Array<String> = Array(10, {(it*it).toString()})
  println(squares.toList())
}
