# Java Server Pages

JSP enable us developers to build dynamic web applications, with the
help of the web container. Basically, what the web container does is that:
At first request to a JSP, the web container basically convert the JSP to a `*.java` file,
by extending the appropriate GenericServlet implementation class. After which, the `.java`
is compiled, then that class is loaded and configured with any servletConfig and servletContext.
