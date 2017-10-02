$(document).ready(function(){

	$("#categoryMen").click(function(){
		$(this).toggleClass("active");
		$("#menSubMenu").toggleClass("display");
	});
	
	$("#categoryWomen").click(function(){
		$(this).toggleClass("active");
		$("#womenSubMenu").toggleClass("display");
	});

});
