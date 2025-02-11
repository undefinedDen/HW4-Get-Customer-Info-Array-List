package app.controller;

import app.customer.Customer;
import app.util.AppConstants;
import app.view.AppView;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;


public class AppController {
    static AppView view = new AppView();
    //создаём список типа Customer
    static List<Customer> customers = new ArrayList<>();

    public static void getOutput() {

        view.getDisplay(AppConstants.START_MSG);
        //выводит меню
        view.getMenu();
        int choice = 0;

        try {
            while (choice != 3) {
                //предлагаем выбрать из списка одну операцию
                choice = view.getChoice(AppConstants.CHOICE_MSG);
                switch (choice) {
                    //добавляем в список объект, при помощи add, типа Customer
                    case 1 -> customers.add(view.getCustomer());
                    //показывает все объекты в списке
                    case 2 -> view.getDisplay(customers);
                    //выводит финальное сообщение и все объекты которы находятся в списке
                    case 3 -> {
                        view.getDisplay(AppConstants.FINAL_MSG + ": ");
                        view.getDisplay(customers);
                    }
                }
                view.getDisplay("----------------------------------------------------------------");
            }
            //обработка возможных ошибок ввода, по сути для choice
        } catch (InputMismatchException e) {
            System.out.println("Error - invalid input - " + e.getMessage());
        }


    }
}
