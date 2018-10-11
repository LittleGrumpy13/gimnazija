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
<form method="post" action="/saveModel">
<input type="hidden" name="model_placanja_ID" value="${models.model_placanja_ID}"/>
  Naziv modela:<br>
  <input type="text" name="naziv_modela" value="${models.naziv_modela}"/>
  <br>
  Opis:<br>
  <input type="text" name="opis" value="${models.opis}"/>
  <br>
  Popust:<br>
  <input type="text" name="popust" value="${models.popust}"/>
  <br>
  Kamata:<br>
  <input type="text" name="kamata" value="${models.kamata}"/>
  <br>
  Zatezna kamata:<br>
  <input type="text" name="zatezna_kamata" value="${models.zatezna_kamata}"/>
  <br><br>
  <input type="submit" value="Submit">
</form>
<br>
<hr/>
<br>
	<a href="/modeli_placanja">Back</a>
</body>
</html>