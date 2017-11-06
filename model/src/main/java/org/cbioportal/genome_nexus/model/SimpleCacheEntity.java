package org.cbioportal.genome_nexus.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Selcuk Onur Sumer
 */
@Document(collection = "simple_cache")
public class SimpleCacheEntity
{
    @Id
    private String key;
    private String value;

    public SimpleCacheEntity(String key, String value)
    {
        this.key = key;
        this.value = value;
    }

    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }
}
