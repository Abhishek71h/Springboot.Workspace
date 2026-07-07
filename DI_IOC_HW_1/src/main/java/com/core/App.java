package com.core;
import com.core.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main(String[] args)
    {
        ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");

        UserController controller = context.getBean("userController", UserController.class);

        controller.createUser("Abhishek");
    }
}

/*
Question : 
"In a web application, a UserService needs to be injected into a UserController. 
How would you design this using Spring dependency injection with XML configuration? 
Also, suppose you have two implementations of a NotificationService (EmailNotificationService and SMSNotificationService).
How can you choose which implementation to inject dynamically?"

Answer :
Spring Dependency Injection is used to reduce tight coupling between classes.
In this example, UserController depends on UserService, and UserServiceImpl depends on the NotificationService interface instead of a specific implementation.
These dependencies are configured in applicationContext.xml using <bean> and <property> tags.
Spring creates the objects and injects the required dependencies at runtime.
Since EmailNotificationService and SMSNotificationService both implement the same NotificationService interface,
we can dynamically switch between them by simply changing the ref attribute in the XML (emailNotification or smsNotification) without modifying or recompiling the Java code.
This demonstrates the Inversion of Control (IoC) and Dependency Injection (DI) principles, making the application loosely coupled, flexible, and easy to maintain.
*/
