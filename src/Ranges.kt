fun main(args: Array<String>) {
  val a: IntRange = 1..10
  for (a1 in a) println(a1)

  val b = 1.rangeTo(10).reversed()
  println("sum of ints $b = ${b.sum()}")

  val c = 10 downTo 1 // 10.downTo(1)
  for (c1 in c) println(c1)

  val from = -3
  val to = 8
  val d = IntRange(Math.min(from, to), Math.max(from, to))
  for (d1 in d) println(d1)

  var e = 100 downTo 1 step 5
  for (e1 in e) print("$e1\t")
}
