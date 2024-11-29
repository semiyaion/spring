import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import testdemo.JavaConfig;
import testdemo.dao.StuDao;
import testdemo.service.StuService;

@SpringJUnitConfig(JavaConfig.class)
public class Ts {
    @Autowired
    private StuService stuService;
    @Test
    public void test01(){
        stuService.chageinformation();
    }
}
