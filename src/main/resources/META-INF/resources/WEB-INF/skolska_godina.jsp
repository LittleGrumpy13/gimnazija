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

<table>
  <tr>
  	<th>ID</th>
    <th>Datum pocetka</th>
    <th>Datum kraja</th>
   	<th>Opcije</th>
  </tr>
  <c:forEach var = "list" items = "${skolskaGodina}">
  <tr>
  	<td>${list.skolska_godina_ID}</td>
    <td>${list.datum_pocetka}</td>
    <td>${list.datum_kraja}</td>
     <td>
        <a href="/viewSG/${list.skolska_godina_ID}">View</a>
        <a href="/deleteSG/${list.skolska_godina_ID}">Delete</a>
        <a href="/editSG/${list.skolska_godina_ID}">Edit</a>
    </td>
  </tr>
  </c:forEach>
</table>
<hr/>
<form method="post" action="/saveSG">
<input type="hidden" name="skolska_godina_ID" value=""/>
  Datum pocetka:<br>
  <input type="text" name="datum_pocetka"/>
  <br>
  Datum kraja:<br>
  <input type="text" name="datum_kraja"/>
  <br><br>
  <input type="submit" value="Submit">
</form>
<br>
<hr/>
<br>
<a href="/">Back</a>

</body>
</html>