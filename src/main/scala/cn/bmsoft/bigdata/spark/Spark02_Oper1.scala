package cn.bmsoft.bigdata.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark02_Oper1 {
  def main(args: Array[String]): Unit = {

    val config:SparkConf = new SparkConf().setMaster("local[*]").setAppName("WC")
    //创建Spark上下文对象
    val sc = new SparkContext(config)
    //map算子
    val listRDD: RDD[Int] = sc.makeRDD(1 to 10)
   // val mapRDD: RDD[Int] = listRDD.map(x=>x*2)
    val mapRDD: RDD[Int] = listRDD.map(_*2)


    mapRDD.collect().foreach(print)




  }
}
