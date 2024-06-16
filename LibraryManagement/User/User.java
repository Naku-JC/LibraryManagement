package User;

import Operation.IOperation;


import java.util.ArrayList;

public abstract class User {
    String name;
    IOperation[] operations;
    public void doOperation (int choice,ArrayList booklist){
        this.operations[choice].work(booklist);
    }
}
