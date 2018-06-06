package com.ayto.proyecto.seguridad;

import java.io.Serializable;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.access.expression.SecurityExpressionOperations;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.expression.DefaultWebSecurityExpressionHandler;
import org.springframework.security.web.access.expression.WebSecurityExpressionRoot;
import org.springframework.stereotype.Component;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.FilterInvocation;
@Component
public class AytoEvaluarPermiso extends DefaultWebSecurityExpressionHandler{//implements PermissionEvaluator{
	private final AuthenticationTrustResolver trustResolver = new AuthenticationTrustResolverImpl();
	public boolean hasPermission(Authentication authentication,
			Object targetDomainObject, Object permission) {

		return false;
	}

	public boolean hasPermission(Authentication authentication,
			Serializable targetId, String targetType, Object permission) {

		return false;
	}
	
	 /*@Override      
     public EvaluationContext createEvaluationContext(Authentication a,
               FilterInvocation f) {
         StandardEvaluationContext ctx =
                  (StandardEvaluationContext) super.createEvaluationContext(a, f);

          AytoSeguridadWeb myRoot =
                   new AytoSeguridadWeb(a, f);

          ctx.setRootObject(myRoot);
          return ctx;
     }/**/
	 @Override        
     public SecurityExpressionOperations createSecurityExpressionRoot(
               Authentication a,
               FilterInvocation f) {
		 AytoSeguridadWeb myRoot =
                   new AytoSeguridadWeb(a, f);

          myRoot.setPermissionEvaluator(getPermissionEvaluator());
          myRoot.setTrustResolver(trustResolver);
          myRoot.setRoleHierarchy(getRoleHierarchy());
          return myRoot;
     }
}
