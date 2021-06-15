package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import java.lang.Boolean;
import java.util.Map;

public interface V1VolumeAttachmentStatusFluent<A extends io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildAttachError instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1VolumeError getAttachError();
    public io.kubernetes.client.openapi.models.V1VolumeError buildAttachError();
    public A withAttachError(io.kubernetes.client.openapi.models.V1VolumeError attachError);
    public java.lang.Boolean hasAttachError();
    public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A> withNewAttachError();
    public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A> withNewAttachErrorLike(io.kubernetes.client.openapi.models.V1VolumeError item);
    public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A> editAttachError();
    public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A> editOrNewAttachError();
    public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A> editOrNewAttachErrorLike(io.kubernetes.client.openapi.models.V1VolumeError item);
    public java.lang.Boolean getAttached();
    public A withAttached(java.lang.Boolean attached);
    public java.lang.Boolean hasAttached();
    public A addToAttachmentMetadata(java.lang.String key,java.lang.String value);
    public A addToAttachmentMetadata(java.util.Map<java.lang.String,java.lang.String> map);
    public A removeFromAttachmentMetadata(java.lang.String key);
    public A removeFromAttachmentMetadata(java.util.Map<java.lang.String,java.lang.String> map);
    public java.util.Map<java.lang.String,java.lang.String> getAttachmentMetadata();
    public <K,V>A withAttachmentMetadata(java.util.Map<java.lang.String,java.lang.String> attachmentMetadata);
    public java.lang.Boolean hasAttachmentMetadata();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildDetachError instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1VolumeError getDetachError();
    public io.kubernetes.client.openapi.models.V1VolumeError buildDetachError();
    public A withDetachError(io.kubernetes.client.openapi.models.V1VolumeError detachError);
    public java.lang.Boolean hasDetachError();
    public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A> withNewDetachError();
    public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A> withNewDetachErrorLike(io.kubernetes.client.openapi.models.V1VolumeError item);
    public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A> editDetachError();
    public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A> editOrNewDetachError();
    public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A> editOrNewDetachErrorLike(io.kubernetes.client.openapi.models.V1VolumeError item);
    public interface AttachErrorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1VolumeErrorFluent<io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<N>> {

            public N and();
            public N endAttachError();    }


    public interface DetachErrorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1VolumeErrorFluent<io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<N>> {

            public N and();
            public N endDetachError();    }


}
