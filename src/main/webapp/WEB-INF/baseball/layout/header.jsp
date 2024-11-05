<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ taglib uri="http://www.java.sun.com/jsp/jstl/core" prefix="c" %>

<sec:authorize access="isAutheticated()">
	<sec:authentication property="principal" var="principal"/>
</sec:authorize>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://kit.fontawesome.com/b6ab2fabf0.js" crossorigin="anonymous"></script>
<title>Fan Twins</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
<link rel="stylesheet" href="/css/header.css">
<link rel="stylesheet" href="/css/footer.css">
<script src="/js/header.js" defer></script>
<link rel="icon" href="/img/twins.png">
</head>
<body>
  <nav class='navbar'>
    <div class="navbar-loggo">
      <a href="/">
        <img src="/img/twins.png" alt="LGtwins">
      </a>
    </div>
    <div class="navbar-menu">
      <ul>
        <li><a href="#"><b>LGtwins</b></a></li>
        <li><a href="#"><b>공지사항</b></a></li>
        <li><a href="#"><b>팬</b></a></li>
        <li><a href="#"><b>굿즈판매</b></a></li>
      </ul>
    </div>
    <div class="navbar-user">
    	<c:if test="${principal == null}">
	      <ul>
	        <li><a href="/user/login"><b>로그인</b></a></li>
	        <li><a href="/user/signup"><b>회원가입</b></a></li>
	      </ul>
	    </c:if>
	    
	    <c:if test="${principal != null}">
	      <ul>
	        <li><a href="#"><b>로그아웃</b></a></li>
	        <li><a href="#"><b>마이페이지</b></a></li>
	      </ul>
	    </c:if>
    </div>
    
    <a class="navbar-hamburger">
    	<i class="fa-solid fa-bars"></i>
    </a>
  </nav>
  