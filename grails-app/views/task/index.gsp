<%@ page import="tasks_grails.Task" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Tarefas</title>
		<link rel="stylesheet" type="text/css" href="/Tasks_Grails/assets/02-tasks.css" media="screen" />
	</head>
	<body>
		<header>
			<span>Lista de Tarefas</span>
		</header>
		<main id="taskPage">
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<section id="taskCreation"> <!-- class="not"> -->
				<table>
					<colgroup>
						<col width="40%">
						<col width="15%">
						<col width="15%">
						<col width="30%">
					</colgroup>
					<thead>
						<tr>
							<th>Nome</th>
							<th>Deadline</th>
							<th>Categoria</th>
							<th>Ações</th>
						</tr>
					</thead>
					<tbody>
						<g:each in="${taskInstanceList}" status="i" var="taskInstance">
							<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
								<td>${fieldValue(bean: taskInstance, field: "task")}</td>
								<td>${fieldValue(bean: taskInstance, field: "requiredBy")}</td>
								<td>${fieldValue(bean: taskInstance, field: "category")}</td>
								<td>
									<nav>
										<g:link class="edit" action="edit" resource="${taskInstance}">Editar</g:link>
										<g:link class="complete" action="complete" resource="${taskInstance}">Completar</g:link>
										<g:link class="delete" action="delete" resource="${taskInstance}">Deletar</g:link>
									</nav>
								</td>
							</tr>
						</g:each>
					</tbody>
				</table>
				<div class="nav" role="navigation">
					<nav>
								<g:link class="create" action="create">Adicionar Tarefa</g:link>
					</nav>
				</div>
			</section>
		</main>
		<footer>
			<div class="pagination">
				Você tem <g:paginate total="${taskInstanceCount ?: 0}" /> tarefas
			</div>
		</footer>
	</body>
</html>