<%--
  Created by IntelliJ IDEA.
  User: Michael
  Date: 2015/4/30 0030
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%--
<div class="row">
    <div class="col-md-12">
        <!-- BEGIN PAGE TITLE & BREADCRUMB-->
        <h3 style="position:absolute; left:50px; top:0px; " class="page-title" id="index-page-title">Ajax+JQuery 测试，查看学生所有的课程${currUser}</h3>
    </div>
</div>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;"/>
    <script src="assets/scripts/jquery-1.9.1.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="assets/scripts/combined.js" type="text/javascript" charset="utf-8"></script>
    <script src="assets/scripts/make_dropdown.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="assets/scripts/js-func.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" href="assets/css/style_change.css" type="text/css" media="all" />
    <link href='http://fonts.googleapis.com/css?family=Bitter:400,400italic,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="assets/css/font-awesome.min.css" type="text/css" media="all" />
    <title>Insert title here</title>
</head>
<body>
<%--<div class="row" id="pages">
    <div class="col-md-12">
        <h3 style="position:absolute; left:50px; top:0px; " class="page-title" id="index-page-title">
            <c:forEach items="${result}" var="item">
                本学期注册时间：${item.this_regis_time }  <br/>
                入学时间：${item.enrollment_time } <br/>
            </c:forEach>
        </h3>
    </div>
