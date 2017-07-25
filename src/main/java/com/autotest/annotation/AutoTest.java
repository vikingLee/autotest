package com.autotest.annotation;

import com.autotest.extension.AutoTestExtension;
import com.autotest.extension.CsvFileProvider;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.platform.commons.meta.API;

import java.lang.annotation.*;

import static org.junit.platform.commons.meta.API.Usage.Experimental;

/**
 * Created by ychaoyang on 2017/7/13.
 */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@API(Experimental)
@TestTemplate
@ExtendWith(AutoTestExtension.class)
@ArgumentsSource(CsvFileProvider.class)
public @interface AutoTest {

    String name() default "[{index}] {arguments}";

    String file();

    String encoding() default "UTF-8";
}