<%@ include file="../init.jsp" %>

<p>
	<b>LISTA</b>
</p>

<jsp:useBean id="users" class="java.util.List" scope="request"/>

<liferay-ui:search-container>
    <liferay-ui:search-container-results results="<%= users %>" />

    <liferay-ui:search-container-row
        className="com.liferay.portal.kernel.model.User"
        modelVar="user"
    >
        <liferay-ui:search-container-column-text property="fullName" />

        <liferay-ui:search-container-column-text property="firstName" />
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>



    <portlet:renderURL var="viewLeave" > 

 <portlet:param name="mvcRenderCommandName" value="/"/>a
 </portlet:renderURL>
    <a href="<%=viewLeave %>">Ritorna</a>