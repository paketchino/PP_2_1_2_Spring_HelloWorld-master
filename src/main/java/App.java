import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.Cat;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHello1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHello1.getMessage());

        HelloWorld beanHello2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHello2.getMessage());

        System.out.println(beanHello1.equals(beanHello2));

        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean1.getMessage());
        System.out.println(catBean2.getMessage());
        System.out.println(catBean1.equals(catBean2));
    }
}