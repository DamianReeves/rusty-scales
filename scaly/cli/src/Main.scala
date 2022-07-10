package scaly.cli

class RustyFFI {
  @native def add(a: Int, b: Int): Int
  @native def decorate(s: String): String
}

object Main {
  def main(args: Array[String]): Unit = {
    val ffi = new RustyFFI
    println(ffi.add(1, 2))
    println(ffi.decorate("Hello, world!"))
  }
}
