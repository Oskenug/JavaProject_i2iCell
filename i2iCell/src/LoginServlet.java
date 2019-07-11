import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	int result;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse  response) throws ServletException, IOException { 
	 {		 
			String rename = "";
			try {
				String customerPhone = request.getParameter("customerPhonename");
				String customerPassword = request.getParameter("customerPasswordname");
				String myURL = "http://68.183.75.84:8080/i2iCellService/services/Services/" + "login?inputPhoneNumber="
						+ customerPhone + "&inputPassword=" + customerPassword;
				URL url = new URL(myURL);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setConnectTimeout(60000);
				BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String str;
				while ((str = in.readLine()) != null) {
					rename += str;
				}
				in.close();
				result = Integer.parseInt(String.valueOf(rename.charAt(63)));
				if(result==1) {
					HttpSession session=request.getSession(); 
			        session.setAttribute("phonenumber",customerPhone); 			        
					response.sendRedirect("/i2iCell/GetBalances");
					} 
				else {					
					response.sendRedirect("/i2iCell/Login.html?q=Hata");
					}
			} 
			catch (MalformedURLException | RemoteException e) {
				e.printStackTrace();
			} 
	 }
	 
 }
  
 }
 
