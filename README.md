# ms-sdmzm

针对springboot、dubbo、mybatis、zookeeper、mariadb集成的demo代码。


# 准备
1、服务器一台，也可用本机代替
2、服务器需要安装java环境
3、服务器需要安装mariadb、tomcat、zookeeper中间件，其中zookeeper采用standalone模式即可
4、需要通过tomcat部署dubbo-admin管理控制台，用于对微服务进行管治及测试，这里需要注意的是dubbo-admin运行的jdk版本要低于1.8
5、eclipse或者idea的java开发环境一套，开发环境中需要准备好maven集成插件，确保外网连接，其中demo采用jdk1.8进行编译。

ps：以上内容网上资料丰富，不再赘述。

# 集成简单介绍
demo采用了maven进行集成，主要分为三个模块

common模块：主要定义了entity和业务接口，用于统一消费方和提供方的接口，在实际开发过程中，消费方和提供方一半都是两个不同的项目组，所以该模块一般是由提供方进行维护，消费方进行引用，这样做的好处在于可以避免交流上的偏差，保持了接口的一致性和稳定性

provider模块：主要负责业务逻辑的实现，采用springboot的方式进行启动，数据库集成均采用了较为简单的自动配置，后续可以根据需要进行调整

consumer模块：主要负责消费方的接口调用，调用方式比较多元，该demo中仅采用便于测试的模式进行调用。


