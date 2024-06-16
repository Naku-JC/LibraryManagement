import Books.Book_;

import java.awt.print.Book;
import java.io.*;
import java.util.ArrayList;

public class Booklist {
    private ArrayList list =new ArrayList();

    public Booklist() {
//        this.list.add(new Book_("西游记","吴承恩",23,"神话小说",false));
//        this.list.add(new Book_("三国演义","罗贯中",12,"历史军事",false));
//        this.list.add(new Book_("红楼梦","施耐庵",33,"小说",true));

        String BooksPath = "C:\\UniversityCourses\\java\\LIbraryManegement\\src\\libraryBooks.txt";
        BufferedReader bufferedReader = null;
        String line = " ";
        try {
            bufferedReader = new BufferedReader(new FileReader(BooksPath));
            while ((line = bufferedReader.readLine()) != null){
                String []booksInformation = line.split(",");
                Book_ book = new Book_();
                book.setName(booksInformation[0]);
                book.setAutor(booksInformation[1]);
                book.setPrice(Double.parseDouble(booksInformation[2]));
                book.setType(booksInformation[3]);
                book.setBorrowed(Boolean.parseBoolean(booksInformation[4]));
                this.list.add(book);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
    public void updateInformation(){
        FileWriter fileWriter = null;
        String BooksPath = "C:\\UniversityCourses\\java\\LIbraryManegement\\src\\libraryBooks.txt";
        try {
            fileWriter = new FileWriter(BooksPath);
            for (Object object : list) {
                Book_ book = (Book_) object;
                String bookname = book.getName();
                String bookauthor = book.getAutor();
                double bookprice = book.getPrice();
                String booktype = book.getType();
                boolean bookBorrow = book.isBorrowed();
                String bookInformation = bookname+","+bookauthor+","+bookprice+","+booktype+","+bookBorrow+"\n";

                fileWriter.write(bookInformation);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }



    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }
}
