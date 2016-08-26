import org.apache.spark.{SparkContext, SparkConf}

/**
  * Created by syedahmed on 26/08/2016.
  */
object MainApplication {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("MainApplication").setMaster("local")
    val sc = SparkContext.getOrCreate(conf)
    println(sc.version)
  }
}
