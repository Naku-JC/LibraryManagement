package Operation;

import Books.Book_;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * creats 2024-06-20:32 今天又是学习Java的一天~
 */
public class ReturnBook implements IOperation{
    @Override
    public void work(ArrayList list) {
        System.out.println("请输入您需要归还的 书籍 ：");
        Scanner scanner = new Scanner(System.in);
        String BookName = scanner.next();
        for (Object o : list) {
            Book_ book = (Book_) o;
            if (book.getName().equals(BookName)) {

                ReturnB(book);

                return;
            }
        }

    }

    private void ReturnB (Book_ book){
        if (!(book.isBorrowed())) {
            System.out.println("这本没有被借出 请确定信息无误~");
        }else {
            book.setBorrowed(false);
            System.out.println("成功归还~");
        }
    }
}
