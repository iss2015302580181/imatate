package com.h3c.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnnotationTypeMapping {

    private AttributeMethods attributes;

    private Map<Method, List<Method>> aliasBy;

    private AnnotationTypeMapping source;

    private Annotation annotation;

    private AnnotationTypeMapping(Annotation annotation,AnnotationTypeMapping source) {

        this.annotation=annotation;
        this.source=source;
        this.attributes=AttributeMethods.forAnnotation(annotation);
        this.aliasBy=resolveForAlias();
    }

    private Map<Method,List<Method>> resolveForAlias(){
        for (int i = 0; i < attributes.size(); i++) {
            Method attribute= attributes.get(i);
            //AliseFor aliseFor=AnnotationsScanner.getDeclaredAnnotation(target,AliseFor.class);

        }
        return null;
    }




//    static AnnotationTypeMapping forAnnotation(Annotation annotation){
//        return new AnnotationTypeMapping(annotation);
//    }
}
