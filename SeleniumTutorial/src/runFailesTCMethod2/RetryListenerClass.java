package runFailesTCMethod2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

public class RetryListenerClass implements IAnnotationTransformer{
	public void transform(ITestAnnotation annotation, Class tesClass, 

			   Constructor testConstructor, Method  testMethod) {

			  annotation.setRetryAnalyzer(RetryAnalyzerTest.class);
			 }
				
}
