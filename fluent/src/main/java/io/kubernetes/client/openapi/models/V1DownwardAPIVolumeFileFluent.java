package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1DownwardAPIVolumeFileFluent<A extends io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildFieldRef instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ObjectFieldSelector getFieldRef();
    public io.kubernetes.client.openapi.models.V1ObjectFieldSelector buildFieldRef();
    public A withFieldRef(io.kubernetes.client.openapi.models.V1ObjectFieldSelector fieldRef);
    public java.lang.Boolean hasFieldRef();
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.FieldRefNested<A> withNewFieldRef();
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.FieldRefNested<A> withNewFieldRefLike(io.kubernetes.client.openapi.models.V1ObjectFieldSelector item);
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.FieldRefNested<A> editFieldRef();
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.FieldRefNested<A> editOrNewFieldRef();
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.FieldRefNested<A> editOrNewFieldRefLike(io.kubernetes.client.openapi.models.V1ObjectFieldSelector item);
    public java.lang.Integer getMode();
    public A withMode(java.lang.Integer mode);
    public java.lang.Boolean hasMode();
    public java.lang.String getPath();
    public A withPath(java.lang.String path);
    public java.lang.Boolean hasPath();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPath instead.
     */
        public A withNewPath(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildResourceFieldRef instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ResourceFieldSelector getResourceFieldRef();
    public io.kubernetes.client.openapi.models.V1ResourceFieldSelector buildResourceFieldRef();
    public A withResourceFieldRef(io.kubernetes.client.openapi.models.V1ResourceFieldSelector resourceFieldRef);
    public java.lang.Boolean hasResourceFieldRef();
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> withNewResourceFieldRef();
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> withNewResourceFieldRefLike(io.kubernetes.client.openapi.models.V1ResourceFieldSelector item);
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> editResourceFieldRef();
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> editOrNewResourceFieldRef();
    public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> editOrNewResourceFieldRefLike(io.kubernetes.client.openapi.models.V1ResourceFieldSelector item);
    public interface FieldRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectFieldSelectorFluent<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.FieldRefNested<N>> {

            public N and();
            public N endFieldRef();    }


    public interface ResourceFieldRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluent<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<N>> {

            public N and();
            public N endResourceFieldRef();    }


}
