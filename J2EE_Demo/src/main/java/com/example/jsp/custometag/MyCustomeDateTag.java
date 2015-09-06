package com.example.jsp.custometag;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @author Maulik
 * 
 */
public class MyCustomeDateTag extends TagSupport {

	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() throws JspException {
		System.out.println("MyCustomeDateTag :::  In Start Tag ......!!!");
		JspWriter jspWriter = pageContext.getOut();
		try {
			jspWriter.print(Calendar.getInstance().getTime());
		} catch (IOException e) {
			System.out.println(e);
		}
		return SKIP_BODY;
	}

	@Override
	public int doAfterBody() throws JspException {
		System.out.println("MyCustomeDateTag :::  In After Body Tag ......!!!");
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		System.out.println("MyCustomeDateTag :::  In End Tag ......!!!");
		return EVAL_PAGE;
	}

}
