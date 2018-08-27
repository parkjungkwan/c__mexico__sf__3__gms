<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<div id="contentBox">
		<form id="deleteForm">
			비밀번호 재입력 
			<input type="password" name="password"/>
			<input id="deleteFormBtn" 
				type="button" value="전 송" />
		</form>
	</div>
	<script>
		var form = document.getElementById('deleteForm');
		document.getElementById('deleteFormBtn')
			.addEventListener('click',function(){
				var val = form.password.value;
				if(val==='${user.password}'){
					form.action = '${context}/member.do';
					form.method = 'post';
					var node = document.createElement('input'); 
						node.setAttribute('type','hidden');
						node.setAttribute('name','action');
						node.setAttribute('value','delete');
					form.appendChild(node);
					form.submit();
				}else{
					alert('비밀번호가 다릅니다!!')
				}
			});
	
	</script>
	</body></html>
	
	
	
	
	
	