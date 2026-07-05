package com.core;
import com.core.concepts.Car;
import com.core.concepts.Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{
    public static void main(String[] args)
    {
        System.out.println("Project Started");
        System.out.println("Starting point");

        //Car car = new Car();
        //Engine engine = new Engine();
        //Car car = new Car(engine);
        //car.start();

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Engine engine1 = container.getBean("engine1", Engine.class);
        engine1.startEngine();

        System.out.println("-------------------");

        Car car = container.getBean("car", Car.class);
        car.start();
    }
}

/*
The control of creating and managing object is transferred to a
container (Spring IOC Container).
It allows loose coupling between objects.
It is called a design principle called Spring IOC Container.
 */