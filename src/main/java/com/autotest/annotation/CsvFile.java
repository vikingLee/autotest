package com.autotest.annotation;

import com.autotest.extension.CsvFileProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.lang.annotation.*;

/**
 * Created by ychaoyang on 2017/7/14.
 */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ArgumentsSource(CsvFileProvider.class)
public @interface CsvFile {
	String file();

	String encoding() default "UTF-8";

	String lineSeparator() default "\n";

	char delimiter() default ',';
}