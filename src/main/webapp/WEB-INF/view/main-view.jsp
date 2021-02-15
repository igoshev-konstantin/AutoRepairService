<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<h2>Main view</h2>
<br>

<input type="button" value="Add new car" onclick="window.location.href = '/add-new-car'"/>

<%--++add new car--%>
<%--<c:url var="varAddNewCar" value="/add-new-car">--%>
<%--    <c:param name="car" value="${car}"/>--%>
<%--</c:url>--%>

<%--<input type="button" value="Add new car" onclick="window.location.href = '${varAddNewCar}'"/>--%>
<%----add new car--%>


<%--<form:form action="formAction" modelAttribute="car">--%>


<%--    Car color: <form:select path="carColor">--%>
<%--    <c:forEach var="varCarColors" items="${carColors}">--%>
<%--        <form:option value="${varCarColors.id}" label="${varCarColors.name}"/>--%>
<%--    </c:forEach>--%>
<%--    </form:select>--%>

<%--    Car label: <form:select path="carLabel">--%>
<%--    <c:forEach var="varCarLabels" items="${carLabels}">--%>
<%--        <form:option value="${varCarLabels.id}" label="${varCarLabels.name}"/>--%>
<%--    </c:forEach>--%>
<%--    </form:select>--%>


<%--</form:form>--%>


<br>

</body>
</html>
