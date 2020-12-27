import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        boolean bool=true;
        while(bool==true)
        System.out.println("请输入用户名");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        System.out.println("请输入密码");
        String password=sc.next();

        InputStream in = Class.forName("Test").getResourceAsStream("/Users.xlsx");
        ReadExcel MelonZhou=new ReadExcel();
        User users[]=MelonZhou.readExcel(in);
        for(int i=0;i<users.length;i++){
            if(username.equals(users[i].getUsername())&&password.equals(users[i].getPassword())){
                System.out.println("登录成功");
                bool=false;
                break;
            }
            else
                System.out.println("登录失败");
        }
    }
}
