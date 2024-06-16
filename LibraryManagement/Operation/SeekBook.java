package Operation;

import Books.Book_;
import java.util.ArrayList;
import java.util.Scanner;

public class SeekBook implements IOperation{

    @Override
    public void work(ArrayList list) {
        System.out.println("请输入你要查找的书名：");
        Scanner scanner = new Scanner(System.in);
        String BookName = scanner.next();
        for (Object o : list) {
            Book_ book = (Book_) o;
            if (BookName.equals(book.getName())){
                System.out.println(book);
                return;
            }
        }
        System.out.println("图书馆内没有这本书~");

    }
}
