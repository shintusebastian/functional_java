import io.pragra.exception.InvalidUserNameException;

public class UserService {
    public void createUser(String name) throws InvalidUserNameException,RuntimeException{
        if(name==null){
            throw new InvalidUserNameException();// this will show an error if the invalid user-name class is extending from Exception.
           // throw new RuntimeException();// this will not show any error.
        }
    }
}
