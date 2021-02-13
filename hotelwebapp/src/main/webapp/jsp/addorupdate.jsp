<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: Alik
  Date: 12/13/2020
  Time: 10:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Reservation</title>
</head>
<body>

<h1>Add Reservation page</h1>

<form:form modelAttribute="addrequestmodel" method="post">


    <div class="form-group">
        <label for="clientId">Client Id</label>
        <div class="col-sm-10">
            <form:input path="clientId" type="text"/>
        </div>
    </div>

    <div class="form-group">
        <label for="checkIn">Check In Date</label>
        <div class="col-sm-10">
            <form:input path="checkIn" type="date"/>
        </div>
    </div>

    <div class="form-group">
        <label for="checkIn">Check Out Date</label>
        <div class="col-sm-10">
            <form:input path="checkOut" type="date"/>
        </div>
    </div>

<%--        MEAL--%>
        <div class="meal">
            <font color="white" face="tahoma" size="4"><b>Meals</b></font><br><br>

            <font color="white" face="tahoma" size="4"><b>Breakfast</b>
                <div class="meal1">
                    <table width="1142">
                        <tr align="center">
                            <td><img src="images/bacon.jpg" height="200"></td>
                            <td><img src="images/muffin.jpg" height="200"></td>
                            <td><img src="images/egg.jpg" height="200"></td>
                            <td><img src="images/cheese.jpg" height="200"></td>
                            <td><img src="images/bread.jpg" height="200"></td>
                            <td><img src="images/cake.jpg" height="200"></td>
                        </tr>

                        <tr align="center">
                                <td>
                                    <form:checkbox path="bacon" name="breakfast"  value="bacon" />
                                    <font color="white" face="tahoma" size="3">Bacon</font>
                                </td>

                                <td>
                                    <form:checkbox path="muffin" name="breakfast" value="muffin"/><font color="white" face="tahoma"
                                                                                                 size="3">Muffin</font>
                                </td>
                                <td><form:checkbox path="egg" name="breakfast" value="egg"/><font color="white" face="tahoma"
                                                                                              size="3">Egg</font>
                                </td>
                                <td><form:checkbox path="cheese" name="breakfast" value="cheese"/><font color="white" face="tahoma"

                                                                                                 size="3">Cheese</font></td>

                                <td>
                                    <form:checkbox path="bread" name="breakfast" value="bread"/><font color="white" face="tahoma"
                                                                                                size="3">Bread
                                    <form:checkbox path="firedBread" name="breakfast" value="fired_bread"/>
                                    <font color="white" face="tahoma" size="3">Fired Bread</font>
                                </td>
                                <td><form:checkbox path="pancake" name="breakfast" value="pancake"/><font color="white"
                                                                                                  face="tahoma"
                                                                                                  size="3">Pancake</font>
                                </td>

                        </tr>

                    </table>

                </div>
            </font><br>


    <%--        LUNCH--%>
            <font color="white" face="tahoma" size="4"><b>Lunch</b>
                <div class="meal1">
                    <table width="1142">
                        <tr align="center">
                            <td><img src="images/rice.jpg" height="200"></td>
                            <td><img src="images/chicken.jpg" height="200"></td>
                            <td><img src="images/burger.jpg" height="200"></td>
                            <td><img src="images/v-lobsterrolls_129.webp" height="200"></td>
                            <td><img src="images/macaroni.jpg" height="200"></td>

                        </tr>
                        <tr align="center">
                            <td><form:checkbox path="rice" value="rice"/><font color="white" face="tahoma" size="3">Rice</font>
                            </td>
                            <td><form:checkbox path="chicken" value="chicken"/><font color="white" face="tahoma"
                                                                             size="3">Chicken</font></td>
                            <td><form:checkbox path="burgers" value="burger" id="burgers"/><font color="white" face="tahoma"
                                                                                                 size="3">Burgers</font>
                            </td>
                            <td><form:checkbox path="lobsterRolls" value="lobster_rolls"/><font color="white" face="tahoma" size="3">Lobster
                                Rolls</font></td>
                            <td><form:checkbox path="macaroni" value="macaroni"/><font color="white" face="tahoma"
                                                                              size="3">Macaroni</font></td>
                        </tr>
                    </table>
                </div>


                <div class="meal1">
                    <table width="1142">
                        <tr align="center">
                            <td><img src="images/sloppy-Joes.jpg" height="200"></td>
                            <td><img src="images/poutine.jpg" height="200"></td>
                            <td><img src="images/FryBoard.jpg" height="200"></td>
                            <td><img src="images/pizza.jpg" height="200"></td>
                        </tr>
                        <tr align="center">
                            <td><form:checkbox path="sloppyJoes" value="sloppy_joes"/><font color="white" face="tahoma" size="3">Sloppy
                                Joes</font></td>
                            <td><form:checkbox path="fishForLunch" value="poutine"/><font color="white" face="tahoma"
                                                                             size="3">Fish</font></td>
                            <td><form:checkbox path="friedPotatos" value="fried_potato"/><font color="white" face="tahoma" size="3">Fried
                                potatos</font></td>
                            <td><form:checkbox path="pizza" value="pizza"/><font color="white" face="tahoma" size="3">Pizza</font>
                            </td>

                        </tr>
                    </table>
                </div>
            </font><br>


    <%--        SUPPER--%>

            <font color="white" face="tahoma" size="4"><b>Supper</b>
                <div class="meal1">
                    <table width="1142">
                        <tr align="center">
                            <td><img src="images/lule.jpg" height="200"></td>
                            <td><img src="images/big.jpg" height="200"></td>
                            <td><img src="images/spagetti.jpg" height="200"></td>
                            <td><img src="images/doner.jpg" height="200"></td>
                            <td><img src="images/dolma.jpg" height="200"></td>
                        </tr>
                        <tr align="center">
                            <td><form:checkbox path="lule" value="lule"/><font color="white" face="tahoma" size="3">Lule</font>
                            </td>
                            <td><form:checkbox path="bigMac" value="big_mac"/><font color="white" face="tahoma" size="3">Big
                                Mac</font></td>
