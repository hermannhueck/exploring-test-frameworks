package mrpowers

/*
  See:
  https://mungingdata.com/scala/testing-munit/
  https://github.com/MrPowers/munit-example
 */
object Calculator {

  def addNumbers(n1: Int, n2: Int): Int = {
    n1 + n2
  }

  def crankyMethod(): String = {
    throw new java.lang.IllegalArgumentException()
  }

  def crankyKong(): String = {
    throw new java.lang.Exception("DK is my grandchild")
  }

}
