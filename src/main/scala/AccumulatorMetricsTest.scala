


import org.apache.spark.{SparkConf, SparkContext}

object AccumulatorMetricsTest {
  def main(args: Array[String]): Unit = {
   val config = new SparkConf().setMaster("local[*]").setAppName("test1")
  val sc = new SparkContext(config)

    val acc = sc.longAccumulator("my-long-metric")

  // SparkSession


  }

}
