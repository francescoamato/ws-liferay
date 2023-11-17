<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="frausers.caption"/></b>
</p>
<p>
     <portlet:renderURL var="viewLeave" > 

 <portlet:param name="mvcRenderCommandName" value="render_users_list"/>a
 </portlet:renderURL>
    <a href="<%=viewLeave %>">Click here</a>
    
</p>