import stricto_grails_tarefa.Task
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_stricto_Grails_Tarefa_taskshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/task/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'task.label', default: 'Task'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
invokeTag('message','g',14,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
expressionOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
if(true && (taskInstance?.task)) {
printHtmlPart(10)
invokeTag('message','g',22,['code':("task.task.label"),'default':("Task")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',23,['bean':(taskInstance),'field':("task")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (taskInstance?.requiredBy)) {
printHtmlPart(14)
invokeTag('message','g',29,['code':("task.requiredBy.label"),'default':("Required By")],-1)
printHtmlPart(15)
invokeTag('formatDate','g',30,['date':(taskInstance?.requiredBy)],-1)
printHtmlPart(12)
}
printHtmlPart(16)
if(true && (taskInstance?.category)) {
printHtmlPart(17)
invokeTag('message','g',36,['code':("task.category.label"),'default':("Category")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',37,['bean':(taskInstance),'field':("category")],-1)
printHtmlPart(12)
}
printHtmlPart(19)
createTagBody(2, {->
printHtmlPart(20)
createTagBody(3, {->
invokeTag('message','g',44,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',44,['class':("edit"),'action':("edit"),'resource':(taskInstance)],3)
printHtmlPart(21)
invokeTag('actionSubmit','g',45,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(22)
})
invokeTag('form','g',47,['url':([resource:taskInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(23)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(24)
invokeTag('message','g',52,['code':("default.home.label")],-1)
printHtmlPart(25)
createTagBody(2, {->
invokeTag('message','g',53,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',53,['class':("list"),'action':("index")],2)
printHtmlPart(26)
createTagBody(2, {->
invokeTag('message','g',54,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',54,['class':("create"),'action':("create")],2)
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',57,[:],1)
printHtmlPart(28)
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
