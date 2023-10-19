package singleton.good;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 懒汉+静态内部类
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);
    }
}
