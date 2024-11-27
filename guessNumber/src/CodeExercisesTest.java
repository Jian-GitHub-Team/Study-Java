import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Jian Qi
 * @date 2024-11-25 PM10:07
 * @PackageName PACKAGE_NAME
 * @ClassName CodeExercisesTest
 * @description
 */
class CodeExercisesTest {

	@Test
	void convertIntToColTitle() {
		CodeExercises codeExercises = new CodeExercises();
		String s = codeExercises.convertIntToColTitle(1);
		System.out.println(s);
	}
}