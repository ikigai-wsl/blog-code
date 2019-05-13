package date20190511.reflect;

/**
 * @author weishilei
 */
public class Man extends Person {
    // 体重
    public Double weight;
    // 身高
    private Double height;

    public void sayWeight() {
        System.out.println(name + "体重：" + weight);
    }

    private void sayHeight() {
        System.out.println(name + "身高：" + height);
    }
}
