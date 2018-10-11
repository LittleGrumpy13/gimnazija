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
			<td>${models.model_placanja_ID}</td>
		</tr>
		<tr>
			<th>Naziv modela</th>
			<td>${models.naziv_modela}</td>
		</tr>
		<tr>
			<th>Opis</th>
			<td>${models.opis}</td>
		</tr>
		<tr>
			<th>Popust</th>
			<td>${models.popust}</td>
		</tr>
		<tr>
			<th>Kamata</th>
			<td>${models.kamata}</td>
		</tr>
		<tr>
			<th>Zatezna kamata</th>
			<td>${models.zatezna_kamata}</td>
		</tr>
		
	</table>
	<br>
<hr/>
<br>
	<a href="/modeli_placanja">Back</a>
</body>
</html>