/*
  See: http://www.lihaoyi.com/post/uTesttheEssentialTestFrameworkforScala.html
 */

package utest.blog

import utest._

@com.github.ghik.silencer.silent("dead code")
object HelloTests extends TestSuite {

  val tests = Tests {
    "test1" - {
      throw new Exception("test1")
    }
    "test2" - {
      1
    }
    "test3" - {
      val a = List[Byte](1, 2)
      a(10)
    }
  }
}
