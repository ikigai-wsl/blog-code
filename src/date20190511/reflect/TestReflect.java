package date20190511.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author weishilei
 */
public class TestReflect {

    public static void main(String[] args) {
        Class clazz = WoMan.class;
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        System.out.println("----------------------");
        fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        System.out.println("----------------------");
        methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}