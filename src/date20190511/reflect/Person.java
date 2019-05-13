package date20190511.reflect;

/**
 * @author weishilei
 */
public class Person {
    // 名字
    public String name;
    // 性别
    private String sex;

    public void sayHi() {
        System.out.println(name + "说：你好！");
    }

    private void saySex() {
        System.out.println(name + "是：" + sex);
    }
}