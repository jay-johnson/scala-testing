/** 
  * Setup instructions (assuming java 1.7 is installed)
  * 
  * Ref: http://ask.systutorials.com/319/how-to-install-scala-on-fedora-linux
  *
  * yum install scala
  * export JAVA_HOME=/usr/lib/jvm/java/
  * cd /usr/lib/jvm-exports/
  * ln -s /usr/lib64/java-1.7.0 ./java
  * 
  * confirm this works: scala 
  * 
  * scalac hello.scala
  * scala HelloWorld
  *   Hello, world!
  * 
  */
object HelloWorld {
    def main(args: Array[String]) {
      println("Hello, world!")
    }
  }
