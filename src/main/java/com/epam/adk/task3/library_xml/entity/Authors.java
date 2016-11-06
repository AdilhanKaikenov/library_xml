package com.epam.adk.task3.library_xml.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * The class Authors. Created on 03.11.2016.
 *
 * @author Kaikenov Adilhan.
 */
@XmlType(name = "Authors", propOrder = { "authors" })
public class Authors {

    private List<Author> authors;

    public Authors() {
        authors = new ArrayList<>();
    }

    public Authors(List<Author> authors) {
        this.authors = authors;
    }

    @XmlElement(namespace = "http://epam-xml-library.com/library_xml")
    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public boolean add(Author author){
        return authors.add(author);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t -> authors: ");
        for (Author author : authors){
            sb.append(author);
        }
        return sb.toString();
    }
}
