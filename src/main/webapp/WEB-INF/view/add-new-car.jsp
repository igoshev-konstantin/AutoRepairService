<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<h2>Creating new car</h2>
<br>


<form:form action="saveNewCar" modelAttribute="car">

<%--    Label: <form:select path="carLabel">--%>
<%--    <c:forEach var="varCarLabel" items="${carLabels}">--%>
<%--        <form:option value="${varCarLabel}" label="${varCarLabel.name}"/>--%>
<%--    </c:forEach>--%>
<%--</form:select>--%>
    Label: <form:select path="carLabel">
        <form:options items="${carLabels}"/>
</form:select>

    <br><br>
    Model: <form:input path="modelName"/>
    <br><br>
    Engine: <form:input path="engineName"/>
    <br><br>
    Engine capacity <form:input path="engineCapacity"/>
    <br><br>
<%--    Turbocharged <form:select path="turboCharged">--%>
<%--    <form:option value="${true}" label="yes"/>--%>
<%--    <form:option value="${false}" label="no"/>--%>
<%--</form:select>--%>
    <br><br>

<%--    Color: <form:select path="carColor">--%>
<%--    <c:forEach var="varCarColors" items="${carColors}">--%>
<%--        <form:option value="${varCarColors.id}" label="${varCarColors.name}"/>--%>
<%--    </c:forEach>--%>
<%--</form:select>--%>

    <br><br>
    <input type="submit" name="ButtonSubmit" value="Done">

</form:form>


<br>

</body>
</html>
