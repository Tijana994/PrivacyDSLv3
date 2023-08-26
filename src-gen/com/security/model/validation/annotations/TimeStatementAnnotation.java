package com.security.model.validation.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import privacyModel.TimePreposition;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface TimeStatementAnnotation {
	TimePreposition preposition();
}
