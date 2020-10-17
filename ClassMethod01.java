public class ClassMethod01 {
    public static void main(String[] args) {
        Human01 apple = new Human01(); //Human01クラスのインスタンスを生成
        System.out.println("名前は" + apple.name + "で、年齢は" + apple.age + "です。");

        Human01 summer = new Human01("秋元真夏", 27); //Human01クラスのインスタンスを生成
        System.out.println("名前は" + summer.name + "で、年齢は" + summer.age + "です。乃木坂４６のキャプテンです。");
    }
}