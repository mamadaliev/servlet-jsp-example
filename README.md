# Servlet + JSP

## Technologies
- Servlet
- Java Server Page (JSP)

## Create a servlet

##### 1. Declare a servlet via xml
Open `src/main/webapp/WEB-INF/web.xml` and write this code:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns="http://java.sun.com/xml/ns/javaee"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
         version="3.0">

    <!-- Servlet -->
    <servlet>
        <servlet-name>homeServlet</servlet-name>
        <servlet-class>com.example.app.servlets.HomeServlet</servlet-class>
    </servlet>

    <!-- Servlet mapping -->
    <servlet-mapping>
        <servlet-name>homeServlet</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>
</web-app>
```

##### 2. Declare a servlet via xml annotation
To create a servlet using annotation, create `HomeServlet.java` and write this code:
```java

@WebServlet("/")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Home page");
    }
}
```

## Contribute
For any problems, comments, or feedback please create an issue [here](https://github.com/egnaf/servlet-jsp-example/issues).
<br>

## License
This software is released under the [Apache-2.0](http://www.apache.org/licenses/LICENSE-2.0.txt).
