package pizashop;
 
import java.io.IOException;
import java.net.URL;
import java.util.*;

import javax.jdo.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class AddLinkDataServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("no url...");
    }
 
    @Override
    protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String maisuu = req.getParameter("maisuu");
        String maisuu1 = req.getParameter("maisuu1");
        String maisuu2 = req.getParameter("maisuu2");
        String maisuu3 = req.getParameter("maisuu3");
        Date date = Calendar.getInstance().getTime();
        LinkData data = new LinkData(maisuu, maisuu1, maisuu2, maisuu3,date);
        PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        try {
            manager.makePersistent(data);
        } finally {
            manager.close();
        }
        resp.sendRedirect("/index.html");
    }
}