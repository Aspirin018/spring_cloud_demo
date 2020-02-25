#Spring Cloud学习

#### Spring Cloud Eureka
*  Eureka server 独立模块作为服务注册中心，可实现高可用
*  Eureka Client 内嵌于auction-service模块，作为服务提供者，可创建多个实例
*  Spring Cloud Ribbon 独立模块ribbon-consumer模块，作为服务调用者，可实现负载均衡
*  Spring Cloud Hystrix 在模块ribbon-consumer中添加实现容错保护
*  Spring Cloud Feign 独立模块feign-consumer，实现对服务调用，带参绑定调用，使用继承特性调用，Ribbon和Hystrix配置等
*  Spring Cloud Zuul 独立模块api-gateway, 实现服务路由配置，本地跳转，过滤器以提供网关服务
*  Config server 配置于独立的git项目, Config client独立模块实现分布式配置中心