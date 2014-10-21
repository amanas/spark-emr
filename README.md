
# Spark Hello World on Emr 

## Requirements

1.  a minimal cluster 
    *   1 m1.medium master 
    *   and 1 m1.medium core     
2.  with hadoop 2.4.0 installed      
3.  and spark installed by bootstraping s3://support.elasticmapreduce/spark/install-spark

## Instructions to run the Spark Emr app

1. package this project with "sbt clean package"           
2. ssh the cluster      
3. copy to the cluster the "run" script and make it executable         
4. copy to the cluster the packaged jar and rename it to "the.jar"     
5. execute nex command in the cluster:              
    ./run --class SparkEmr the.jar file:/home/hadoop/spark/README.md
    
    
    
###And that's it!