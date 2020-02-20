import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/2/29 10:40
 * @Version 1.0
 **/
class UserError extends Exception{
    public UserError(String message){
        super(message);
    }
}
class passwordError extends Exception{
    public passwordError(String message){
        super(message);
    }
}
public class Test {
    public static String userName = "admin";
    public static String password = "123456";
    public static void login(String userName,String password) throws UserError,passwordError{
        if(!Test.userName.equals(userName)){
            //处理用户名错误
            throw new UserError("用户名错误");
        }
        if(!Test.password.equals(password)){
            //处理密码错误
            throw new passwordError("密码错误");
        }
        System.out.println("登陆成功");
    }
    public static void main(String[] args){
        try{
            login("admin","123456");
        }catch (UserError userError){
            userError.printStackTrace();
        }catch (passwordError passwordError){
            passwordError.printStackTrace();
        }
    }
}
