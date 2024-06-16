package Operation;

import java.util.ArrayList;
import java.util.Scanner;

public class exitSystem implements IOperation{
    @Override
    public void work(ArrayList list) {
        System.out.println("是否退出系统？");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        if (choice.equals("y")){
            System.exit(0);
        }
    }
}
