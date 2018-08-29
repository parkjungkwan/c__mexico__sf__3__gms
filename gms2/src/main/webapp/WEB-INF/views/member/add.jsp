<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="contentBox">
<form id="add__form" name="add__form">
 	<div id="add__layout">
 	<label for="userid"><b>아이디</b></label>
    <input type="text" placeholder="아이디 입력" name="userid" value="test" required>
    
     <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="비밀번호 입력" name="password" value="1"  required>
    
    <label for="email"><b>이 름</b></label>
    <input type="text" placeholder="이 름 입 력" name="name"  value="테스트"  required>
    
    <label for="email"><b>주민번호(생년월일-앞자리)</b></label>
    <input type="text" placeholder="(예시) 900101-1" name="ssn" value="테스트"  required>
        
       <label for="userid"><b>소속팀</b></label>
           <input type="radio" name="teamid" 
           		value="none" checked="checked" />없음
           <input type="radio" name="teamid" 
           		value="yanolja" />야놀자
           <input type="radio" name="teamid" 
           		value="jieunzip" />지은집
           <input type="radio" name="teamid" 
           		value="turtleking" />터틀킹
           <input type="radio" name="teamid" 
           		value="coddingstar" />코딩스타
        <br /><br />
         <label for="userid"><b>프로젝트역할</b></label>
        <select name="roll" id="roll">
        	 <option value="leader">팀장</option>
        	 <option value="front">프론트개발</option>
        	 <option value="back">백단개발</option>
        	 <option value="android">안드로이드개발</option>
        	 <option value="minfe">민폐</option>
        </select>
       <br /><br />
        <label for="userid"><b>수강과목</b></label>
        <input type="checkbox" name="subject" 
        	value="java" checked="checked" /> Java
        <input type="checkbox" name="subject" value="clang" /> C언어
        <input type="checkbox" name="subject" value="JSP" /> JSP
        <input type="checkbox" name="subject" value="PHP" /> PHP
        <input type="checkbox" name="subject" value="nodejs" /> NodeJS
        <input type="checkbox" name="subject" value="linux" /> Linux
        <input type="checkbox" name="subject" value="html" /> HTML
        <input type="checkbox" name="subject" value="spring" /> Spring
    </div>
    <button id="add__submit" class="submit__btn">회원 가입</button>
    </form>
    </div>
 
 
 
 
 