<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>SpringBoot</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>

	<table>
		<tr>
			<th>ID</th>
			<td>${skolskaGodina.skolska_godina_ID}</td>
		</tr>
		<tr>
			<th>Datum Pocetka</th>
			<td>${skolskaGodina.datum_pocetka}</td>
		</tr>
		<tr>
			<th>Datum kraja</th>
			<td>${skolskaGodina.datum_kraja}</td>
		</tr>
		
	</table>
	<br>
<hr/>
<br>
	<a href="/skolska_godina">Back</a>
</body>
</html>