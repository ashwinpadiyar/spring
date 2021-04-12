# Spring
This repo is created as part of learning activity.
Spring is a dependency injection framework. 
In Spring, Dependency Injection is a concept where composite objects belonging to a specific class are injected into the Dependent class.


## Spring IoC Container

- It will manage the lifecycle of Spring objects by creating, managing (injecting dependencies), and destroying.
- By passing the bean metadata in config.xml, you can describe the information to manage.
- All classes implementing ApplicationContext interface (AnnotationConfigApplicationContext ,ClassPathXmlApplicationContext,AnnotationConfigWebApplicationContext,FileSystemXMLApplicationContext,ClassPathXmlApplicationContext
 ..) represent IoC container and BeanFactory in Spring Framework.

## Dependency Injection
- Setter Injection
- constructor injection
- There are different ways we can configure these in config.xml e.g. schema based representation, attribute based representation.

## Spring Object LifeCycle Management
- Spring objects require that they use init() and destroy() methods so IoC can handle their lifecycles.
- These can be handled in three different ways:
  - XML-based configuration.
  - Interface-based configuration.
  - Annotation-based configuration.
