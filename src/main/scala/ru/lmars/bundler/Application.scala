package bundler

object Application {
  def main(args: Array[String]): Unit = {
    someFunc("Hello world!")
  }

  def someFunc(str: String): Unit = {
    println("-" + str)
  }
}