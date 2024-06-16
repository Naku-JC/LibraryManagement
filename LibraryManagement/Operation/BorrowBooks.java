package Operation;

import Books.Book_;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * creats 2024-06-19:46 今天又是学习Java的一天~
 */
public class BorrowBooks implements IOperation{

    @Override
    public void work(ArrayList list) {
        System.out.println("请输入您需要借阅的 书名 ：");
        Scanner scanner = new Scanner(System.in);
        String BookName = scanner.next();
        for (Object o : list) {
            Book_ book_ =(Book_) o;
            if (book_.getName().equals(BookName) ){
                BorrowB(book_);
                return;
            }
        }
        System.out.println("未找到该本书的数据~");

    }
    private void BorrowB (Book_ book){
        if (book.isBorrowed()) {
            //true
            System.out.println("这本书已经被借阅~");
        }else {
            //false
            book.setBorrowed(true);
            System.out.println("ok~ 已被您借阅");
        }
    }
}
