package com.ribomation.tutorial;

import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.FlushFailedException;
import org.springframework.batch.item.ClearFailedException;
import org.apache.log4j.Logger;

public class LogWriter implements ItemWriter {
    private Logger log = Logger.getLogger(this.getClass());

    public void write(Object item) throws Exception {
        log.info(item);
    }

    public void flush() throws FlushFailedException {
    }

    public void clear() throws ClearFailedException {
    }
}
