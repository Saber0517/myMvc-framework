package cn.johnyu.mymvc.framework;

import org.apache.log4j.Logger;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "DispatchServlet",urlPatterns = {"/"})
public class DispatchServlet extends HttpServlet{
	public static Logger logger = Logger.getLogger(DispatchServlet.class);

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		logger.info("inifo...");
		logger.debug("debug...");
		try {
			doDispatch(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		logger.debug("test");
		try {
			doDispatch(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
	}
	
}
