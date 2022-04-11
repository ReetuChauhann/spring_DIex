package com.reetu.spring_DIex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reetu.beans.Author;
import com.reetu.beans.JavaBook;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml");
    	JavaBook b=ctx.getBean("book",JavaBook.class);
    	System.out.println(b.getName());
    	System.out.println(b.getPrice());
    	Author a=b.getAuthor();
    	System.out.println(a.getName());
    	System.out.println(a.getAge());
    	System.out.println(a.getPhone());
    }
}
