<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head><title>SpringBoot</title>
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
<hr/>
<form method="post" action="/save">
<input type="hidden" name="cenovnik_ID" value="${lists.cenovnik_ID}"/>
  Naziv:<br>
  <input type="text" name="naziv_stavke" value="${lists.naziv_stavke}"/>
  <br>
  Cena:<br>
  <input type="text" name="cena_stavke" value="${lists.cena_stavke}"/>
  <br>
  Sifra:<br>
  <input type="text" name="sifra" value="${lists.sifra}"/>
  <br>
  Valuta:<br>
  <input type="text" name="valuta" value="${lists.valuta}"/>
  <br>
  Datum:<br>
  <input type="text" name="date_created" value="${lists.date_created}"/>
  <br>
  Kreirano od:<br>
  <input type="text" name="created_by" value="${lists.created_by}"/>
  <br>
  Modifikovano:<br>
  <input type="text" name="date_modified" value="${lists.date_modified}"/>
  <br>
  Modifikovano od:<br>
  <input type="text" name="modified_by" value="${lists.modified_by}"/><br>
  Model placanja:<br>
  <input type="text" name="model_placanja_ID" value="${lists.modeli.model_placanja_ID}"/><br>
  Skolska godina:<br>
  <input type="text" name="skolska_godina_ID" value="${lists.skolskaGodina.skolska_godina_ID}"/>
  <br><br>
  <input type="submit" value="Submit">
 
</form>

<br>
	<hr/>
	<br>
	<a href="/">Back</a>

</body>
</html>