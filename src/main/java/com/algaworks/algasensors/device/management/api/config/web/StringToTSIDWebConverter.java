package com.algaworks.algasensors.device.management.api.config.web;

import io.hypersistence.tsid.TSID;
import org.springframework.core.convert.converter.Converter;

/**
 * Esta classe poderia ser uma @Component, dispensando que ela fosse adicionada ao WebConfig
 */
public class StringToTSIDWebConverter implements Converter<String, TSID> {

    @Override
    public TSID convert(String source) {
        return TSID.from(source);
    }
}