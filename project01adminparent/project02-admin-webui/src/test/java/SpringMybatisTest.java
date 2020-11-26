import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.IUserService;

import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-mybatis.xml" })
public class SpringMybatisTest {

    @Autowired
    private IUserService iUserService;
    @Test
    public void test() throws SQLException {

        System.out.println(iUserService.getuser("1"));
    }

}