<%--                            <td><form:checkbox path="spaghettiWithMeat"/><font color="white" face="tahoma"--%>
<%--                                                                                                          size="3">Spaghetti with meat</font>--%>
<%--                            </td>--%>
                            <td><form:checkbox path="doner" value="doner"/><font color="white" face="tahoma" size="3">Doner</font>
                            </td>
                            <td><form:checkbox path="dolmaWithLeaf" value="dolma_leaf"/><font color="white" face="tahoma" size="3">Dolma(leaf)</font>
                            </td>
                        </tr>
                    </table>

                    <div class="meal1">
                        <table width="1142">
                            <tr align="center">
                                <td><img src="images/sushi.jpg" height="200"></td>
                                <td><img src="images/fish.jpg" height="200"></td>
                                <td><img src="images/dolma2.jpg" height="200"></td>
                                <td><img src="images/levengi.jpg" height="200"></td>
                            </tr>
                            <tr align="center">
                                <td><form:checkbox path="sushi" value="sushi"/><font color="white" face="tahoma"
                                                                               size="3">Sushi</font></td>
                                <td><form:checkbox path="fishForSupper" value="fish"/><font color="white" face="tahoma"
                                                                              size="3">Fish</font></td>
                                <td><form:checkbox path="dolmaWithCabbage" value="dolma_cabbage"/><font color="white" face="tahoma" size="3">Dolma(cabbage)</font>
                                </td>
                                <td><form:checkbox path="levengi" value="levengi"/><font color="white" face="tahoma" size="3">levengi</font>
                                </td>
                            </tr>
                        </table>
                    </div>

                    <div class="meal1">
                        <table width="1142">
                                <tr align="center">
                                    <td><img src="images/kabab.jpg" height="200"></td>
                                    <td><img src="images/meat.jpg" height="200"></td>
                                    <td><img src="images/pork.jpg" height="200"></td>
                                </tr>
                                <tr align="center">
                                    <td><form:checkbox path="kabab" value="kabab"/><font color="white" face="tahoma"
                                                                                   size="3">Kabab</font></td>
                                    <td><form:checkbox path="meatLoaf" value="meat_loaf"/><font color="white" face="tahoma" size="3">Meat
                                        loaf</font></td>
                                    <td><form:checkbox path="porkChops" value="pork_chops"/><font color="white" face="tahoma" size="3">Pork
                                        chops</font></td>

                                </tr>
                            </table>
                        </div>

                    </div>
                </font>

            </div>


    <div class="form-group">
        <div class="col-sm-2">
            <input type="submit" value="Add" class="btn btn-lg btn-primary">
        </div>
    </div>

</form:form>
</body>
</html>
