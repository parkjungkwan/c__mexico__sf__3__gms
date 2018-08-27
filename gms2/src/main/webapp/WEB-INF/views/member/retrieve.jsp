<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="contentBox" style="width:100%; height:300px;">
		<table id="mypageTable" style="width:100%; height:100%;" >
			<tr>
				<td id="mypageImg" rowspan="3" colspan="2">
					<img  src="${img}/${profile}" alt="" />
				</td>
				<td style="width: 50px">ID</td>
				<td>${user.userid}</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>${user.name}</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>${user.password}</td>
			</tr>
			<tr>
				<td style="width: 50px">성별</td>
				<td>${user.gender}</td>
				<td style="width: 50px">팀</td>
				<td>${user.teamid}</td>
			</tr>
			<tr>
				<td>나이</td>
				<td>${user.age}</td>
				<td>역할</td>
				<td>${user.roll}</td>
			</tr>
		</table>
</div>
<script>
	document.getElementById('myPageMoveToUpdate')
		.addEventListener('click',
			function() {
			alert('Update Click !!')
				router.move({
					context : '${context}',
					domain : 'member',
					action : 'move',
					page : 'modify'
				});
			});
	document.getElementById('myPageMoveToDelete')
	.addEventListener('click',
		function() {
			router.move({
				context : '${context}',
				domain : 'member',
				action : 'move',
				page : 'deleteForm'
			});
		});

</script>

