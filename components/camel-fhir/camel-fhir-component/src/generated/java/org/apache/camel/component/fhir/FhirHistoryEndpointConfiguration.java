
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for org.apache.camel.component.fhir.api.FhirHistory
 */
@UriParams
@Configurer
public final class FhirHistoryEndpointConfiguration extends FhirConfiguration {

    @UriParam
    private Integer count;

    @UriParam
    private java.util.Date cutoff;

    @UriParam
    private java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> extraParameters;

    @UriParam
    private org.hl7.fhir.instance.model.api.IPrimitiveType<java.util.Date> iCutoff;

    @UriParam
    private org.hl7.fhir.instance.model.api.IIdType id;

    @UriParam
    private Class<org.hl7.fhir.instance.model.api.IBaseResource> resourceType;

    @UriParam
    private Class<org.hl7.fhir.instance.model.api.IBaseBundle> returnType;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public java.util.Date getCutoff() {
        return cutoff;
    }

    public void setCutoff(java.util.Date cutoff) {
        this.cutoff = cutoff;
    }

    public java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> getExtraParameters() {
        return extraParameters;
    }

    public void setExtraParameters(java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> extraParameters) {
        this.extraParameters = extraParameters;
    }

    public org.hl7.fhir.instance.model.api.IPrimitiveType<java.util.Date> getICutoff() {
        return iCutoff;
    }

    public void setICutoff(org.hl7.fhir.instance.model.api.IPrimitiveType<java.util.Date> iCutoff) {
        this.iCutoff = iCutoff;
    }

    public org.hl7.fhir.instance.model.api.IIdType getId() {
        return id;
    }

    public void setId(org.hl7.fhir.instance.model.api.IIdType id) {
        this.id = id;
    }

    public Class<org.hl7.fhir.instance.model.api.IBaseResource> getResourceType() {
        return resourceType;
    }

    public void setResourceType(Class<org.hl7.fhir.instance.model.api.IBaseResource> resourceType) {
        this.resourceType = resourceType;
    }

    public Class<org.hl7.fhir.instance.model.api.IBaseBundle> getReturnType() {
        return returnType;
    }

    public void setReturnType(Class<org.hl7.fhir.instance.model.api.IBaseBundle> returnType) {
        this.returnType = returnType;
    }
}