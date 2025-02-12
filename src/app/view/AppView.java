package app.view;

import app.entity.Customer;
import java.util.List;
import java.util.Scanner;

public class AppView {
   static Scanner scanner = new Scanner(System.in);
//метод для ввода данных для Customer и создание объекта типа Customer с введёнными параметрами
    public Customer getCustomer() {
        scanner.nextLine();
        System.out.print("Input customer`s name: ");
        String name = scanner.nextLine();
        System.out.print("Input customer`s phone: ");
        String phone = scanner.nextLine();
        return new Customer(name, phone);
    }
//метод для показа всего списка, который принимает параметр в виде списка типа Customer
    public void getDisplay(List<Customer>customers) {
        if(customers.isEmpty()){
            System.out.println("Customers list is empty!");
        }else {
            int count = 1;
            getDisplay("Customer list: ");
            for (Customer customer : customers) {

                System.out.println(count + ") " + customer);
                count++;
            }
        }
    }
    // метод для вывода информации
   public void getDisplay(String output){
        System.out.println(output);
    }
    // метод для выбора операции
    public int getChoice(String choiceMsg){
        System.out.print(choiceMsg);
        return scanner.nextInt();
    }
//метод вывода списка для выбора операции
    public  void getMenu(){
        System.out.println("""
                Choose option:
                1 - add customer
                2 - show list of customers
                3 - exit
                """);
    }
}
