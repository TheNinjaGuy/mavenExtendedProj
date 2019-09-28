
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClarityTest {
	  @BeforeTest(groups= {"sanity","regression","full"})
	  public void CompileNDeployClarity() {
		  System.out.println("CompileNDeployClarity");
	  }
	  @Test (groups= {"sanity","regression","full"})
	  public void A_SanityClarity() {
		  System.out.println("SanityClarity");

	  }
	  @Test (groups= {"regression","full"})
	  public void B_RegressionClarity() {
		  System.out.println("RegressionClarity");
	  }
	  @Test (groups= {"full"})
	  public void C_FullClarity() {
		  System.out.println("FullClarity");
	  }
}
