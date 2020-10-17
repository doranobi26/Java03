public class ClassMethod02 {
    public static void main(String[] args) {
        Human02 apple = new Human02();

        System.out.println("私の名前は、" + apple.name + "です。");
        String profile = apple.getProfile();
        System.out.println(profile + "です。");

        apple.greet("田辺");
        apple.greet(null);
    }
}