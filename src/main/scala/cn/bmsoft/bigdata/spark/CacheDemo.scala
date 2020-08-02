package cn.bmsoft.bigdata.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object CacheDemo {


  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setAppName("test1").setMaster("local[*]");
    val sc = new SparkContext(conf)

    val rdd1: RDD[String] = sc.parallelize(Array("ab", "bc"))
    val rdd2: RDD[String] = rdd1.flatMap(x => {
      println("flatMap...")
      x.split("")
    })
    rdd2.cache();
    val rdd3: RDD[(String, Int)] = rdd2.map(x => {
      (x, 1)
    })
    rdd3.collect().foreach(println);
    println("-----------")
    rdd3.collect.foreach(println)





  }

}
