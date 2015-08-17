package cn.johnyu.mymvc.framework;

import cn.johnyu.mymvc.framework.util.PropertiesLoaderUtils;
import org.apache.log4j.Logger;


import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DispatchServlet", urlPatterns = {"/"})
public class DispatchServlet extends HttpServlet {
    public static Logger logger = Logger.getLogger(DispatchServlet.class);

    /**
     * List of HandlerMappings used by this servlet
     */
    private List<HandlerMapping> handlerMappings;

    /**
     * Name of the class path resource (relative to the DispatcherServlet class)
     * that defines DispatcherServlet's default strategy names.
     */
    private static final String DEFAULT_STRATEGIES_PATH = "DispatcherServlet.properties";

    private static final Properties defaultStrategies;

    static {
        // Load default strategy implementations from properties file.
        // This is currently strictly internal and not meant to be customized
        // by application developers.
        try {
            defaultStrategies = PropertiesLoaderUtils.loadDefaultProperties();
        } catch (IOException ex) {
            throw new IllegalStateException("Could not load 'DispatcherServlet.properties': " + ex.getMessage());
        }
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    /**
     * Return the HandlerExecutionChain for this request.
     * <p>Tries all handler mappings in order.
     *
     * @param request current HTTP request
     * @return the HandlerExecutionChain, or {@code null} if no handler could be found
     */
    protected HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception {
        return new BeanNameUrlHandlerMapping().getHandler(request);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        logger.debug("doGet....");
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
        logger.debug("doPost....");
        try {
            doDispatch(req, resp);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.debug("doDispatch... ");
        HttpServletRequest processedRequest = request;
        HandlerExecutionChain mappedHandler = null;

        ModelAndView mv = null;
        Exception dispatchException = null;
        //步骤2、请求到处理器（页面控制器）的映射，通过HandlerMapping进行映射
        mappedHandler = getHandler(processedRequest);
        if (mappedHandler == null || mappedHandler.getHandler() == null) {
            //noHandlerFound(processedRequest, response);
            return;
        }

    }

}
