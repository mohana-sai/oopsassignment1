package oopspackage

class person (val name: String, val age: Int) extends Ordered[person]{

    def compare(that: person): Int ={

      if(that.name == this.name) this.age.compare(that.age)

      else this.name.compare(that.name)
    }
}

object person {

  def main(args: Array[String]): Unit = {

    val personOne = new person("TestAgain", 24)
    val personTwo = new person("Test", 25)
    println(personOne<personTwo)
    println(personOne>personTwo)
  }
}
