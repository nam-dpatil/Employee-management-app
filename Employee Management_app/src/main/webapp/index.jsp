<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="form-container">
	<form action="" >
		<table border="black" style="border : solid">
		<caption>Employee Register Form</caption>
		 <tr>
		 <th>Employee Id</th>
		 <th>Employee Name</th>
		 <th>Designation</th>
		 <th colspan="2"><a href="addEmployee">add Employee</a></th>
		 <th colspan="2"><a href="editEmployee">delete Employee</a></th>
		 <th colspan="2"><a href="deleteEmployee">delete Employee</a></th>
		</tr>
		
		
		 <tr>
		 <td><input type="number" name="id"></td>
		 <td><input type="text" name="name"></td>
		 <td><input type="text" name="designation"></td>		 
		 </tr>
		
		</table>
	
	</form>
	
	</div>
</body>
</html>