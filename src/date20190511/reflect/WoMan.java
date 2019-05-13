package date20190511.reflect;

/**
 * @author weishilei
 */
public class WoMan extends Person {
    // 身高
    public Double height;
    // 体重
    private Double weight;

    public void sayHeight() {
        System.out.println(name + "身高：" + height);
    }

    private void sayWeight() {
        System.out.println(name + "体重：" + weight);
    }
}
