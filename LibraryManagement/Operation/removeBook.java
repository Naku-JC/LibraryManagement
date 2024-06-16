package Operation;

import Books.Book_;

import java.util.ArrayList;
import java.util.Scanner;

public class removeBook implements IOperation{

    @Override
    public void work(ArrayList list) {

        System.out.println("请输入需要删除书本的 书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (Object o : list) {
            Book_ book = (Book_) o;
            if (name.equals(book.getName())){
                int index = list.indexOf(book);

                System.out.println("是否(y/n)要删除"+book);
                String choice = scanner.next();
                if (choice.equals("y")){
                    //这里一开始用choice == “y” 会发生错误 不会运行下面的语句
                    //看了很久 突然发现choice指向的是堆  而“y”指向的是常量池
                    //两个不相等  所以不执行if下面的语句 ~~~~~~~
                    list.remove(index);
                    System.out.println("删除成功~");
                    return;
                }
            }
        }
        System.out.println("图书馆内没有这本书");
    }
}
