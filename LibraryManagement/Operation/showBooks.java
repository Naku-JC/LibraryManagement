package Operation;

import Books.Book_;

import java.util.ArrayList;

public class showBooks implements IOperation {

    @Override
    public void work(ArrayList list) {
        System.out.println("===所有书本展示如下：===");

        for (Object o : list) {
            Book_ book = (Book_)o;
            System.out.println(book);
        }
    }
}
