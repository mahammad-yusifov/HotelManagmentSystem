<%@ page import="java.util.List" %>
<%@ page import="com.dev.hoteldb.Dao.Entity.Reservation" %>
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
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>--%>

<html>
<header>
    <title>
        Reservation!
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

        td {
            border: 1px #DDD solid;
            padding: 5px;
            cursor: pointer;
        }

        .selected {
            background-color: brown;
            color: #FFF;
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
            height: 2500px;
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
            border: 4px solid #138D75;
            float: left;
        }

        .althisse {
            width: 1152px;
            height: 100px;
            margin: 260px 0 0 0;
            padding: 0 0 0 20px;
        }

        #rightButton {
            width: 200px;
            height: 30px;
            border: 2px solid #138D75;
            color: rgb(255, 255, 255);
            background-color: #16A085;
            margin-left: 950px;
            font-weight: bold;
        }

        #rightButton:hover {
            color: #45B39D;
            background-color: #138D75;
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
            margin: 10px 0 0 650px;
            font-weight: bold;
        }

        #reset:hover {
            color: #45B39D;
            background-color: #138D75;
        }

        .form font:hover {
            color: rgb(226, 222, 222)
        }

        .meal {
            width: 1152px;
            height: 500px;
            padding: 0 0 0 20px;
        }

        .meal font:hover {
            color: rgb(226, 222, 222)
        }

        .meal1 {
            width: 1142px;
            height: 230px;
            padding: 10px 0 0 10px;
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

    <script type="text/javascript">
        // function breakfastButton() {
        //     alert("breakfast selected");
        //     // document.write("Breakfast meals selected: ");
        // }
        //
        // function lunchButton() {
        //     alert("lunch selected");
        //     // document.write("Breakfast meals selected: ");
        // }
        //
        // function supperButton() {
        //     alert("supper selected");
        //     // document.write("Breakfast meals selected: ");
        // }
        //
        // function checkedBox(value) {
        //     alert("checked this box: " + value);
        // }


        // $("#table tr").click(function(){
        //     $(this).addClass('selected').siblings().removeClass('selected');
        //     var value=$(this).find('td:first').html();
        //     alert(value);
        // });
        //
        // $('.ok').on('click', function(e){
        //     alert($("#table tr.selected td:first").html());
        // });
    </script>
</header>
<body>

<div class="all">
    <div class="b">
        <iframe width="1190" height="166" frameborder="0" scrolling="no" name="1"
                src="images/reservationphoto.html"></iframe>
    </div>


    <%--    <form:form modelAttribute="reservation" method="post">--%>
    <%--    <div class="form">--%>
    <%--        <table border="0" cellspacing="0" cellpanding="0">--%>
    <%--&lt;%&ndash;           clientId&ndash;%&gt;--%>
    <%--            <tr>--%>
    <%--                <td height="30" width="200"><font color="#fff" face="tahoma" size=4><b>Client ID</b></font></td>--%>
    <%--                <td width="300"><form:input path="clientId" type="text" size="30" id="ok"/></td>--%>
    <%--            </tr>--%>

    <%--&lt;%&ndash;    checkindate&ndash;%&gt;--%>
    <%--            <tr>--%>
    <%--                <td height="30" width="200"><font color="#fff" face="tahoma" size=4><b>Check in date</b></font></td>--%>
    <%--                <td width="300"><from:input path="checkIn" type="time" id="ok"/>/td>--%>
    <%--            </tr>--%>

    <%--&lt;%&ndash;    Check out date&ndash;%&gt;--%>
    <%--            <tr>--%>
    <%--                <td height="30" width="200"><font color="#fff" face="tahoma" size=4><b>Check out date</b></font></td>--%>
    <%--                <td width="300"><form:input path="checkOut" type="time" id="ok"/></td>--%>
    <%--            </tr>--%>

    <%--&lt;%&ndash;    Room type&ndash;%&gt;--%>
    <%--            <tr>--%>
    <%--                <td height="30" width="200"><font color="#fff" face="tahoma" size=4><b>Room type</b></font></td>--%>
    <%--                <td width="300"><form:input path="roomType" type="checkbox" value="AC"/><font face="tahoma" color="white">Air--%>
    <%--                    Conditioner</font></td>--%>
    <%--            </tr>--%>


    <%--&lt;%&ndash;    LCD Television&ndash;%&gt;--%>
    <%--&lt;%&ndash;            <tr>&ndash;%&gt;--%>
    <%--&lt;%&ndash;                <td height="30" width="200"></td>&ndash;%&gt;--%>
    <%--&lt;%&ndash;                <td width="300"><form:input path="" type="checkbox" value="tv"><font face="tahoma" color="white">LCD&ndash;%&gt;--%>
    <%--&lt;%&ndash;                    Television</font></td>&ndash;%&gt;--%>
    <%--&lt;%&ndash;            </tr>&ndash;%&gt;--%>

    <%--&lt;%&ndash;            <tr>&ndash;%&gt;--%>
    <%--&lt;%&ndash;                <td height="30" width="200"></td>&ndash;%&gt;--%>
    <%--&lt;%&ndash;                <td width="300"><form:input type="checkbox" value="jaccuzi" checked><font face="tahoma"&ndash;%&gt;--%>
    <%--&lt;%&ndash;                                                                                     color="white">Jaccuzi</font></td>&ndash;%&gt;--%>
    <%--&lt;%&ndash;            </tr>&ndash;%&gt;--%>

    <%--            <tr>--%>
    <%--                <td height="30" width="200"></td>--%>
    <%--                <td width="300"><input type="checkbox" value="VIP"><font face="tahoma" color="white">VIP</font></td>--%>
    <%--            </tr>--%>

    <%--            <tr>--%>
    <%--                <td height="30" width="200"><font color="#fff" face="tahoma" size=4><b>Bed type</b></font></td>--%>
    <%--                <td width="300"><input type="radio" value="single" name="bed"><font color="#fff"--%>
    <%--                                                                                    face="tahoma">Single</font>--%>
    <%--                    <input type="radio" value="Double" name="bed"><font color="#fff" face="tahoma">Double</font></td>--%>
    <%--            </tr>--%>
    <%--        </table>--%>

    <%--    </div>--%>

    <%--    </form:form>--%>


    <%--    table--%>
    <div class="database">
        <table id="table" border="1" cellspacing="0" cellpanding="0" width="720" height="260" bgcolor=#16A085>
            <tr align="center" height="26">
                <td><b>Client ID</b></td>
                <td><b>Check in</b></td>
                <%--                <td><b>Check out</b></td>--%>
                <%--                <td><b>Room No</b></td>--%>
                <td><b>Operations</b></td>
            </tr>

            <c:forEach items="${reservationList}" var="reservation">
                <div class="b">
                    <tr align="center" height="26">
                        <td>${reservation.clientId}</td>
                        <td>${reservation.roomNo}</td>
                        <td><a href="update/${reservation.clientId}"><input type="button" value="Update"
                                   id="updateButton"></a>
                           <a href="delete/${reservation.clientId}"><input type="button" value="Delete" id="deleteButton"></a>
                        </td>
                            <%--                    <td><%=reservation.getClientId()%></td>--%>
                            <%--                    <td><%=reservation.getCheckIn()%></td>--%>
                            <%--                    <td><%=reservation.getCheckOut()%></td>--%>
                            <%--                    <td><%=reservation.getRoomNo()%></td>--%>
                    </tr>
                </div>

            </c:forEach>
        </table>

    </div>


    <%--    buttons add and etc.--%>
    <div class="althisse">
        <a href="add" target="1"><input type="button" value="Add" name="OK" id="addButton"/></a>
        <a href="reservations"><input type="button" value="Reset" id="resetButton"></a>
    </div>


<%--    <div class="meal">--%>
<%--        <font color="white" face="tahoma" size="4"><b>Meals</b></font><br><br>--%>

<%--        <font color="white" face="tahoma" size="4"><b>Breakfast</b>--%>
<%--            <div class="meal1">--%>
<%--                <table width="1142">--%>
<%--                    <tr align="center">--%>
<%--                        <td><img src="images/bacon.jpg" height="200"></td>--%>
<%--                        <td><img src="images/muffin.jpg" height="200"></td>--%>
<%--                        <td><img src="images/egg.jpg" height="200"></td>--%>
<%--                        <td><img src="images/cheese.jpg" height="200"></td>--%>
<%--                        <td><img src="images/bread.jpg" height="200"></td>--%>
<%--                        <td><img src="images/cake.jpg" height="200"></td>--%>
<%--                    </tr>--%>


<%--                    <tr align="center">--%>
<%--                        <form action="BreakfastServlet" method="GET">--%>
<%--                            <td>--%>
<%--                                <input type="checkbox" name="breakfast" value="bacon">--%>
<%--                                <font color="white" face="tahoma" size="3">Bacon</font>--%>
<%--                            </td>--%>

<%--                            <td>--%>
<%--                                <input type="checkbox" name="breakfast" value="muffin"><font color="white" face="tahoma"--%>
<%--                                                                                             size="3">Muffin</font>--%>
<%--                            </td>--%>
<%--                            <td><input type="checkbox" name="breakfast" value="egg"><font color="white" face="tahoma"--%>
<%--                                                                                          size="3">Egg</font>--%>
<%--                            </td>--%>
<%--                            <td><input type="checkbox" name="breakfast" value="cheese"><font color="white" face="tahoma"--%>

<%--                                                                                             size="3">Cheese</font></td>--%>

<%--                            <td>--%>
<%--                                <input type="checkbox" name="breakfast" value="bread"><font color="white" face="tahoma"--%>
<%--                                                                                            size="3">Bread--%>
<%--                                <input type="checkbox" name="breakfast" value="fired_bread">--%>
<%--                                <font color="white" face="tahoma" size="3">Fired Bread</font>--%>
<%--                            </td>--%>
<%--                            <td><input type="checkbox" name="breakfast" value="pancake"><font color="white"--%>
<%--                                                                                              face="tahoma"--%>
<%--                                                                                              size="3">Pancake</font>--%>
<%--                            </td>--%>

<%--                            <div class="sagButton">--%>
<%--                                <input type="submit" value="Select breakfast meals" id="rightButton"--%>
<%--                                       onclick="breakfastButton()">--%>
<%--                            </div>--%>
<%--                        </form>--%>
<%--                    </tr>--%>

<%--                </table>--%>

<%--            </div>--%>
<%--        </font><br>--%>


<%--        <font color="white" face="tahoma" size="4"><b>Lunch</b>--%>
<%--            <div class="meal1">--%>
<%--                <table width="1142">--%>
<%--                    <tr align="center">--%>
<%--                        <td><img src="images/rice.jpg" height="200"></td>--%>
<%--                        <td><img src="images/chicken.jpg" height="200"></td>--%>
<%--                        <td><img src="images/burger.jpg" height="200"></td>--%>
<%--                        <td><img src="images/v-lobsterrolls_129.webp" height="200"></td>--%>
<%--                        <td><img src="images/macaroni.jpg" height="200"></td>--%>

<%--                    </tr>--%>
<%--                    <tr align="center">--%>
<%--                        <td><input type="checkbox" value="rice"><font color="white" face="tahoma" size="3">Rice</font>--%>
<%--                        </td>--%>
<%--                        <td><input type="checkbox" value="chicken"><font color="white" face="tahoma"--%>
<%--                                                                         size="3">Chicken</font></td>--%>
<%--                        <td><input type="checkbox" value="burger" checked id="burgers"><font color="white" face="tahoma"--%>
<%--                                                                                             size="3">Burgers</font>--%>
<%--                        </td>--%>
<%--                        <td><input type="checkbox" value="lobster_rolls"><font color="white" face="tahoma" size="3">Lobster--%>
<%--                            Rolls</font></td>--%>
<%--                        <td><input type="checkbox" value="macaroni"><font color="white" face="tahoma"--%>
<%--                                                                          size="3">Macaroni</font></td>--%>
<%--                    </tr>--%>
<%--                </table>--%>
<%--            </div>--%>


<%--            <div class="meal1">--%>
<%--                <table width="1142">--%>
<%--                    <tr align="center">--%>
<%--                        <td><img src="images/sloppy-Joes.jpg" height="200"></td>--%>
<%--                        <td><img src="images/poutine.jpg" height="200"></td>--%>
<%--                        <td><img src="images/FryBoard.jpg" height="200"></td>--%>
<%--                        <td><img src="images/pizza.jpg" height="200"></td>--%>
<%--                    </tr>--%>
<%--                    <tr align="center">--%>
<%--                        <td><input type="checkbox" value="sloppy_joes"><font color="white" face="tahoma" size="3">Sloppy--%>
<%--                            Joes</font></td>--%>
<%--                        <td><input type="checkbox" value="poutine"><font color="white" face="tahoma"--%>
<%--                                                                         size="3">Fish</font></td>--%>
<%--                        <td><input type="checkbox" value="fried_potato"><font color="white" face="tahoma" size="3">Fried--%>
<%--                            potatos</font></td>--%>
<%--                        <td><input type="checkbox" value="pizza"><font color="white" face="tahoma" size="3">Pizza</font>--%>
<%--                        </td>--%>

<%--                    </tr>--%>
<%--                </table>--%>
<%--            </div>--%>
<%--        </font><br>--%>

<%--        <div class="sagButton">--%>
<%--            <input type="button" value="Select lunch meals" id="rightButton" onclick="lunchButton()">--%>
<%--        </div>--%>

<%--        <font color="white" face="tahoma" size="4"><b>Supper</b>--%>
<%--            <div class="meal1">--%>
<%--                <table width="1142">--%>
<%--                    <tr align="center">--%>
<%--                        <td><img src="images/lule.jpg" height="200"></td>--%>
<%--                        <td><img src="images/big.jpg" height="200"></td>--%>
<%--                        <td><img src="images/spagetti.jpg" height="200"></td>--%>
<%--                        <td><img src="images/doner.jpg" height="200"></td>--%>
<%--                        <td><img src="images/dolma.jpg" height="200"></td>--%>
<%--                    </tr>--%>
<%--                    <tr align="center">--%>
<%--                        <td><input type="checkbox" value="lule"><font color="white" face="tahoma" size="3">Lule</font>--%>
<%--                        </td>--%>
<%--                        <td><input type="checkbox" value="big_mac"><font color="white" face="tahoma" size="3">Big--%>
<%--                            Mac</font></td>--%>
<%--                        <td><input type="checkbox" value="spagetti_with_meat"><font color="white" face="tahoma"--%>
<%--                                                                                    size="3">Spaghetti with meat</font>--%>
<%--                        </td>--%>
<%--                        <td><input type="checkbox" value="doner"><font color="white" face="tahoma" size="3">Doner</font>--%>
<%--                        </td>--%>
<%--                        <td><input type="checkbox" value="dolma_leaf"><font color="white" face="tahoma" size="3">Dolma(leaf)</font>--%>
<%--                        </td>--%>
<%--                    </tr>--%>
<%--                </table>--%>

<%--                <div class="meal1">--%>
<%--                    <table width="1142">--%>
<%--                        <tr align="center">--%>
<%--                            <td><img src="images/sushi.jpg" height="200"></td>--%>
<%--                            <td><img src="images/fish.jpg" height="200"></td>--%>
<%--                            <td><img src="images/dolma2.jpg" height="200"></td>--%>
<%--                            <td><img src="images/levengi.jpg" height="200"></td>--%>
<%--                        </tr>--%>
<%--                        <tr align="center">--%>
<%--                            <td><input type="checkbox" value="sushi"><font color="white" face="tahoma"--%>
<%--                                                                           size="3">Sushi</font></td>--%>
<%--                            <td><input type="checkbox" value="fish"><font color="white" face="tahoma"--%>
<%--                                                                          size="3">Fish</font></td>--%>
<%--                            <td><input type="checkbox" value="dolma_cabbage"><font color="white" face="tahoma" size="3">Dolma(cabbage)</font>--%>
<%--                            </td>--%>
<%--                            <td><input type="checkbox" value="levengi"><font color="white" face="tahoma" size="3">levengi</font>--%>
<%--                            </td>--%>
<%--                        </tr>--%>
<%--                    </table>--%>
<%--                </div>--%>

<%--                <div class="meal1">--%>
<%--                    <table width="1142">--%>
<%--                        <tr align="center">--%>
<%--                            <td><img src="images/kabab.jpg" height="200"></td>--%>
<%--                            <td><img src="images/meat.jpg" height="200"></td>--%>
<%--                            <td><img src="images/pork.jpg" height="200"></td>--%>
<%--                        </tr>--%>
<%--                        <tr align="center">--%>
<%--                            <td><input type="checkbox" value="kabab"><font color="white" face="tahoma"--%>
<%--                                                                           size="3">Elekber</font></td>--%>
<%--                            <td><input type="checkbox" value="meat_loaf"><font color="white" face="tahoma" size="3">Meat--%>
<%--                                loaf</font></td>--%>
<%--                            <td><input type="checkbox" value="pork_chops"><font color="white" face="tahoma" size="3">Pork--%>
<%--                                chops</font></td>--%>
<%--                        </tr>--%>
<%--                    </table>--%>
<%--                </div>--%>

<%--                <div class="sagButton">--%>
<%--                    <input type="button" value="Select supper meals" id="rightButton" onclick="supperButton()">--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </font>--%>

<%--    </div>--%>

</div>
</body>
</html>
