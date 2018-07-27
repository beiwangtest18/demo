package JunitTestSuites;

/**
* Date : 2017-11-07
* Owner : lixia.yuan
* @author : lixia.yuan
*/

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import UITestCases.api.ColorAPI;
import UITestCases.games.DeploytoK8s;
import UITestCases.games.WhackaPodHomePage;
import UITestCases.loghandler.FinishTest;

@RunWith(Suite.class)
@SuiteClasses({ 
	WhackaPodHomePage.class,
	DeploytoK8s.class,
	ColorAPI.class,
	FinishTest.class,
	}
)

public class TestSuite {
	
	public  TestSuite() {
        super();	       
    }
	
}
