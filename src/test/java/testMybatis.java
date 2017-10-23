import com.alibaba.fastjson.JSON;
import com.model.User;
import com.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/10/14 0014.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class testMybatis {

    private static Logger logger = Logger.getLogger(testMybatis.class);
    @Resource
    private IUserService userService = null;
    @Test
    public void test1() {
        User user = userService.selectUser(1);
        logger.info(JSON.toJSONString(user));
    }
}
