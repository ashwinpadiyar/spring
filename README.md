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
<<<<<<< HEAD
-       XML-based configuration.
-       Interface-based configuration.
-       Annotation-based configuration.

## Autowiring
- Feature in Spring framework that lets Spring IoC containers manage dependencies automatically.
- Primitive types and strings will not be able to extend this feature.
- Wiring: Simply attaching one object to another e.g A -> B, A is dependent on B. Attaching B with A is wiring
- Wiring can be accomplished in two ways.
    - Manual - Providing details in config.xml about dependencies e.g. using attribute <ref bean="abc">.
    - Automatic(Autowiring)
        - XML : Autowiring Modes- No, byName,byType,constructor, autodetect(deprecated since Spring 3)
        - Annotations : @Autowired
=======
  - XML-based configuration.
  - Interface-based configuration.
  - Annotation-based configuration.
>>>>>>> b82a67b286a3a91a41d924226197bcebecdbb977
