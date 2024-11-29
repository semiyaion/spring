import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import test.configtext.Config1;
import test.service.Calculator;
import test.service.impl.CalculatorImpl;

@SpringJUnitConfig(value = Config1.class)
public class Test001 {
    @Autowired
    private Calculator calculator;
  @Test
    public void test(){
      int add = calculator.add(1, 1);
      System.out.println(add);
  }


}