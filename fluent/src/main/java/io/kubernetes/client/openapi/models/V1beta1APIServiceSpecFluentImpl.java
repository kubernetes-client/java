package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Byte;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class V1beta1APIServiceSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1APIServiceSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1APIServiceSpecFluent<A> {

    private java.util.List<java.lang.Byte> caBundle;
    private java.lang.String group;
    private java.lang.Integer groupPriorityMinimum;
    private java.lang.Boolean insecureSkipTLSVerify;
    private io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReferenceBuilder service;
    private java.lang.String version;
    private java.lang.Integer versionPriority;

    public V1beta1APIServiceSpecFluentImpl() {
    }

    public V1beta1APIServiceSpecFluentImpl(io.kubernetes.client.openapi.models.V1beta1APIServiceSpec instance) {
        this.withCaBundle(instance.getCaBundle());
        
        this.withGroup(instance.getGroup());
        
        this.withGroupPriorityMinimum(instance.getGroupPriorityMinimum());
        
        this.withInsecureSkipTLSVerify(instance.getInsecureSkipTLSVerify());
        
        this.withService(instance.getService());
        
        this.withVersion(instance.getVersion());
        
        this.withVersionPriority(instance.getVersionPriority());
    }

    public A withCaBundle(byte... caBundle) {
        if (this.caBundle != null) {this.caBundle.clear();}
        if (caBundle != null) {for (byte item :caBundle){ this.addToCaBundle(item);}} return (A) this;
    }

    public byte[] getCaBundle() {
        //This needs to work with primitives, so we use arrays.
        int size = caBundle != null ? caBundle.size() : 0;
        byte[] result = new byte[size];
        if (size == 0) {
           return result;
        }
        int index = 0;
        for (byte item : caBundle) {
            result[index++]=item;
        }
        return result;
    }

    public A addToCaBundle(int index,java.lang.Byte item) {
        if (this.caBundle == null) {this.caBundle =  new java.util.ArrayList<java.lang.Byte>();}
        this.caBundle.add(index, item);
        return (A)this;
    }

    public A setToCaBundle(int index,java.lang.Byte item) {
        if (this.caBundle == null) {this.caBundle =  new java.util.ArrayList<java.lang.Byte>();}
        this.caBundle.set(index, item); return (A)this;
    }

    public A addToCaBundle(java.lang.Byte... items) {
        if (this.caBundle == null) {this.caBundle =  new java.util.ArrayList<java.lang.Byte>();}
        for (java.lang.Byte item : items) {this.caBundle.add(item);} return (A)this;
    }

    public A addAllToCaBundle(java.util.Collection<java.lang.Byte> items) {
        if (this.caBundle == null) {this.caBundle =  new java.util.ArrayList<java.lang.Byte>();}
        for (java.lang.Byte item : items) {this.caBundle.add(item);} return (A)this;
    }

    public A removeFromCaBundle(java.lang.Byte... items) {
        for (java.lang.Byte item : items) {if (this.caBundle!= null){ this.caBundle.remove(item);}} return (A)this;
    }

    public A removeAllFromCaBundle(java.util.Collection<java.lang.Byte> items) {
        for (java.lang.Byte item : items) {if (this.caBundle!= null){ this.caBundle.remove(item);}} return (A)this;
    }

    public java.lang.Boolean hasCaBundle() {
        return caBundle != null && !caBundle.isEmpty();
    }

    public java.lang.String getGroup() {
        return this.group;
    }

    public A withGroup(java.lang.String group) {
        this.group=group; return (A) this;
    }

    public java.lang.Boolean hasGroup() {
        return this.group != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGroup instead.
     */
        public A withNewGroup(java.lang.String original) {
        return (A)withGroup(new String(original));
    }

    public java.lang.Integer getGroupPriorityMinimum() {
        return this.groupPriorityMinimum;
    }

    public A withGroupPriorityMinimum(java.lang.Integer groupPriorityMinimum) {
        this.groupPriorityMinimum=groupPriorityMinimum; return (A) this;
    }

    public java.lang.Boolean hasGroupPriorityMinimum() {
        return this.groupPriorityMinimum != null;
    }

    public java.lang.Boolean getInsecureSkipTLSVerify() {
        return this.insecureSkipTLSVerify;
    }

    public A withInsecureSkipTLSVerify(java.lang.Boolean insecureSkipTLSVerify) {
        this.insecureSkipTLSVerify=insecureSkipTLSVerify; return (A) this;
    }

    public java.lang.Boolean hasInsecureSkipTLSVerify() {
        return this.insecureSkipTLSVerify != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildService instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReference getService() {
        return this.service!=null?this.service.build():null;
    }

    public io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReference buildService() {
        return this.service!=null?this.service.build():null;
    }

    public A withService(io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReference service) {
        _visitables.get("service").remove(this.service);
        if (service!=null){ this.service= new io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReferenceBuilder(service); _visitables.get("service").add(this.service);} return (A) this;
    }

    public java.lang.Boolean hasService() {
        return this.service != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1APIServiceSpecFluent.ServiceNested<A> withNewService() {
        return new io.kubernetes.client.openapi.models.V1beta1APIServiceSpecFluentImpl.ServiceNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1APIServiceSpecFluent.ServiceNested<A> withNewServiceLike(io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReference item) {
        return new io.kubernetes.client.openapi.models.V1beta1APIServiceSpecFluentImpl.ServiceNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1APIServiceSpecFluent.ServiceNested<A> editService() {
        return withNewServiceLike(getService());
    }

    public io.kubernetes.client.openapi.models.V1beta1APIServiceSpecFluent.ServiceNested<A> editOrNewService() {
        return withNewServiceLike(getService() != null ? getService(): new io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReferenceBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1APIServiceSpecFluent.ServiceNested<A> editOrNewServiceLike(io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReference item) {
        return withNewServiceLike(getService() != null ? getService(): item);
    }

    public java.lang.String getVersion() {
        return this.version;
    }

    public A withVersion(java.lang.String version) {
        this.version=version; return (A) this;
    }

    public java.lang.Boolean hasVersion() {
        return this.version != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVersion instead.
     */
        public A withNewVersion(java.lang.String original) {
        return (A)withVersion(new String(original));
    }

    public java.lang.Integer getVersionPriority() {
        return this.versionPriority;
    }

    public A withVersionPriority(java.lang.Integer versionPriority) {
        this.versionPriority=versionPriority; return (A) this;
    }

    public java.lang.Boolean hasVersionPriority() {
        return this.versionPriority != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1APIServiceSpecFluentImpl that = (V1beta1APIServiceSpecFluentImpl) o;
        if (caBundle != null ? !caBundle.equals(that.caBundle) :that.caBundle != null) return false;
        if (group != null ? !group.equals(that.group) :that.group != null) return false;
        if (groupPriorityMinimum != null ? !groupPriorityMinimum.equals(that.groupPriorityMinimum) :that.groupPriorityMinimum != null) return false;
        if (insecureSkipTLSVerify != null ? !insecureSkipTLSVerify.equals(that.insecureSkipTLSVerify) :that.insecureSkipTLSVerify != null) return false;
        if (service != null ? !service.equals(that.service) :that.service != null) return false;
        if (version != null ? !version.equals(that.version) :that.version != null) return false;
        if (versionPriority != null ? !versionPriority.equals(that.versionPriority) :that.versionPriority != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(caBundle,  group,  groupPriorityMinimum,  insecureSkipTLSVerify,  service,  version,  versionPriority,  super.hashCode());
    }

    public class ServiceNestedImpl<N> extends io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReferenceFluentImpl<io.kubernetes.client.openapi.models.V1beta1APIServiceSpecFluent.ServiceNested<N>> implements io.kubernetes.client.openapi.models.V1beta1APIServiceSpecFluent.ServiceNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReferenceBuilder builder;

            ServiceNestedImpl(io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReference item) {
                this.builder = new io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReferenceBuilder(this, item);
                        
            }

            ServiceNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.ApiregistrationV1beta1ServiceReferenceBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1APIServiceSpecFluentImpl.this.withService(builder.build());
            }

            public N endService() {
                return and();
            }
    }


}
