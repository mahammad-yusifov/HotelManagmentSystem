<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Alik
  Date: 12/13/2020
  Time: 1:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Test</title>
</head>
<body>

<form:form modelAttribute="test" method="post">

    <div class="form-group">
        <label for="clientId">Client Id</label>
        <div class="col-sm-10">
            <form:input path="clientId" type="text"/>
        </div>
    </div>

    <div class="form-group">
        <label for="jaccuzi">Jaccuzi</label>
        <div class="col-sm-10">
            <form:checkbox path="jaccuzi"/>
        </div>
    </div>


    <div class="form-group">
        <label for="cheese">Cheese</label>
        <div class="col-sm-10">
            <form:checkbox path="cheese"/>
        </div>
    </div>


    <div class="form-group">
        <label for="bacon">Bacon</label>
        <div class="col-sm-10">
            <form:checkbox path="bacon"/>
        </div>
    </div>


    <%--    <div class="form-group">--%>
<%--        <label for="checkIn">Check In Date</label>--%>
<%--        <div class="col-sm-10">--%>
<%--            <form:input path="checkIn" type="date"/>--%>
<%--        </div>--%>
<%--    </div>--%>


<%--    <div class="form-group">--%>
<%--        <label for="checkOut">Check Out Date</label>--%>
<%--        <div class="col-sm-10">--%>
<%--            <form:input path="checkOut" type="date"/>--%>
<%--        </div>--%>
<%--    </div>--%>

    <div class="form-group">
        <div class="col-sm-2">
            <input type="submit" value="Add these meals" class="btn btn-lg btn-primary">
        </div>
    </div>


</form:form>




</body>
</html>
