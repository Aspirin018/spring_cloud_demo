#Auction Service

## 单个Auction Service
*  直接运行，服务端口为7002

 `
 eureka.client.register-with-eureka=false 
 eureka.client.fetch-registry=false
 `
## 多个Auction Service实例
 * 启动两个实例
 
 `java -jar sc-0.0.1-SNAPSHOT.jar --server.port=8081
  java -jar sc-0.0.1-SNAPSHOT.jar --server.port=8082
 `