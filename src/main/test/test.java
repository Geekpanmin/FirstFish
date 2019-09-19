import com.fish.mapper.UserMapper;
import com.fish.pojo.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * @create 2019-09-18  20:05
 */
public class test {

    @Autowired
    public UserMapper mapper;

    @Test
    public void select(){
        User user = new User();
        user.setUserId(2);
        user.setUserName("my");
        user.setUserPassword("222");
        user.setUserType(2);
        //鬼地方鬼地方
        User user1 = mapper.selectByPrimaryKey(1);
        System.out.println(user1);
        //System.out.println(mapper.selectByPrimaryKey(1));
    }
}
