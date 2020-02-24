#Eureka Server

## 单个Eureka Server
*  `application.properties`中配置

 `
 eureka.client.register-with-eureka=false 
 eureka.client.fetch-registry=false
 `
## Eureka Server高可用
 *  需要在`application-peer1.properties`和`application-peer2.properties`中向对方注册自己；
 *  修改`/etc/hosts`文件
 
 `
 127.0.0.1 peer1    127.0.0.1  peer2
 `
 * 启动互相注册
 
 `java -jar sc-0.0.1.jar --spring.profiles.active=peer1  java -jar sc-0.0.1.jar --spring.profiles.active=peer2
 `
 * 服务提供方修改配置
 
 `eureka.client.service-url.defaultZone=http://peer1:7001/eureka/,http://peer2:7003/eureka/`