import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;

import jdk.nashorn.internal.runtime.regexp.joni.MatcherFactory;

public class Hauptprogramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] zahlenmenge = {44,56,4,23,34,5,7,9,123,78};
		double summe = 0;
		
		for(int x = 0; x < zahlenmenge.length; x++) {
			summe += zahlenmenge[x];
		}
		
		System.out.println(summe);
	}

}
