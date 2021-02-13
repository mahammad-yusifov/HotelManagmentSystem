<%@ page import="java.util.List" %>
<%@ page import="com.dev.hoteldb.Dao.Entity.Clients" %>
<%@ page import="org.springframework.web.bind.annotation.ModelAttribute" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mahammad Yusifov
  Date: 05.12.2020
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<header>
    <title>
        Clients
    </title>
    <style type="text/css">
        /***** RESET *****/
        html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, font, img, ins, kbd, q, s, samp,
        small, strike, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr {
            margin: 0;
            padding: 0;
            border: 0;
            outline: 0;
            /*font-size: 100%;
            vertical-align: baseline;*/

        }

        html, body {
            height: 100%;
        }

        body {
            line-height: 1;
        }

        ol, ul {
            list-style: none;
        }

        blockquote, q {
            quotes: none;
        }

        blockquote:before, blockquote:after, q:before, q:after {
            content: '';
            content: none;
        }

        table {
            border-collapse: collapse;
            border-spacing: 0;
        }

        textarea {
            overflow: auto;
        }

        /***** RESET *****/

        .all {
            width: 1190px;
            height: 1000px;
            background-color: #45B39D;
            padding: 20px 0 0 0;
        }

        .photo {
            width: 1180px;
            height: 170px;
        }

        .form {
            width: 400px;
            height: 260px;
            margin: 0 0 0 0;
            padding: 0 0 0 20px;
            float: left;
        }

        .database {
            width: 720px;
            height: 260px;
            margin: 0 0 0 10px;
            table-layout: fixed;
            border: 4px solid #138D75;
            float: left;
        }

        .althisse {
            width: 400px;
            height: 100px;
            margin: 20px 0 0 0;
            padding: 0 0 0 20px;
        }

        #button {
            width: 100px;
            height: 30px;
            border: 2px solid #138D75;
            color: rgb(255, 255, 255);
            background-color: #16A085;
            margin: 10px;
            font-weight: bold;
        }

        #button:hover {
            color: #45B39D;
            background-color: #138D75;
        }

        #reset {
            width: 100px;
            height: 30px;
            border: 2px solid #138D75;
            color: rgb(255, 255, 255);
            background-color: #16A085;
            margin: 10px 0 0 20px;
            font-weight: bold;
        }

        #reset:hover {
            color: #45B39D;
            background-color: #138D75;
        }

        .form font:hover {
            color: rgb(226, 222, 222)
        }

        #ok:hover {
            background-color: #138D75;
            color: white
        }

        .database tr {
            color: rgb(255, 255, 255);
            font: tahoma;
        }

        .c {
            font: 1px tahoma;
        }
    </style>

    <script>
        function getException(exceptionMessage) {
            alert(exceptionMessage);
        }
    </script>
</header>
<body>

<div class="photo">
    <iframe width="1190" height="166" frameborder="0" scrolling="no" name="1" src="images/clientphoto.html"></iframe>

    <form:form modelAttribute="clientRequestModel" method="post" action="clients/add">

        <div class="form">

            <div class="form-group">
                <div class="col-sm-10">
                    <form:input path="clientId" type="hidden"/>
                </div>
            </div>

            <table border="0" cellspacing="0" cellpanding="0">

                <tr>
                    <td height="30" width="200"><font color="#fff" face="tahoma" size=4><b>First Name</b></font></td>
                    <td width="300"><form:input path="firstName" type="text" size="30" id="ok"/></td>
                </tr>

                <tr>
                    <td height="30" width="200"><font color="#fff" face="tahoma" size=4><b>Last Name</b></font></td>
                    <td width="300"><form:input path="lastName" type="text" size="30" id="ok"/></td>

                </tr>

                <tr>
                    <td height="30" width="200"><font color="#fff" face="tahoma" size=4><b>Passport No</b></font></td>
                    <td width="300"><form:input path="passportNo" type="text" size="30" id="ok"/></td>
                </tr>

                <tr>
                    <td height="30" width="200"><font color="#fff" face="tahoma" size=4><b>Mobile</b></font></td>
                    <td width="300"><form:input path="mobile" type="text" size="30" id="ok"/></td>
                </tr>

                <tr>
                    <td height="30" width="200"><font color="#fff" face="tahoma" size=4><b>E-mail</b></font></td>
                    <td width="300"><form:input path="email" type="text" size="30" id="ok"/></td>
                </tr>

                <tr>
                    <td height="30" width="200"><font color="#fff" face="tahoma" size=4><b>Birth Date</b></font></td>
                    <td width="300"><form:input path="birthDate" type="date" id="ok"/></td>
                </tr>

                <tr>
                    <td height="30" width="200"><font color="#fff" face="tahoma" size=4><b>Gender</b></font></td>
                    <td width="300"><form:radiobutton path="gender" value="Male" name="gender"/><font color="#fff"
                                                                                                      face="tahoma">Male</font>
                        <form:radiobutton path="gender" value="Female" name="gender"/><font color="#fff" face="tahoma">Female</font>
                    </td>
                </tr>
            </table>

            <div class="althisse">
                <input type="submit" value="${methodName}" id="button">
                <a href="clients/reset"><input type="button" value="Reset" id="reset"></a>
            </div>

        </div>

    </form:form>


    <div class="database">
        <table border="1" cellspacing="0" cellpanding="0" width="720" height="260" bgcolor=#16A085>
            <tr align="center" height="26">
                <td><b>Client ID</b></td>
                <td><b>First Name</b></td>
                <td><b>Last Name</b></td>
                <td><b>Birth Date</b></td>
                <td><b>Mobile</b></td>
                <td><b>Passport No</b></td>
                <td><b>E-mail</b></td>
                <td><b>Gender</b></td>
                <td><b>Operations</b></td>
            </tr>

            <c:forEach items="${clients}" var="client">

                <tr align="center" height="26">
                    <td>${client.clientId}</td>
                    <td>${client.firstName}</td>
                    <td>${client.lastName}</td>
                    <td>${client.birthDate}</td>
                    <td>${client.mobile}</td>
                    <td>${client.passportNo}</td>
                    <td>${client.email}</td>
                    <td>${client.gender}</td>

                    <td><a href="clients/update/${client.clientId}"><input type="button" value="Update"
                                                                           id="button"></a>
                        <a href="clients/delete/${client.clientId}"><input type="button" value="Delete"
                                                                           id="button"></a>
                    </td>
                </tr>

            </c:forEach>
        </table>
    </div>

</div>
</body>
</html>


