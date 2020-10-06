package myPackage;

import java.util.*;
import org.apache.xmlrpc.*;

public class JavaClient {

	public static void main(String[] args) {
		try {
	         XmlRpcClient serverRef = new XmlRpcClient("http://localhost/"); 
	         Vector params = new Vector();
	         
	         params.addElement(new Integer(2));
	         params.addElement(new Integer(13));

	         
	         int result = (Integer)serverRef.execute("izaanddiana.sum2", params);

	        // int sum = ((Integer) result).intValue();
	         System.out.println("The sum is: "+ result);
	         
	         int result2 = (Integer)serverRef.execute("izaanddiana.mult", params);
	         System.out.println("The mult is: "+ result2);
	         
	         int result3 = (Integer)serverRef.execute("handler2.mult3", params);
	         System.out.println("The mult 3 is: "+ result3);
	         
	      } catch (Exception exception) {
	         System.err.println("JavaClient: " + exception);
	      }

	}

}
