package miu.edu.lab01;

import miu.edu.lab01.sub.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab01Application{

	public static void main(String[] args) throws NotFoundBeanException, ClassNotFoundException {
		SpringApplication.run(Lab01Application.class, args);
		MyInjector injector = new MyInjector();
		Test test = (Test) injector.getBean(Test.class);
		test.print();
		test.display();
	}
}
