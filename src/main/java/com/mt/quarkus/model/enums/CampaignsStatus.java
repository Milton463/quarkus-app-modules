/*
 * This file is generated by jOOQ.
 */
package com.mt.quarkus.model.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum CampaignsStatus implements EnumType {

    ACTIVE("ACTIVE"),

    RUNNING("RUNNING"),

    PAUSE("PAUSE"),

    TRASH("TRASH"),

    ARCHIVE("ARCHIVE"),

    PAUSING("PAUSING"),

    STARTING("STARTING");

    private final String literal;

    private CampaignsStatus(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return "campaigns_status";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static CampaignsStatus lookupLiteral(String literal) {
        return EnumType.lookupLiteral(CampaignsStatus.class, literal);
    }
}
