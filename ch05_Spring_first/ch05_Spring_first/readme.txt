ch05_Spring_first:第一个spring项目
实现步骤：
1、新建项目
2、加入依赖
Spring-context :Spring依赖
junit 单元测试
3、开发人员定义类：接口和实现类


4、创建Spring的配置文件，作用声明对象
把对象交给Spring创建和管理
使用<bean>声明对象，一个bean表示一个对象
5、使用容器中的对象ApplicationContext,从容器中根据名称获取对象，
使用getBean("对象名称")