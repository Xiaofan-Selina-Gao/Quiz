<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Welcome to JSTL foreach tag Example in JSP</title>
    </head>

    <body>
        <h2>JSTL foreach tag example in JSP</h2>

        <jsp:scriptlet>
            
            
        </jsp:scriptlet>
        
         <c:forEach items="${questions}" var ="question">
                 <tr>
                           <td>${question.questionDesc}</td>
                           <td>${question.option1}</td>
                           <td>${question.option2}</td>
                           <td>${question.option3}</td>
                           <td>${question.option4}</td>
                 </tr>
        </c:forEach>
    </body>
</html>