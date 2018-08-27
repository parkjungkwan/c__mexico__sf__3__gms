<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<div id="contentBox">
	<div id="searchBox">
        <input type="button" id="searchBtn" value="검 색" />
        <input id="searchWord" name="searchWord" type="text" placeholder="검색어 입력"/>
        <select name="searchOption" id="searchOption">
        	 <option value="none">검색조건</option>
        	 <option value="userid">아이디</option>
        	 <option value="name">이 름</option>
        	 <option value="teamname">팀 명</option>
        </select>
	</div>
	<table id="contentBoxTab">   
		<tr id="contentBoxMeta">
			<th>아이디</th>
			<th>이 름</th>
			<th>나 이</th>
			<th>성 별</th>
			<th>역 할</th>
			<th>팀 명</th>
		</tr>
		<c:forEach items="${list}" var="user">
		<tr>
			<td>${user.userid}</td>
			<td>
				<a class="username" id="${user.userid}" >
					${user.name}
				</a></td>
			<td>${user.age}</td>
			<td>${user.gender}</td>
			<td>${user.roll}</td>
			<td>${user.teamid}</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="6">
				전체회원수 : ${page.rowCount}
				<ul class="pageBox" >
				<c:if test="${page.existPrev}">
						<li id="${page.prevBlock}" 
							class="pageNumber">◀PREV</li>
								</c:if>
					<c:forEach begin="${page.beginPage}" 
						end="${page.endPage}" 
						step="1" varStatus="i">
						<li>
							<a id="${i.index}" class="pageNumber">
								${i.index}
							</a>
						</li>
					</c:forEach>
					<c:if test="${page.existNext}">
						<li id="${page.nextBlock}" class="pageNumber">NEXT▶</li>
					</c:if>
				</ul>
			</td>
		</tr>
	</table>
</div>
<script>
	admin.main('${context}');
</script>
