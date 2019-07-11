import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetBalancesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    int result;
    HttpSession session;
	 public void KalanKullanimServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       RequestDispatcher dispatcher = request.getRequestDispatcher("/GetBalances.jsp");
        dispatcher.forward(request, response);
    }   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				HttpSession session=request.getSession(); 
				String customerPhone = (String)session.getAttribute("phonenumber"); 
				String rename = "";
				String myURL = "http://68.183.75.84:8080/i2iCellService/services/Services/" 
								+ "getBalances?inputPhoneNumber="
								+ customerPhone;
				URL url = new URL(myURL);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setConnectTimeout(60000);
				BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String str;
				while ((str = in.readLine()) != null) {
					rename += str;
					}
				in.close();
				String[] split = rename.split("<ns:return>"); 
				String splitN =split[1] + split[2]+ split[3];
				String[] Deger = splitN.split("</ns:return>");
				int internet = (int) Math.round(Double.parseDouble(Deger[0]));
				int dakika = (int) Math.round(Double.parseDouble(Deger[1]));
				int sms = (int) Math.round(Double.parseDouble(Deger[2]));
				request.setAttribute("gbDeger", internet);
				request.setAttribute("dakikaDeger", dakika);
				request.setAttribute("smsDeger", sms);
				response.setContentType("text/html; charset=utf-8");
				KalanKullanimServlet(request, response);
				}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
		}

}
