import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

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
                        for (int i = 0; i < products.size(); i++) {
                            System.out.println("Итого в списке покупок: " + products.get(i));
                        }
                        break;
                    case 2:
                        //System.out.println("Список покупок:");
                        //for (int i = 0; i < products.size(); i++) {
                            //System.out.println((i + 1) + " " + products.get(i));
                       // }
                        products.forEach(new Consumer<String>() {
                            @Override
                            public void accept(String s) {
                                System.out.println(s);
                            }
                        });
                        break;
                    case 3:
                        //System.out.println("Список покупок:");
                        //for (int i = 0; i < products.size(); i++) {
                         //   System.out.println((i + 1) + " " + products.get(i));
                      // }
                        products.forEach(new Consumer<String>() {
                            @Override
                            public void accept(String s) {
                                System.out.println(s);
                            }
                        });
                        System.out.println("Какую хотите удалить? Введите номер или название");
                        String inputMove3 = scanner.nextLine();
                        try {
                            int productNumber = Integer.parseInt(inputMove3) - 1;
                            products.remove(productNumber);
                            System.out.println("Покупка " + (productNumber + 1) + " удалена, список покупок: ");
                            for (int i = 0; i < products.size(); i++) {
                                System.out.println((i + 1) + " " + products.get(i));
                            }

                        } catch (NumberFormatException e) {
                            products.remove(inputMove3);
                            System.out.println("Покупка " + inputMove3 + " удалена, список покупок: ");
                            for (int i = 0; i < products.size(); i++) {
                                System.out.println((i + 1) + " " + products.get(i));
                            }
                        }
                        break;


                }
            } catch (NumberFormatException e) {
                if ("end".equals(input)) {
                    break;
                }

            }

        }
       // private static void printProducts() {
       //System.out.println("Список покупок:");
       // for (int i = 0; i < products.size(); i++) {
        //System.out.println((i + 1) + " " + products.get(i));
     //     }
      //   }

    }

}