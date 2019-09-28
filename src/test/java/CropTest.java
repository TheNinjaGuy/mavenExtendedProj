import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CropTest {
	  @BeforeTest(groups= {"regression","full"})
	  public void CompileNDeployCrop() {
		  System.out.println("CompileNDeployCrop");
	  }
	  @Test (groups= {"regression","full"})
	  public void A_RegressionCrop() {
		  System.out.println("RegressionCrop");

	  }
	  @Test (groups= {"regression","full"})
	  public void B_RegressionCrop2() {
		  System.out.println("RegrssionCrop2");
	  }
	  @Test (groups= {"full"})
	  public void C_FullCrop() {
		  System.out.println("FullCrop");
	  }
}
