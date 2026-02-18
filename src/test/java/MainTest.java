import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Asserations.assertEquals

public class MainTest {

  @Test
  void ADDTest() {
    assertEquals(21, Main.ADD(15, 6));
  }
}
