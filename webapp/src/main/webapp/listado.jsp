<html>
<head>
<!-- CSS BOOTSTRAP-->
<!-- CSS only -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<%
			//List<String> nombres = (List<String>)request.getAttribute("nombres");
		%>


		<h1><%=request.getAttribute("nombre")%></h1>
		<h1><%=request.getAttribute("edad")%></h1>
	</div>
</body>
</html>
