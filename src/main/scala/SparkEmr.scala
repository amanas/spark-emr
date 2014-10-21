import org.apache.spark.SparkContext
import org.apache.spark.SparkConf


// WORKING FINE
//
// /home/hadoop/spark/bin/spark-shell
// --master yarn-client
// --num-executors 1
// --driver-memory 512m
// --executor-memory 512m
// --executor-cores 1
//
// val input = "hdfs:///user/hadoop/tmp/README.md"
// val logData = sc.textFile(input, 2).cache()
// val numAs = logData.filter(line => line.contains("a")).count()
// val numBs = logData.filter(line => line.contains("b")).count()
// println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))


object SparkEmr {

  def main(args: Array[String]) {

    val conf = new SparkConf().setAppName("Spark Emr")
    val sc = new SparkContext(conf)

    val logData = sc.textFile(args(0), 2).cache()

    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))

    sc.stop()

  }
}


