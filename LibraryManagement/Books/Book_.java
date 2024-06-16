package Books;

public class Book_ {
    private String name ;
    private String autor;
    private double price;
    private String type;
    private boolean isBorrowed;

    @Override
    public String toString() {


//        return "书名：" + name +"/t作者：" + autor + "/t价钱：" + price + "/t类型：" + type + "本书是否被借出：" + (this.isBorrowed?"没有被借出":"已经被借出");
        return "Books.Book_{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public Book_() {
    }

    public Book_(String name, String autor, double price, String type, boolean isBorrowed) {
        this.name = name;
        this.autor = autor;
        this.price = price;
        this.type = type;
        this.isBorrowed = isBorrowed;
    }
}
