<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
			<th>Naziv</th>
			<th>Cena</th>
			<th>Sifra</th>
			<th>Valuta</th>
			<th>Datum kreiranja</th>
			<th>Kreirano od</th>
			<th>Datum modifikovanja</th>
			<th>Modifikovano od</th>
			<th>Model placanja</th>
			<th>Skolska godina</th>
			<th>Opcije</th>
		</tr>
		<c:forEach var="list" items="${lists}">
			<tr>
				<td>${list.cenovnik_ID}</td>
				<td>${list.naziv_stavke}</td>
				<td>${list.cena_stavke}</td>
				<td>${list.sifra}</td>
				<td>${list.valuta}</td>
				<td>${list.date_created}</td>
				<td>${list.created_by}</td>
				<td>${list.date_modified}</td>
				<td>${list.modified_by}</td>
				<td>${list.modeli.naziv_modela}</td>
				<td>${list.skolskaGodina.datum_pocetka}</td>
				<td><a href="/view/${list.cenovnik_ID}">View</a> <a
					href="/delete/${list.cenovnik_ID}">Delete</a> <a
					href="/edit/${list.cenovnik_ID}">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
	<hr />
	<form method="post" action="/save">
		<input type="hidden" name="cenovnik_ID" value="" /> Naziv:<br> <input
			type="text" name="naziv_stavke" /> <br> Cena:<br> <input
			type="text" name="cena_stavke" /> <br> Sifra:<br> <input
			type="text" name="sifra" /> <br> Valuta:<br> <input
			type="text" name="valuta" /> <br> Datum:<br> <input
			type="text" name="date_created" /> <br> Kreirano od:<br> <input
			type="text" name="created_by" /> <br> Modifikovano:<br> <input
			type="text" name="date_modified" /> <br> Modifikovano od:<br>
		<input type="text" name="modified_by" /> <br> <br> 
		Model placanja:
		<br>
		<select name="model_placanja_ID">
        <c:forEach items="${models}" var="list">
          <option value="${list.model_placanja_ID}">${list.naziv_modela}></option>
         </c:forEach>
     	</select>
		<br><br>
  		Skolska godina:<br>
  		<select name="skolska_godina_ID">
            <c:forEach items="${godine}" var="list">
          <option value="${list.skolska_godina_ID}">${list.datum_pocetka}></option>
         </c:forEach>
        </select>
			<br><br> <input type="submit" value="Submit">
		</form>
	<br>
	<hr />
	<br>
	<a href="/modeli_placanja">Modeli placanja</a>
	<br>
	<br>
	<a href="/skolska_godina">Skolska Godina</a>
	<br>
	<br>
</body>
</html>