package singleton.demo6;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 枚举单例
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;

        System.out.println(instance == instance1);
    }
}
