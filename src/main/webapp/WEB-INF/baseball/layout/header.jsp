<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>

<sec:authorize access="isAuthenticated()">
	<sec:authentication property="principal" var="principal"/>
</sec:authorize>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://kit.fontawesome.com/b6ab2fabf0.js" crossorigin="anonymous"></script>
<title>Fan Twins</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
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
  