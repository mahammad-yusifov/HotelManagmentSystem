<%--
  Created by IntelliJ IDEA.
  User: Mahammad Yusifov
  Date: 05.12.2020
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<header>
    <title>
        Renaissance Hotel
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
        table {border-collapse: collapse;border-spacing: 0;}
        textarea {overflow:auto;}

        /***** RESET *****/

        .all {width:1348px; height: 2700px; background-color:#45B39D; padding: 20px 0 0 0; }
        .menu {width:1190px; height:40px; background-color: #16A085; margin:0 0 0 80px; position: fixed;}
        .a3 {width:1190px; height:20px; background-color: #000000;(238, 238, 238); margin:-20px 0 0 80px; position: fixed}
        .a {width:1190px; height:5px; background-color: #138D75; margin: 0 0 0 80px; position: fixed}
        .a2 {width:1190px; height:10px; background-color:#45B39D; margin: 40px 0 0 80px; position: fixed}
        .b{width:1180px; height:1000px; margin:40px 0 0 80px; padding:0 0 0 0; border:0px solid #000}

        .menu ul{margin:0; padding:0; list-style: none;}
        .menu ul li a{display:block; width:120px; height:35px; text-align:center; text-decoration: solid;
            float:left; font:bold 14px tahoma; background-color: #16A085; color:#ffffff; padding:15px 0 0 0; }
        .menu ul li a:hover{ background-color: #138D75; color: #45B39D ; text-decoration:none}
    </style>
</header>

<body>
<div class="all">
    <div class="a3"></div>
    <div class="menu">
        <ul>
            <li><a href="home">Home</a></li>
            <li><a href="clients" target="1" >Clients</a></li>
            <li><a href="reservations" target="1">Reservation</a></li>
            <li><a href="payment" target="1">Payment</a></li>
        </ul>
    </div>

    <div class="a"></div>
    <div class="a2"></div>

    <div class="b">
        <iframe width="1200" height="2500" frameborder="0" scrolling="no" name="1"
                src="images/photo.html"></iframe>
    </div>


</div>
</body>
</html>
