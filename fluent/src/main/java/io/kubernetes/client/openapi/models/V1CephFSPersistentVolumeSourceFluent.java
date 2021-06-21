package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1CephFSPersistentVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToMonitors(int index,java.lang.String item);
    public A setToMonitors(int index,java.lang.String item);
    public A addToMonitors(java.lang.String... items);
    public A addAllToMonitors(java.util.Collection<java.lang.String> items);
    public A removeFromMonitors(java.lang.String... items);
    public A removeAllFromMonitors(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getMonitors();
    public java.lang.String getMonitor(int index);
    public java.lang.String getFirstMonitor();
    public java.lang.String getLastMonitor();
    public java.lang.String getMatchingMonitor(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingMonitor(java.util.function.Predicate<java.lang.String> predicate);
    public A withMonitors(java.util.List<java.lang.String> monitors);
    public A withMonitors(java.lang.String... monitors);
    public java.lang.Boolean hasMonitors();
    public A addNewMonitor(java.lang.String original);
    public java.lang.String getPath();
    public A withPath(java.lang.String path);
    public java.lang.Boolean hasPath();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPath instead.
     */
        public A withNewPath(java.lang.String original);
    public java.lang.Boolean getReadOnly();
    public A withReadOnly(java.lang.Boolean readOnly);
    public java.lang.Boolean hasReadOnly();
    public java.lang.String getSecretFile();
    public A withSecretFile(java.lang.String secretFile);
    public java.lang.Boolean hasSecretFile();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSecretFile instead.
     */
        public A withNewSecretFile(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSecretRef instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1SecretReference getSecretRef();
    public io.kubernetes.client.openapi.models.V1SecretReference buildSecretRef();
    public A withSecretRef(io.kubernetes.client.openapi.models.V1SecretReference secretRef);
    public java.lang.Boolean hasSecretRef();
    public io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
    public io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);
    public io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef();
    public io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
    public io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);
    public java.lang.String getUser();
    public A withUser(java.lang.String user);
    public java.lang.Boolean hasUser();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withUser instead.
     */
        public A withNewUser(java.lang.String original);
    public interface SecretRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1SecretReferenceFluent<io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent.SecretRefNested<N>> {

            public N and();
            public N endSecretRef();    }


}
