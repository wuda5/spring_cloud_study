1.spring cloud 正式学习前 的 第一个 自己通过 【restTemplate】 完成 两个系统服务间的 通信
user --> power 
先关注这两个服务，没有用任务其他外部框架，
2. 采用自己配置tomcat类 不写xml形式

微服务第二节：
3.模拟power 集群，并用nginx 做负载均衡访问集群服务，
引出问题--> 23 min nginx 无法发现所管理代理的集群服务有 down 机的，造成访问到这台机器的请求会卡住
所以 最好应该有个单独的服务来管理 集群power, 之间由心跳定时发送判定服务 是否down（时间内都没有收到心跳就将此服务剔除） -->
这就是引出了 注册中心！

4.spirng cloud 的版本问题，打包发布的坑（已更新就是一个大更新），34 min, 53 错误现象

----------- 这里后，我打了个tag 标签 cloud_simple_demo --------考虑后面需要回退，或者单独拉取此上的代码

eureka:
1. 导入依赖的坑 10 min，百度的过时，和官网参照不同一般，官网是：spring-cloud-starter-netflix-eureka-server
其实这个和自己选择的 cloud的版本有关系！--有相应对应的eureka 的依赖每个版本不同
--》因为 eureka 本身不是属于 cloud 的，所以需要单独加入依赖

2.先关闭     enable-self-preservation: false  #关闭自我保护机制
          eviction-interval-timer-in-ms: 4000 #设置清理间隔（单位：毫秒 默认是60*1000）
          
 3.(对于注册中心加入的这些服务来说都是其连接的 客户端，注册中心 eureka 服务才是 服务端--> 那里才需要导入 eureka 【服务端】的jar依赖)
  --》具体就是在 非注册中心服务 的实际 服务里面 所配置和注解都是 用【客户端】client 来使用
  
 4.cap 52min
 