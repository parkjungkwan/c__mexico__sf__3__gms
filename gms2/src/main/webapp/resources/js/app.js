"use strict";
var app = app || {};
app = {
	init : x=>{
		console.log('step 1');
		app.session.context(x);
		app.onCreate();
	},
	onCreate : ()=>{
		console.log('step 3 ::');
		app.setContentView();
		$('#login__btn').click(()=>{
			location.href = app.x()+'/move/auth/member/login';
		});
		$('#add__btn').click(()=>{
			location.href = app.x()+'/move/auth/member/add';
		});
		$('#login__submit').click(()=>{
			alert('로그인 실행 :::: '+app.x());
			$('#login__form')
			.attr({
				action:app.x()+"/member/login",
				method:"POST"
			})
			.submit();
		});
		$('#add__submit').click(()=>{
			alert('add__submit click !!'+app.x()+"/member/add");
			/*var form = document.getElementById('add__form');
			form.action = app.x()+"/member/add";
			form.method = "POST"; //get은 입력값을 노출, post는 노출x form태그만 post방식이 있음
			*/
			$('#add__form')
			.attr({
				action:app.x()+"/member/add",
				method:"POST"
			})
			.submit();
			
			/*	member.join({
				userid:form.userid.value,
				password:form.pass.value,
				 name:form.name.value,
				 ssn:form.ssn.value});
			var arr =[
				{name:"action", value:"add"},
				{name:"gender", value:member.getGender()},
				{name:"age", value:member.getAge()}];
			for(var i=0;i<arr.length;i++){
				var node = document.createElement('input');
				node.setAttribute('type','hidden');
				node.setAttribute('name',arr[i].name);
				node.setAttribute('value',arr[i].value);
				form.appendChild(node);
			} */
			form.submit();
		});
		$('#logout__btn').click(()=>{
			location.href = app.x()+'/member/logout';
		});
	},
	setContentView : ()=>{
		console.log('step 4 ::'+app.j());
	}
};
app.session = {
	context : x=>{
		console.log('step 2 ::'+x);
		sessionStorage.setItem('context',x);
		sessionStorage.setItem('js',x+'/resources/js');
		sessionStorage.setItem('css',x+'/resources/css');
		sessionStorage.setItem('img',x+'/resources/img');
	},
	path : x=>{
		return sessionStorage.getItem(x);
	}
};
app.x = ()=>{
	return app.session.path('context');
};
app.j = ()=>{
	return app.session.path('js');
};
app.c = ()=>{
	return app.session.path('css');
};
app.i = ()=>{
	return app.session.path('img');
};












