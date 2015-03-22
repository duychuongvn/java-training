package vn.smartdev.training.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vn.smartdev.training.jpa.entites.Address;
import vn.smartdev.training.jpa.entites.Person;
import vn.smartdev.training.jpa.repositories.PersonRepository;


public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        
        @SuppressWarnings("resource")
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("spring-data.xml");
        
        PersonRepository personRepository = (PersonRepository) context.getBean("personRepository");
        
        Person person = personRepository.findOne(3);
        
        System.out.println();
        System.out.println(person.toString());
        
        Address firstAddress = person.getAddresses().iterator().next();
        
        System.out.println(firstAddress.toString());
        System.out.println();
        firstAddress.setAddress("Java Da nang");
       
        Thread.sleep(1000);
        
        personRepository.save(person);
        Thread.sleep(1000);
        person = personRepository.findOne(3);
        System.out.println();
        firstAddress = person.getAddresses().iterator().next();
        System.out.println(firstAddress.toString());
        
    }
}
