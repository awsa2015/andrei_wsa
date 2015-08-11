import stricto_grails_tarefa.Task
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_stricto_Grails_Tarefa_taskindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/task/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
invokeTag('hiddenField','g',18,['name':("version"),'value':(taskInstance?.version)],-1)
printHtmlPart(10)
invokeTag('render','g',20,['template':("form")],-1)
printHtmlPart(11)
invokeTag('submitButton','g',23,['id':("saveTask"),'name':("create"),'class':("save"),'value':("Salvar Tarefa")],-1)
printHtmlPart(12)
invokeTag('submitButton','g',24,['name':("clean"),'class':("clean"),'value':("Limpar Tarefa")],-1)
printHtmlPart(13)
})
invokeTag('form','g',26,['url':([resource:taskInstance, action:'save']),'id':("taskForm")],2)
printHtmlPart(14)
loop:{
int i = 0
for( taskInstance in (taskInstanceList) ) {
printHtmlPart(15)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
expressionOut.print(fieldValue(bean: taskInstance, field: "task"))
printHtmlPart(17)
invokeTag('formatDate','g',50,['date':(taskInstance.requiredBy)],-1)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: taskInstance, field: "category"))
printHtmlPart(18)
createTagBody(3, {->
invokeTag('message','g',55,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',55,['class':("edit"),'action':("edit"),'resource':(taskInstance)],3)
printHtmlPart(19)
createClosureForHtmlPart(20, 3)
invokeTag('link','g',56,['class':("complete"),'action':("complete")],3)
printHtmlPart(19)
invokeTag('actionSubmit','g',57,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(21)
i++
}
}
printHtmlPart(22)
createClosureForHtmlPart(23, 2)
invokeTag('link','g',67,['class':("create"),'action':("create")],2)
printHtmlPart(24)
invokeTag('paginate','g',71,['total':(taskInstanceCount ?: 0)],-1)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',73,[:],1)
printHtmlPart(26)
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
