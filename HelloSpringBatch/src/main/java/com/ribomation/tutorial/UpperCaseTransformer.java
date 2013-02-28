package com.ribomation.tutorial;

import org.springframework.batch.item.transform.ItemTransformer;

public class UpperCaseTransformer implements ItemTransformer {
    public Object transform(Object item) throws Exception {
        return item.toString().toUpperCase();
    }
}
