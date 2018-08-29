<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="contentBox">
<form id="login__form" name="login__form" >
  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="아이디 입력" name="userid" id="userid" value="joon" required>
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="비밀번호 입력" name="password" id="password" value="1" required>
    <button type="button" id="login__submit" class="submit__btn">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancel__btn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>
</div>








