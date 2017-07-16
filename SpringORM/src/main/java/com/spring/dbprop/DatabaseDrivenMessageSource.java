package com.spring.dbprop;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.support.AbstractMessageSource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;

import com.spring.model.MessageResource;
import com.spring.service.MessageResourceService;

public class DatabaseDrivenMessageSource extends AbstractMessageSource  implements ResourceLoaderAware{

	private ResourceLoader resourceLoader;
	private final Map<String, Map<String, String>> properties = new HashMap();
	
	/*@Autowired
    private MessageService messageService;*/
	
	@Autowired
    private MessageResourceService messageResourceService;
	
	public DatabaseDrivenMessageSource() {
        reload();
    }

    public DatabaseDrivenMessageSource(MessageResourceService messageResourceService) {
        this.messageResourceService = messageResourceService;
        reload();
    }
	
	public void reload() {
        properties.clear();
        properties.putAll(loadTexts());
    }
	
    protected Map<String, Map<String, String>> loadTexts() {
    //    log.debug("loadTexts");
        Map<String, Map<String, String>> m = new HashMap<String, Map<String, String>>();
        List<MessageResource> texts = messageResourceService.loadAllMessages();
        for (MessageResource text : texts) {
        	System.out.println("Msg key "+text.getMessageKey());
        	System.out.println("Msg Text "+text.getMessageText());
        }
        for (MessageResource text : texts) {
            Map<String, String> v = new HashMap<String, String>();
            v.put("en", text.getMessageText());
            m.put(text.getMessageKey(), v);
        }
        return m;
    }
    
    //This method is invoked from main on call of ctx.getMessage("Greeting", null,new Locale("en","us"))
    @Override
    protected MessageFormat resolveCode(String code, Locale locale) {
    	System.out.println("......Inside resolve ......."+code+" ::"+locale);
        String msg = getText(code, locale);
        System.out.println("......Inside resolve ...msg...."+msg);
        MessageFormat result = createMessageFormat(msg, locale);
        return result;
    }
    
    private String getText(String code, Locale locale) {
    //	Map <String, String> p=properties.get(code);
        Map<String, String> localized = properties.get(code);
        System.out.println("Localized Val :"+properties.get(code) +"Locale vale: "+locale);
        String textForCurrentLanguage = null;
        if (localized != null) {
            textForCurrentLanguage = localized.get(locale.getLanguage());
            System.out.println("textForCurrentLanguage :"+textForCurrentLanguage);
            if (textForCurrentLanguage != null) {
            	System.out.println("Language Key :"+Locale.ENGLISH.getLanguage());
                textForCurrentLanguage = localized.get(Locale.ENGLISH.getLanguage());
                System.out.println("in if loop textForCurrentLanguage :"+textForCurrentLanguage);
                
            }
        }
        if (textForCurrentLanguage == null) {
            //Check parent message
            logger.debug("Fallback to properties message");
            try {
                textForCurrentLanguage = getParentMessageSource().getMessage(code, null, locale);
            } catch (Exception e) {
                logger.error("Cannot find message with code: " + code);
            }
        }
        return textForCurrentLanguage != null ? textForCurrentLanguage : code;
    }
	
	  @Override
	    public void setResourceLoader(ResourceLoader resourceLoader) {
	        this.resourceLoader = (resourceLoader != null ? resourceLoader : new DefaultResourceLoader());
	    }
}
