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
        Payment
    </title>
    <style type="text/css">
        /***** RESET *****/
        html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code,del, dfn, em, font, img, ins, kbd, q, s, samp,
        small, strike, sub, sup, tt, var, b, u, i, center,dl, dt, dd, ol, ul, li,fieldset, form, label, legend,table, caption, tbody, tfoot, thead, tr {
            margin: 0;
            padding: 0;
            border: 0;
            outline: 0;
            /*font-size: 100%;
            vertical-align: baseline;*/

        }
        html, body {height:100%;}
        body {line-height: 1;}
        ol, ul {list-style: none;}
        blockquote, q {quotes: none;}
        blockquote:before, blockquote:after, q:before, q:after {content: '';content: none;}
        table {border-collapse: collapse;border-spacing: 0;} /
        textarea {overflow:auto;}

        /***** RESET *****/

        .all {width:1190px; height: 1000px; background-color:#45B39D; padding: 20px 0 0 0; }
        .form {width:400px; height:260px; margin:0 0 0 0; padding: 0 0 0 20px; float: left;}
        .database {width:720px; height:260px; margin:0 0 0 10px; border:4px solid #138D75;float: left;}
        .althisse {width:1152px; height:100px; margin:260px 0 0 0; padding: 0 0 0 20px; }
        #button { width:100px; height: 30px; border:2px solid #138D75; color:rgb(255, 255, 255); background-color:#16A085; margin: 10px; font-weight: bold;}
        #button:hover{ color:#45B39D; background-color: #138D75;}
        #reset { width:100px; height: 30px; border:2px solid #138D75; color:rgb(255, 255, 255); background-color:#16A085; margin: 10px 0 0 650px; font-weight: bold;}
        #reset:hover{ color:#45B39D; background-color: #138D75;}
        #search { width:100px; height: 30px; border:2px solid #138D75; color:rgb(255, 255, 255); background-color:#16A085; margin: 0 0 0 10px; font-weight: bold;}
        #search:hover{ color:#45B39D; background-color: #138D75;}
        .form font:hover {color:rgb(226, 222, 222)}
        .cost { width:225px; height: 18px; background-color:#16A085; border:1px solid #138D75; font: 15px tahoma; color:white; padding: 0 0 0 5px;}
        #ok:hover {background-color: #138D75; color:white}
        .database tr{color:rgb(255, 255, 255); font: tahoma;}
        .c {font: 1px tahoma;}
    </style>
</header>
<body><div class="all">
    <div class="b">
        <iframe width="1190" height="166" frameborder="0" scrolling="no" name="1"
                src="images/paymentphoto.html"></iframe>
    </div>
    <div class="form">
        <table border="0" cellspacing="0" cellpanding="0">
            <tr>
                <td height="30" width="200"><font color="#fff" face="tahoma" size=4 ><b>Client ID</b></font></td>
                <td width="230"><input type="text" size="28" id="ok"></td>
            </tr>

            <tr align="center">
                <td height="30" width="200"><font color="#fff" face="tahoma" size=4 ><b></b></font></td>
                <td width="230"><input type="button" value="Search" id="search"><input type="button" value="OK" id="search"></td>
            </tr>

            <tr>
                <td height="30" width="200"><font color="#fff" face="tahoma" size=4 ><b>Cost</b></font></td>
                <td width="230" >
                    <div class="cost"></div>
                </td>
            </tr>

            <tr>
                <td height="30" width="200"><font color="#fff" face="tahoma" size=4 ><b>Discount(%)</b></font></td>
                <td width="230"><input type="text" size="28" id="ok"></td>
            </tr>

            <tr>
                <td height="30" width="200"><font color="#fff" face="tahoma" size=4 ><b>Total Cost:</b></font></td>
                <td width="230">
                    <div class="cost"></div>
                </td>
            </tr>

            <tr>
                <td height="30" width="200"><font color="#fff" face="tahoma" size=4 ><b>Payment Method</b></font></td>
                <td width="230"><select id="ok">
                    <option></option>
                    <option>Cash</option>
                    <option>Credit card</option>
                </select></td>
            </tr>

            <tr>
                <td height="30" width="200"><font color="#fff" face="tahoma" size=4 ><b></b></font></td>
                <td width="230"><input type="radio"  value="paid" name="paymethod"><font color="#fff" face="tahoma">Paid</font>
                    <input type="radio"  value="not paid" name="paymethod"><font color="#fff" face="tahoma" >Not paid</font></td>
            </tr>

        </table>


    </div>
    <div class="database">
        <table border="1" cellspacing="0" cellpanding="0" width="720" height="260" bgcolor=#16A085>
            <tr align="center" height="26">
                <td><b>Client ID</b></td>
                <td><b>First Name</b></td>
                <td><b>Last Name</b></td>
                <td><b>Total Cost</b></td>
                <td><b>Paid</b></td>
                <td><b>Payment Method</b></td>
            </tr>

            <div class="b">
                <tr align="center" height="26">
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>

                <tr align="center" height="26">
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>

                <tr align="center" height="26">
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>

                <tr align="center" height="26">
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>

                <tr align="center" height="26">
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>

                </tr>

                <tr align="center" height="26">
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>

                <tr align="center" height="26">
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>

                <tr align="center" height="26">
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>

                <tr align="center" height="26">
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
            </div>
        </table>

    </div>


    <div class="althisse">
        <input type="button" value="Add" id="button">
        <input type="button" value="Update" id="button">
        <input type="button" value="Delete" id="button">
        <input type="button" value="Reset" id="reset">
    </div>






</div></body>
</html>
