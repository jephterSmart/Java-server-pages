<html>
<body>
<h2>Hello World!</h2>
<%! int count = 0; %>
<%! String initParam;%>

<h3>Welcome to java server pages</h3>
<p>This is the query parameter from servlet via request dispatcher <%= request.getAttribute("servletQuery") %> </p>
<p>This is the query parameter from servlet via request attribute <%= request.getAttribute("javax.servlet.forward.query_string") %></p>
<p>This is the query string passed to this JSP via the dispatcher <%= request.getQueryString() %></p>
<h4>Lastly, these are the class variables </h4><br>
<p>This is the amount of time users have visited this page <b><%= ++count %></b></p>
<% 
    initParam= config.getInitParameter("jsp.directories");
    if(initParam != null) {
        out.println("initParam: " + initParam);
    }
%>
<%= request.getParameter("jab") %><br> page
<%= request.getParameter("page") %>
 
</body>
</html>
