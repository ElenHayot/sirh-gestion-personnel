<%@ page import="java.util.List" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
	<meta charsel = "UTF-8">
	<title>SGP-App</title>
</head>


<body>
	<h1>Les collaborateurs</h1>
	<h2>Sont là!!</h2>
	
	<ul>
	<%
	List<String> listeNoms = (List<String>) request.getAttribute("listeNoms");
	for (String nom:listeNoms) {
		%>
			<li><%= nom %></li>
		<%
	}
	%>
	<li>Et tant d'autres encore...</li>
	</ul>
</body>

</html>