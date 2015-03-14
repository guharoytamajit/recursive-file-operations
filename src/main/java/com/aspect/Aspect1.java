package com.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspect1 {

	@Pointcut("execution(public * get*())")
	/*
	 * execution has the following pattern: execution(modifiers-pattern?
	 * ret-type-pattern declaring-type-pattern? name-pattern(param-pattern)
	 * throws-pattern?)
	 */
	public void getter() {

	}

	@Pointcut("execution(public com.model.Collar *())")
	public void collarReturner() {

	}

	@Pointcut("execution(public void set*(*))")
	/*
	 * If we pass * in method param it specifies 1 or more input param And If we
	 * pass .. in method param it specifies 0 or more input param
	 */
	public void setter() {

	}

	@Pointcut("within(com.model.Collar)")
	/*
	 * similarly @Pointcut("within(com.model.*)") ie all classes in com.model
	 * package And @Pointcut("within(com..*)") ie all classes in com and
	 * sub-packages
	 */
	public void withinCollar() {

	}

	@Pointcut("args(com.model.Collar)")
	public void collarAcceptor() {

	}

	@Pointcut("execution(public * *(..))")
	private void anyPublicOperation() {
	}

	@Before("collarReturner() && getter()")
	public void advice1() {
		System.out.println("called before collarReturner() && getter()");
	}

	@After("setter() || getter()")
	public void advice2() {
		System.out.println("called after setter() || getter()");
	}

	@Before("!collarReturner() && getter()")
	public void advice3() {
		System.out.println("called before !collarReturner() && getter()");
	}

	@Before("collarAcceptor()")
	public void advice4() {
		System.out.println("called before collarAcceptor()");
	}

}
