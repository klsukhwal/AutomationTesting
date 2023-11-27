package Assignment;

import java.lang.annotation.Annotation;

import com.app.junit.MetaAnnotation;

public class Myannotationsdemo implements MetaAnnotation {
	
	
	
	@MetaAnnotation
	public void testannotation() {
		
		System.out.println("This method is executed by my annotation");
	}

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

}
