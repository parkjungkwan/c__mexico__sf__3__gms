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
		$('#join__btn').click(()=>{
			location.href = app.x()+'/move/auth/member/add';
		});
		$('#login__submit').click(()=>{
			location.href = app.x()+'/member/login';
		});
		$('#logout__btn').click(()=>{
			alert('logout');
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












