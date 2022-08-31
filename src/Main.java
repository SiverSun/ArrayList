import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static <products> void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<String> products = new ArrayList<>();
        while (true) {
            System.out.println("Выберите операцию: 1 Добавить, 2 Показать, 3 Удалить или введите end");
            String input = scanner.nextLine();
            try {
                int num = Integer.parseInt(input);

                switch (num) {
                    case 1:
                        System.out.println("Какую покупку вы хотите добавить?");
                        String inputMove = scanner.nextLine();
                        products.add(inputMove);
                        printProducts(products);
                        break;
                    case 2:
                        printProducts(products);
                        break;
                    case 3:
                        printProducts(products);
                        System.out.println("Какую хотите удалить? Введите номер или название");
                        String inputMove3 = scanner.nextLine();
                        try {
                            int productNumber = Integer.parseInt(inputMove3) - 1;
                            products.remove(productNumber);
                            System.out.println("Покупка " + (productNumber + 1) + " удалена");
                            printProducts(products);

                        } catch (NumberFormatException e) {
                            products.remove(inputMove3);
                            System.out.println("Покупка " + inputMove3 + " удалена");
                            printProducts(products);
                        }
                        break;


                }
            } catch (NumberFormatException e) {
                if ("end".equals(input)) {
                    break;
                }

            }

        }


    }

    public static void printProducts(List<String> products) {
        System.out.println("Список покупок:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + " " + products.get(i));
        }
    }
}
