public class Human03 {

    // static変数
    static public int humanCount = 0;
    public String name;
    public static final String GREETING = "こんにちは";

    public Human03(String name) {
        this.name = name;
        // インスタンス生成ごとにstatic変数をインクリメント
        Human03.humanCount++;
    }

    static public void staticMethodPrint() {
        // static変数のhumanCountを表示
        System.out.println("人の数は" + Human03.humanCount);
    }

    public void instanceMethodPrint() {
        // インスタンス変数のnameを表示
        System.out.println("名前は" + name);
        // static変数のhumanCountを表示
        System.out.println("人の数は" + Human03.humanCount);
    }
}
