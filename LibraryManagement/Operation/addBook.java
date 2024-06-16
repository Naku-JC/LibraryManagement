package Operation;

import Books.Book_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class addBook implements IOperation{
    @Override
    public void work(ArrayList list) {
//        Scanner scanner = new Scanner(System.in);
//        FileWriter fileWriter = null;
//        String BooksPath = "C:\\UniversityCourses\\java\\LIbraryManegement\\src\\libraryBooks.txt";
//        try {
//            fileWriter = new FileWriter(BooksPath,true);
//            System.out.println("请输入添加的 书名 :");
//            String BookName = scanner.next();
//            System.out.println("请输入新书的 作者 :");
//            String author = scanner.next();
//            System.out.println("请输入新书的 价格 :");
//            int price = scanner.nextInt();
//            System.out.println("请输入新书的 类型 :");
//            String type = scanner.next();
//
//            String BookInformation = BookName+","+author+","+price+","+type+"\n";
//            fileWriter.write(BookInformation);
//
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                fileWriter.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }




        System.out.println("请输入添加的 书名 :");
        Scanner scanner = new Scanner(System.in);
        String BookName = scanner.next();
        for (Object o : list) {
            Book_ book = (Book_) o;
            if (BookName.equals(book.getName())){
                System.out.println("此书本已存在");
                return;
            }
        }
        System.out.println("请输入新书的 作者 :");
        String author = scanner.next();
        System.out.println("请输入新书的 价格 :");
        int price = scanner.nextInt();
        System.out.println("请输入新书的 类型 :");
        String type = scanner.next();

        Book_ newBook = new Book_(BookName, author, price, type, false);
        list.add(newBook);

//        FileWriter fileWriter = null;
//        String BooksPath = "C:\\UniversityCourses\\java\\LIbraryManegement\\src\\libraryBooks.txt";
//        try {
//            fileWriter = new FileWriter(BooksPath);
//
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                fileWriter.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
        System.out.println("添加成功~");
    }
}
