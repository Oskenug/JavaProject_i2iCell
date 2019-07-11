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

public class NewAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int result;
	
	public NewAccountServlet() {
		super();
	}
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/NewAccount.html");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		  String customerTc = request.getParameter("customerTc");	
		  String gelen = request.getParameter("customerBDay");
		  String customerName = request.getParameter("customerName");
		  String customerSurname = request.getParameter("customerSurname");
		  String customerPhone = request.getParameter("customerPhone");
	      String customerPassword = request.getParameter("customerPassword");
	      String customerEmail = request.getParameter("customerEmail");
	      String bdate = request.getParameter("customerBDay");
	      String[] split = bdate.split("-"); 
	      String customerBDay =split[2]+"-"+split[1]+"-"+split[0];

	      String rename = "";
	      try {
				String myURL = "http://68.183.75.84:8080/i2iCellService/services/Services/" + 
								"createAccount?inputFirstName=" + customerName + 
								"&inputLastName=" + customerSurname +
								"&inputPhoneNumber=" + customerPhone + 
								"&inputEmail=" + customerEmail + 
								"&inputPassword=" + customerPassword +
								"&inputBirthDate=" + customerBDay +
								"&inputTcNumber=" + customerTc ;
				URL url = new URL(myURL);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setConnectTimeout(60000);
				BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String str;
				while ((str = in.readLine()) != null) {
					rename += str;
				}
				in.close();
				result = Integer.parseInt(String.valueOf(rename.charAt(71)));
				if(result==1) {
					response.sendRedirect("/i2iCell/Login.html?q=Success");
				}
				else 
				{
					response.sendRedirect("/i2iCell/NewAccount.html?q=Hata");
				}				
			} catch (MalformedURLException | RemoteException e) {
				e.printStackTrace();
			}
		}
	}