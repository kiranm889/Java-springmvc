<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>Student-Form</title>

</head>

<body>

	<h1>Fill This Form ASAP</h1>
	
	<form:form action="processForm" modelAttribute="student">
	Student Id:<form:input path="studentId"/>
	<br> <br>
	
	Student Name:<form:input path="studentName"/>
	<br> <br>
	
	<input type="submit" value="Submit">
	
	</form:form>

</body>

</html>