# Servlet + JSP

## Technologies
- Servlet
- Java Server Page (JSP)
- GlassFish server

## Create a servlet

#### 1. Declare a servlet via xml
Open `src/main/webapp/WEB-INF/web.xml` and write this code:
```xml
...

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
...
```

#### 2. Declare a servlet via annotation
To create a servlet using annotation, create `HomeServlet.java` and write this code:
```java

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
...
```

## Contribute
For any problems, comments, or feedback please create an issue [here](https://github.com/egnaf/servlet-jsp-example/issues).
<br>

## License
This software is released under the [Apache-2.0](http://www.apache.org/licenses/LICENSE-2.0.txt).
