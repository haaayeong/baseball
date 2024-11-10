const userObject = {
	init: function() {
		$('#btn-save').on('click', (e) => {
			e.preventDefault();
			this.insertUser();
		})
	},
	
	insertUser:function() {
		let user = {
			nickname: $('#nickname').val(),
			username: $('#username').val(),
			password: $('#password').val(),
			email: $('#email').val()
		};
		
		$.ajax({
			type: "POST",
			url: "/user/signup",
			data: JSON.stringify(user),
			contentType: "application/json; charset=utf-8"
		}).done(function(response) {
			if(response.status == 200) {
				alert(response.data);
				location.href = "/";
			} else {
				const result = response.data;
				let msg = '';
				
				if(result.nickname != null)
					msg += result.nickname + "\n";
				if(result.username != null)
					msg += result.username + "\n";
				if(result.password != null)
					msg += result.password + "\n";
				if(result.email != null)
					msg += result.email;
				
				alert(msg);
			}
		}).fail(function(error) {
			console.log(error);
		})
	}
}