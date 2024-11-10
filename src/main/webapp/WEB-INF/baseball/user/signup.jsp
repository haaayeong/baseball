<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>
	
<div class="container mt-3">
   <form> 
     <div class="mb-3 mt-3">
       <label for="nickname" class="form-label">닉네임</label>
       <input type="text" class="form-control" id="nickname" placeholder="사용하실 닉네임을 입력해주세요." name="nickname">
     </div>
     <div class="mb-3">
       <label for="username" class="form-label">아이디</label>
       <input type="text" class="form-control" id="username" placeholder="사용하실 아이디를 입력해주세요." name="username">
     </div>
     <div class="mb-3">
       <label for="password" class="form-label">비밀번호</label>
       <input type="password" class="form-control" id="password" placeholder="사용하실 비밀번호를 입력해주세요." name="password">
     </div>
     <div class="mb-3">
       <label for="email" class="form-label">이메일</label>
       <input type="email" class="form-control" id="email" placeholder="이메일을 입력해주세요." name="email">
     </div>
     <button id="btn-save" type="submit" class="btn btn-secondary">회원가입</button>
   </form>
</div>
<script src="js/user.js"></script>	
<%@ include file="../layout/footer.jsp" %>