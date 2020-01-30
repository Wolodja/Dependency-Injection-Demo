package guru.springframework.didemo;

import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.springframework"})
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) applicationContext.getBean("myController");

        FakeDataSource fakeDataSource = applicationContext.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource);

    }

}
