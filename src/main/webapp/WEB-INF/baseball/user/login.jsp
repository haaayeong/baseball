<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

  <div class="container mt-3">
   <form method="post" action="/auth/login">
     <div class="mb-3 mt-3">
       <label for="username" class="form-label">아이디</label>
       <input type="text" class="form-control" id="username" placeholder="아이디를 입력하세요" name="username">
     </div>
     <div class="mb-3">
       <label for="password" class="form-label">비밀번호</label>
       <input type="password" class="form-control" id="password" placeholder="비밀번호를 입력하세요" name="password">
     </div>
     <button id="btn-login" type="submit" class="btn btn-secondary">로그인</button>
   </form>
  </div>

<%@ include file="../layout/footer.jsp" %>