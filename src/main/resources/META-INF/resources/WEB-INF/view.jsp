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
			<td>${lists.cenovnik_ID}</td>
		</tr>
		<tr>
			<th>Naziv</th>
			<td>${lists.naziv_stavke}</td>
		</tr>
		<tr>
			<th>Cena</th>
			<td>${lists.cena_stavke}</td>
		</tr>
		<tr>
			<th>Sifra</th>
			<td>${lists.sifra}</td>
		</tr>
		<tr>
			<th>Valuta</th>
			<td>${lists.valuta}</td>
		</tr>
		<tr>
			<th>Datum</th>
			<td>${lists.date_created}</td>
		</tr>
		<tr>
			<th>Kreirano od</th>
			<td>${lists.created_by}</td>
		</tr>
		<tr>
			<th>Modifikovano</th>
			<td>${lists.date_modified}</td>
		</tr>
		<tr>
			<th>Modifikovano od</th>
			<td>${lists.modified_by}</td>
		</tr>
		<tr>
			<th>Model placanja</th>
			<td>${lists.modeli.naziv_modela}</td>
		</tr><tr>
			<th>Skolska godina</th>
			<td>${lists.skolskaGodina.datum_pocetka}</td>
		</tr>
	</table>
	
	<br>
	<hr/>
	<br>
	<a href="/">Back</a>
</body>
</html>