# 说明
## 1、cloud-api-commons
```properties
1-存放公用模块的代码
```
## 2、cloud-provider-payment
```properties
cloud-provider-payment8001:8001端口号对应的服务提供者，注册到Eureka
cloud-provider-payment8002:8002端口号对应的服务提供者，注册到Eureka

cloud-provider-payment8004:8004端口号对应的服务提供者，注册到Zookeeper
cloud-provider-payment8005:8005端口号对应的服务提供者，注册到Zookeeper

cloud-provider-payment8006:8006端口号对应的服务提供者，注册到Consul
cloud-provider-payment8007:8007端口号对应的服务提供者，注册到Consul
cloud-provider-payment8008:8008端口号对应的服务提供者，注册到Eureka,加入hystrix
cloud-provider-payment8009:8009端口号对应的服务提供者，注册到Eureka,配合使用zuul网关
cloud-provider-payment8010:8010端口号对应的服务提供者，注册到Eureka,配合使用zuul网关,SMS服务

cloud-provider-payment8011:8011端口号对应的服务提供者，注册到Eureka,配合使用geteway网关使用
cloud-provider-payment8012:8012端口号对应的服务提供者，注册到Eureka,配合使用geteway网关使用
cloud-provider-payment8012:8012端口号对应的服务提供者，注册到Eureka,融合了Sleuth链路监控展现

```

## 3、cloud-consumer-order
```properties
cloud-consumer-order80:80对应的服务消费者，注册到Eureka
cloud-consumer-zk-order80:80对应的服务消费者，注册到Zookeeper
cloud-consumer-consul-order80:80对应的服务消费者，注册到consul
cloud-consumer-ribboon-order80:80对应的服务消费者，注册到Eureka。演示Ribbon的效果
cloud-consumer-feign-order80:80对应的服务消费者，注册到Eureka.演示Feign的调用
cloud-consumer-hystrix-order80:80对应的服务消费者，注册到Eureka.演示加入了Hystrix
cloud-consumer-zipkin-order80:80对应的服务消费者，注册到Euraka，演示加入了Sleuth中的Zipkin

```

## 4、网关服务
```properties
cloud-zuul-gateway9527:zuul网关服务,介于消费者和服务提供者之间。客户的请求会优先发到网关，然后由网关转发到具体的服务实例
cloud-gateway-gateway9527:gateway网关服务
```


## 4、cloud-eureka-server
```properties
cloud-eureka-server7001:7001端口号对应的Eureka注册中心服务
cloud-eureka-server7002:7002端口号对应的Eureka注册中心服务
```

## 5、SpringCloud 配置中心
```properties
cloud-config-center-3344:springcloud Config的服务端
cloud-config-center-3355:使用springCloud Config的客户端
cloud-config-center-3366:使用springCloud Config的客户端
```

## 6、springcloud stream（消息队列）
```properties
cloud-stream-rabbitmq-provider8801:springcloud stream 消息生产者
cloud-stream-rabbitmq-conosumer8802:springcloud stream 消息消费者
cloud-stream-rabbitmq-conosumer8803:springcloud stream 消息消费者
```


## 7 SpringCloud Alibaba
```properties
cloudalibaba-provider-payment9001:使用Nacos注册中心的服务提供者
cloudalibaba-provider-payment9002:使用Nacos注册中心的服务提供者，和9001形成负载均衡
cloudalibab-consumer-nacos-order84:使用Nacos注册中心的服务消费者
cloudalibaba-config-nacos-client3377:使用nacos做配置中心

cloudalibaba-sentinel-service8401:使用sentinel的测试案例——1
cloudalibaba-sentinel-service8402:使用sentinel的测试案例——2
cloudalibaba-sentinel-service8403:sentinel的持久化，将配置信息放入Nacos中存放

cloudalibaba-provider-payment9003:sentinel整合ribbon+openFeign+fallback（Nacos注册中心）
cloudalibaba-provider-payment9004:sentinel整合ribbon+openFeign+fallback
cloudalibab-consumer-nacos-order84:消费者，配置上面的整合验证

seata-order-service2001:订单服务，分布式事务（seata）
seata-storage-service2002:库存服务，分布式事务（seata）
seata-account-service2003:账户信息服务，分布式事务（seata）
```

## Other:
```properties
腾讯云服务器地址:175.178.69.88
Hystrix的监控器服务：cloud-consumer-hystrix-dashboard9001

总结博客：
https://blog.csdn.net/u011863024/article/details/114298270
Eureka调优：https://blog.csdn.net/wo18237095579/article/details/83276352

```


## 补充：
```properties
1、Nginx的IP黑白名单+redis动态调整
2、Getway网关配置服务限流
```

