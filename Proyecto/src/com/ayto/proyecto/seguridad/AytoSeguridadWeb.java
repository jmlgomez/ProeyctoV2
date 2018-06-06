package com.ayto.proyecto.seguridad;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.ExceptionTranslationFilter;
import org.springframework.security.web.access.expression.WebSecurityExpressionRoot;
import org.springframework.stereotype.Component;
import org.springframework.webflow.execution.RequestContext;
import org.springframework.webflow.execution.RequestContextHolder;

public class AytoSeguridadWeb extends WebSecurityExpressionRoot {

	public AytoSeguridadWeb(Authentication a, FilterInvocation fi) {
		super(a, fi);

	}
	public boolean aytoValidar(){

		boolean valido=true;
		if(isAnonymous()){
		}
		return !isAnonymous() && valido;//&& authentication.getAuthorities().contains("usuario");
	}

}
