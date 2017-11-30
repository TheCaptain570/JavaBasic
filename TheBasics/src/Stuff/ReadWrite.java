package Stuff;

import java.io.File;

public class ReadWrite {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	      public static void register() {
	            String workingDirectory = System.getProperty("user.dir");
	            File file = new File(workingDirectory + "/src/customers.database");

	            try {
	                  FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
	                  BufferedWriter out = new BufferedWriter(fw);
	                  out.write(cust.cID + "," + cust.fName + "," + cust.mName + ","
	                              + cust.lName + "," + cust.address + "," + cust.postcode
	                              + "," + cust.email + "," + cust.mobile + ","
	                              + cust.password);
	                  out.newLine();
	                  out.close();
	            } catch (IOException e) {
	                  e.printStackTrace();
	            }
	      }

	      public static boolean login(String id, String password) {
	            String workingDirectory = System.getProperty("user.dir");
	            File file = new File(workingDirectory + "/src/customers.database");
	            List<String> list = new ArrayList<String>();

	            try {
	                  list = Files.readAllLines(file.toPath(), Charset.defaultCharset());
	            } catch (IOException ex) {
	                  ex.printStackTrace();
	            }
	            for (String line : list) {
	                  String[] res = line.split(",");
	                  if (id.equals(res[0]) && password.equals(res[8])) {
	                        return true;
	                  }
	            }
	            return false;
	      }

		
		
		
		*/
	

}
