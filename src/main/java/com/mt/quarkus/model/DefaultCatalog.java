/*
 * This file is generated by jOOQ.
 */
package com.mt.quarkus.model;


import java.util.Arrays;
import java.util.List;

import org.jooq.Constants;
import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultCatalog extends CatalogImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DEFAULT_CATALOG</code>
     */
    public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();

    /**
     * The schema <code>bulk_email_tenant_01</code>.
     */
    public final BulkEmailTenant_01 BULK_EMAIL_TENANT_01 = BulkEmailTenant_01.BULK_EMAIL_TENANT_01;

    /**
     * No further instances allowed
     */
    private DefaultCatalog() {
        super("");
    }

    @Override
    public final List<Schema> getSchemas() {
        return Arrays.asList(
            BulkEmailTenant_01.BULK_EMAIL_TENANT_01
        );
    }

    /**
     * A reference to the 3.17 minor release of the code generator. If this
     * doesn't compile, it's because the runtime library uses an older minor
     * release, namely: 3.17. You can turn off the generation of this reference
     * by specifying /configuration/generator/generate/jooqVersionReference
     */
    private static final String REQUIRE_RUNTIME_JOOQ_VERSION = Constants.VERSION_3_17;
}
