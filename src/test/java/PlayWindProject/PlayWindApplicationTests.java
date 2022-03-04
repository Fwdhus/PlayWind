package PlayWindProject;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PlayWindApplicationTests {

	@Mock
	PlayWindApplication playWindApplication;

	@Test
	void contextLoads() {
	}

	@Test
	void testSimpleAddition(){
		PlayWindApplication PW = new PlayWindApplication();
		int actualResult = PW.simpleAddition(100,100);
		Mockito.when(playWindApplication.simpleAddition(100,100)).thenReturn(200);
		assertEquals(actualResult,playWindApplication.simpleAddition(100,100));
	}

	@Test
	void testFailSimpleAddition(){
		PlayWindApplication PW = new PlayWindApplication();
		int actualResult = PW.simpleAddition(1,100);
		Mockito.when(playWindApplication.simpleAddition(100,100)).thenReturn(200);
		assertEquals(actualResult,playWindApplication.simpleAddition(100,100));
	}

}