</div>--%>
            <form method="post" class="DA_custom_form" id="registration-form" action="#">
                <h3>Registration Form Example</h3>
                <div class="DA_inner_frame">
                    <div class="DA_holder">
                        <label>Your Name</label>
                        <div class="DA_field_container">
                            <div class="cl">&nbsp;</div>
                            <input type="text" class="field" id="myname" name="myname" />
                            <span><i class="icon-remove"></i></span>
                            <div class="cl">&nbsp;</div>
                        </div>
                    </div>
                    <div class="cl">&nbsp;</div>
                    <div class="DA_holder DA_double left_aligned">
                        <label>Password</label>
                        <div class="DA_field_container">
                            <div class="cl">&nbsp;</div>
                            <input type="password"  class="field" id="password" name="password"  />
                            <span><i class="icon-remove"></i></span>
                            <div class="cl">&nbsp;</div>
                        </div>
                    </div>
                    <div class="DA_holder DA_double right-aligned">
                        <label>Re-type password</label>
                        <div class="DA_field_container">
                            <div class="cl">&nbsp;</div>
                            <input type="password"  class="field" id="password2" name="password2" />
                            <span><i class="icon-remove"></i></span>
                            <div class="cl">&nbsp;</div>
                        </div>
                    </div>
                    <div class="cl">&nbsp;</div>
                    <div class="DA_holder">
                        <label>E-mail</label>
                        <div class="DA_field_container">
                            <div class="cl">&nbsp;</div>
                            <input type="text" class="field" id="email" name="email" />
                            <span><i class="icon-remove"></i></span>
                            <div class="cl">&nbsp;</div>
                        </div>
                    </div>
                    <div class="cl">&nbsp;</div>
                    <div class="DA_holder DA_select_holder">
                        <label>Country</label>
                        <div class="select_wrap"  >
                            <select  class="select_field" id="country" name="country" >
                                <option value="">Select your country</option>
                                <option value="usa">USA</option>
                                <option value="england">England</option>
                                <option value="italy">Italy</option>
                                <option value="australia">Australia</option>
                            </select>
                        </div>
                    </div>
                    <div class="cl">&nbsp;</div>
                    <div class="DA_holder DA_check_holder">
                        <div class="cl">&nbsp;</div>
                        <input type="checkbox" class="check-box" id="terms" name="terms"  />
                        <label for="remember" class="fl">I have read the terms of use</label>
                        <div class="cl">&nbsp;</div>
                    </div>
                    <div class="cl">&nbsp;</div>
                    <div class="DA_holder DA_radio_holder">
                        <div class="cl">&nbsp;</div>
                        <input type="radio" class="radio-btn" name="gender" id="gender-male" value="m" /><label class="fl" for="gender-male">Male</label>
                        <div class="cl">&nbsp;</div>
                        <input type="radio" class="radio-btn" name="gender" id="gender-female" value="f"  /><label class="fl" for="gender-female">Female</label>
                        <div class="cl">&nbsp;</div>
                    </div>
                    <div class="cl">&nbsp;</div>
                    <div class="btnp"><input type="submit"  value="Sign In" /></div>

                </div>
            </form>
            <form method="post"  class="DA_custom_form" id="contact-form" >
                <h3 class="red">Contact Form Example</h3>
                <div class="DA_inner_frame">
                    <div class="cl">&nbsp;</div>
                    <div class="DA_holder">
                        <label>Your Name</label>
                        <div class="DA_field_container">
                            <div class="cl">&nbsp;</div>
                            <input type="text" class="field" id="your_name" name="your_name" />
                            <span><i class="icon-remove"></i></span>
                            <div class="cl">&nbsp;</div>
                        </div>
                    </div>
                    <div class="cl">&nbsp;</div>
                    <div class="DA_holder">
                        <label>E-mail</label>
                        <div class="DA_field_container">
                            <div class="cl">&nbsp;</div>
                            <input type="text" class="field" id="email2" name="email2" />
                            <span><i class="icon-remove"></i></span>
                            <div class="cl">&nbsp;</div>
                        </div>
                    </div>
                    <div class="cl">&nbsp;</div>
                    <div class="DA_holder">
                        <label>Your Message</label>
                        <div class="textarea-frame">
                            <div class="cl">&nbsp;</div>

                            <textarea name="message" id="message" class="field" rows="8" cols="40"></textarea>
                            <span><i class="icon-remove"></i></span>
                            <div class="cl">&nbsp;</div>
                        </div>
                    </div>
                    <div class="cl">&nbsp;</div>
                    <div class="btnp"><input type="submit" class="blue" value="Submit" /></div>
                </div>
            </form>
            <form method="post"  class="DA_custom_form" id="login-form" >
                <h3 class="green">Login Form Example</h3>
                <div class="DA_inner_frame">
                    <div class="cl">&nbsp;</div>
                    <div class="DA_holder">
                        <label>Username</label>
                        <div class="DA_field_container">
                            <div class="cl">&nbsp;</div>
                            <input type="text" class="field" id="user" name="user" />
                            <span><i class="icon-remove"></i></span>
                            <div class="cl">&nbsp;</div>
                        </div>
                    </div>
                    <div class="cl">&nbsp;</div>
                    <div class="DA_holder">
                        <label>Password(Required)</label>
                        <div class="DA_field_container">
                            <div class="cl">&nbsp;</div>
                            <input type="password"  class="field" id="login_password" name="login_password"  />
                            <span><i class="icon-remove"></i></span>
                            <div class="cl">&nbsp;</div>
                        </div>
                    </div><div class="cl">&nbsp;</div>
                    <div class="DA_holder DA_check_holder">
                        <div class="cl">&nbsp;</div>
                        <input type="checkbox" class="check-box" id="remember" name="remember"  />
                        <label for="remember" class="fl">Remember me</label>
                        <div class="cl">&nbsp;</div>
                    </div>
                    <div class="cl">&nbsp;</div>
                    <div class="btnp"><input type="submit" class="red" value="Sign In" /></div>
                    <small class="ac"><a href="#">Forgotten password?</a></small>
                </div>
            </form>

        <li><a href="horizontal.html" class="load">Horizontal</a></li>
        <li>
            <a href="#">Modal</a>
            <ul class="sub-modal">
                <li name="registration-form"><a href="modal-registration.html" class="load" >Registration</a></li>
                <li name="contact-form"><a href="modal-contact.html" class="load" >Contact</a></li>
                <li name="login-form"><a href="modal-login.html" class="load">Login</a></li>
            </ul>
        </li>
    </ul>
</div>
<div class="optional"></div>
<script type="text/javascript" charset="utf-8">
    $('.optional').load('vertical.html',function() { call_func(); all_events(); validate_all_forms(); });
</script>
</body>
</html>