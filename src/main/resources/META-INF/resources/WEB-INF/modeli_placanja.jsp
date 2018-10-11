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
    <th>Naziv</th>
    <th>Opis</th>
    <th>Popust</th>
    <th>Kamata</th>
    <th>Zatezna kamata</th>
    <th>Opcije</th>
  </tr>
  <c:forEach var = "list" items = "${models}">
  <tr>
  	<td>${list.model_placanja_ID}</td>
    <td>${list.naziv_modela}</td>
    <td>${list.opis}</td>
    <td>${list.popust}</td>
    <td>${list.kamata}</td>
    <td>${list.zatezna_kamata}</td>
     <td>
        <a href="/viewModel/${list.model_placanja_ID}">View</a>
        <a href="/deleteModel/${list.model_placanja_ID}">Delete</a>
        <a href="/editModel/${list.model_placanja_ID}">Edit</a>
    </td>
  </tr>
  </c:forEach>
</table>
<hr/>
<form method="post" action="/saveModel">
<input type="hidden" name="model_placanja_ID" value=""/>
  Naziv modela:<br>
  <input type="text" name="naziv_modela"/>
  <br>
  Opis:<br>
  <input type="text" name="opis"/>
  <br>
  Popust:<br>
  <input type="text" name="popust"/>
  <br>
  Kamata:<br>
  <input type="text" name="kamata"/>
  <br>
  Zatezna kamata:<br>
  <input type="text" name="zatezna_kamata"/>
  <br><br>
  <input type="submit" value="Submit">
</form>

<br>
<hr/>
<br>
<a href="/">Back</a>

</body>
</html>