<%@ page import="tasks_grails.Task" %>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'task', 'error')} required">
	<label>Tarefa<span class="required">*</span></label>
	<g:textField required="required" name="task" value="${taskInstance?.task}" class="large" placeholder="Estudar e programar" maxlength="200" />
</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'requiredBy', 'error')} required">
	<label>Finalizar até<span class="required">*</span></label>
	<g:textField type="date" required="required" name="requiredBy" value="${taskInstance?.requiredBy}" />
</div>

<div class="fieldcontain ${hasErrors(bean: taskInstance, field: 'category', 'error')} required">
	<label>Categoria<span class="required">*</span></label> 
	<g:select name="category" value="${taskInstance?.category}"
		from="${['Pessoal': 'Pessoal', 'Profissional': 'Profissional']}"
		optionKey="key" optionValue="value"
		required="" noSelection="['null':'Selecione uma Categoria']" />
</div>