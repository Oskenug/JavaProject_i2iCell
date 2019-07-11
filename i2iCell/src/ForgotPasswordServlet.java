import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForgotPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int result;
    public ForgotPasswordServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String customerTc = request.getParameter("customerTc");
		String customerPhone = request.getParameter("customerPhone");
		String customerPassword = request.getParameter("customerPassword");
		String rename = "";
		try {
		String myURL = "http://68.183.75.84:8080/i2iCellService/services/Services/" 
								+ "changePassword?inputPhoneNumber=" +customerPhone
								+ "&inputTcNumber=" + customerTc  
								+ "&inputNewPassword=" + customerPassword;
		URL url = new URL(myURL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setConnectTimeout(60000);
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String str;
		while ((str = in.readLine()) != null) {
			rename += str;
			}
		in.close();
		result = Integer.parseInt(String.valueOf(rename.charAt(72)));
		if(result==1) {
			response.sendRedirect("/i2iCell/Login.html?q=ChangePassword");
		}
		else 
		{
			response.sendRedirect("/i2iCell/ForgotPassword.html?q=Hata");
		}				
	} catch (MalformedURLException | RemoteException e) {
		e.printStackTrace();
	}
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ChangePassword.html");
		doGet(request, response);
	}

}
