public class ProductsChoice {
    public static void main(String[] args) {
        int money = 600;
                if (money<100) {
                    System.out.println("Доширак");
                } else if (money > 500) {
                    System.out.println("Пицца");
                } else {
                    System.out.println("Гамбургер");
                }
    }
}
