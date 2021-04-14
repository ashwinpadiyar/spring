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

## Autowiring
- Feature in Spring framework that lets Spring IoC containers manage dependencies automatically.
- Primitive types and strings will not be able to extend this feature.
- Wiring: Simply attaching one object to another e.g A -> B, A is dependent on B. Attaching B with A is wiring
- Wiring can be accomplished in two ways.
    - Manual - Providing details in config.xml about dependencies e.g. using attribute <ref bean="abc">.
    - Automatic(Autowiring)
        - XML : Autowiring Modes- No, byName,byType,constructor, autodetect(deprecated since Spring 3)
        - Annotations : @Autowired,  This annotation can be used with method or property or constructor.

## Qualifier Annotation
- Where there is a conflict between the reference type and which bean is to be autowired, we can use the @Qualifier annotation to specify the instance name for autowiring.

## Sterotype Annotations
- Until now bean metadata was set in the config XML file for the spring container so that bean objects could be created for use by the spring framework. 
- Also, we have the option of using annotations(Stereotype annotation). 
    - We can use @component with bean classes.
    - <context:component-scan base-package="<bean class package value>">
    - This reference will be the same as the bean class name in the camelcase. 
    - e.g @component Student { . . . } , Student **student** = new Student

## Spring Bean Scope
- Singleton: We can notify this Spring IoC container that we require the object of this type.
    > As a **default**, the spring container will always return the same object that has already been created.
- Prototype: We can notify this Spring IoC container that we require the object of this type.
    > An object of a single bean has multiple instances according to the number of requests for the bean.
- request: This will be used in web application scenario
- session: This will be used in web application scenario
- globalsession: This will be used in web application scenario
 
##### How to configure a bean scope?
> <bean class=" " name="" **scope=""** />
- or
>  @Component
>  @scope("")
> Class Student{ . . .}
- scope attribute will always be used only with @component annotation and with Bean attribute

## Spring Expression Language
- SpEL support parsing and executing expression with the help of @Value annotations.
> e.g. @Value("#{expression}")
-  Expression can be:
    - Classes, Variables, Methods, Constructors and objects.
    - Symbols like char,numerics,operators,keywords and special symbols which return a value.
- Few valid expressions in spring:
>  @Value("#{11+22}").
> @Value("#{8>6?88:55}").