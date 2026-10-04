package demo;


import demo.controller.Controller;
import demo.model.Apple;
import demo.model.Item;
import demo.repository.CapacityExceededException;
import demo.repository.IRepository;
import demo.repository.Repository;
import demo.view.Console;
//java.lang.System

public class ItemsApp {

    private void m(){}

    public static void main(String arr[]){

        Item a = new Apple(0.3f, "Gala");//hardcodat
        //preluare de parametri din linia de comanda array de intregi sau stringuri
        //ItemsApp app =new ItemsApp();
        //app.m();

        IRepository repo = new Repository();
        try {
            repo.add(a);
        } catch (CapacityExceededException e) {
            System.out.println(e);
        }

        Controller ctrl = new Controller (repo);
        ctrl.add(a);

        Console console = new Console(ctrl);

        console.run();

        int i = 7;
        double d = i; // implicit
        int j = (int)d; //explicit (in Java avem downcast explicit si upcast implicit)
        System.out.println(i+d);
    }
}