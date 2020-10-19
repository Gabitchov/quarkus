package io.quarkus.devtools.codestarts;

import java.util.Collection;

import io.quarkus.devtools.codestarts.core.GenericCodestartCatalog;

public class QuarkusNewExtensionCodestartCatalog extends GenericCodestartCatalog<QuarkusCodestartProjectInput> {

    public QuarkusNewExtensionCodestartCatalog(Collection<Codestart> codestarts) {
        super(codestarts);
    }

}