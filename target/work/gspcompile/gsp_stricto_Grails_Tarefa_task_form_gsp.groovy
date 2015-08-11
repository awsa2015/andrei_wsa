import stricto_grails_tarefa.Task
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_stricto_Grails_Tarefa_task_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/task/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: taskInstance, field: 'task', 'error'))
printHtmlPart(1)
invokeTag('textField','g',5,['required':("required"),'name':("task"),'value':(taskInstance?.task),'class':("large"),'placeholder':("Estudar e programar"),'maxlength':("200")],-1)
printHtmlPart(2)
expressionOut.print(hasErrors(bean: taskInstance, field: 'requiredBy', 'error'))
printHtmlPart(3)
invokeTag('textField','g',10,['type':("date"),'required':("required"),'name':("requiredBy"),'value':(taskInstance?.requiredBy)],-1)
printHtmlPart(2)
expressionOut.print(hasErrors(bean: taskInstance, field: 'category', 'error'))
printHtmlPart(4)
invokeTag('select','g',18,['name':("category"),'value':(taskInstance?.category),'from':(['Pessoal': 'Pessoal', 'Profissional': 'Profissional']),'optionKey':("key"),'optionValue':("value"),'required':(""),'noSelection':(['null':'Selecione uma Categoria'])],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1439000564000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
