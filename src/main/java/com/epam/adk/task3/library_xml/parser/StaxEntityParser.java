package com.epam.adk.task3.library_xml.parser;

import com.epam.adk.task3.library_xml.entity.BaseEntity;

import java.io.InputStream;
import java.util.List;

/**
 * The StaxEntityParser class. Created on 03.11.2016.
 *
 * @author Kaikenov Adilhan.
 */
public class StaxEntityParser implements EntityParser {

    @Override
    public <T extends BaseEntity> T parse(InputStream inputStream, Class<T> clazz) {
        return null;
    }

    @Override
    public <T extends BaseEntity> List<T> parse(InputStream inputStream, List list, Class<T> clazz) {
        return null;
    }
}
