package Clf4JVectoSpace;

import net.sf.classifier4J.ClassifierException;
import net.sf.classifier4J.vector.HashMapTermVectorStorage;
import net.sf.classifier4J.vector.TermVectorStorage;
import net.sf.classifier4J.vector.VectorClassifier;

public class VectorSpaceClf4J {
	public static void main(String args[]) {
		TermVectorStorage storage = new HashMapTermVectorStorage();
		VectorClassifier vc = new VectorClassifier(storage);
		try {
			vc.teachMatch("category", "hello there is this a long sentence yes it is blah blah hello.");
			double result = vc.classify("category", "hello blah");
			System.out.println(result);
		} catch (ClassifierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
