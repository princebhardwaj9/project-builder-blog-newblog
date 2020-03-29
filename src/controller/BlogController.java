package controller;


/* Go to src/controller/BlogController. Blog detail is a String array separated by a comma.
Use the split method to separate the Strings.
The first value corresponds to the blog title and the second value corresponds to the blog description.

Create an object for Blog Class in the BlogController class located inside JAVA Resources - src/controller
Pass the value of Blog to the setAttribute method.
Print all the details in console in the given format
*/
import model.*;
import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet(urlPatterns= {"/blog"})
public class BlogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BlogController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String blogDetails = request.getParameter("selectedAnswers");
		String[] sepStr=blogDetails.split(blogDetails, ',');
		
		String blogTitle=sepStr[0];
		String description=sepStr[1];
		
		Blog blog=new Blog(blogTitle,description,LocalDate.parse("2020-03-03"));

		
		if(blog!=null) {
			request.setAttribute("blog", blog);
			request.setAttribute("user",user);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
			rd.forward(request, response);
		}
		
	}

}
