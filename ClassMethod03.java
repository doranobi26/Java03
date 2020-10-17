public class ClassMethod03 {
    public static void main(String[] args) {
        // Human03インスタンスを生成すると、コンストラクタ内の処理が実行される
        Human03 erika = new Human03("生田絵梨花");

        // 静的メンバーは、インスタンス生成せずに直接使用できる
        Human03.staticMethodPrint();

        // staticなクラス定数もインスタンスを生成せずに参照できる
        System.out.println(Human03.GREETING);

        erika.instanceMethodPrint();
    }
}