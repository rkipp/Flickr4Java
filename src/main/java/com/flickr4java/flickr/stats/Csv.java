package com.flickr4java.flickr.stats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * For the flickr.stats.getCSVFiles call.
 * 
 * @author Darren Greaves
 * @version $Id$ Copyright (c) 2012 Darren Greaves.
 */
public class Csv {

    /**
     * Logger.
     */
    @SuppressWarnings("unused")
    private static Logger _log = LoggerFactory.getLogger(Csv.class);

    private String href;

    private String type;

    private Date date;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
