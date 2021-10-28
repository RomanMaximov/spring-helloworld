import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean2.getMessage());
        Cat beanCat = (Cat) applicationContext.getBean("hellocat");
        Cat beanCat2 = (Cat) applicationContext.getBean("hellocat");
        System.out.println(beanCat.getMessage());
        System.out.println(beanCat2.getMessage());
        boolean flag1 = bean.equals(bean2);
        boolean flag2 = beanCat.equals(beanCat2);
        System.out.println(flag1 + "\t" + flag2);
    }
}