const hamburger = $(".navbar-hamburger");
const menu = $(".navbar-menu");
const user = $(".navbar-user");

hamburger.on("click",() => {
	menu.toggleClass('active');
	user.toggleClass('active');
});