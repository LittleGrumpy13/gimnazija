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
<form method="post" action="/saveSG">
<input type="hidden" name="skolska_godina_ID" value="${skolskaGodina.skolska_godina_ID}"/>
  Datum pocetka:<br>
  <input type="text" name="datum_pocetka" value="${skolskaGodina.datum_pocetka}"/>
  <br>
  Datum kraja:<br>
  <input type="text" name="datum_kraja" value="${skolskaGodina.datum_kraja}"/>
  <br><br>
  <input type="submit" value="Submit">
</form>
<br>
<hr/>
<br>
	<a href="/skolska_godina">Back</a>
</body>
</html>