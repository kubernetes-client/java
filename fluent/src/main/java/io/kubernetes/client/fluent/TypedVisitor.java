package io.kubernetes.client.fluent;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.lang.Class;
import java.util.List;
import java.lang.reflect.GenericArrayType;
import java.util.Map;
import java.util.LinkedHashMap;

public abstract class TypedVisitor<V> implements io.kubernetes.client.fluent.Visitor<V> {


    public java.lang.Class<V> getType() {
        return (Class<V>) getTypeArguments(TypedVisitor.class, getClass()).get(0);
    }

    java.lang.Class<?> getClass(java.lang.reflect.Type type) {
        if (type instanceof Class) {return (Class) type;} else if (type instanceof ParameterizedType) {return getClass(((ParameterizedType) type).getRawType());} else if (type instanceof GenericArrayType) {Type componentType = ((GenericArrayType) type).getGenericComponentType(); Class<?> componentClass = getClass(componentType); if (componentClass != null) {return Array.newInstance(componentClass, 0).getClass();} else {return null;}} else {return null;}
    }

    <T>java.util.List<java.lang.Class<?>> getTypeArguments(java.lang.Class<T> baseClass,java.lang.Class<? extends T> childClass) {
            Map<Type, Type> resolvedTypes = new LinkedHashMap<>();
            Type type = childClass;
            // start walking up the inheritance hierarchy until we hit baseClass
            while (!getClass(type).equals(baseClass)) {
              if (type instanceof Class) {
                // there is no useful information for us in raw types, so just keep going.
                type = ((Class) type).getGenericSuperclass();
              } else {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class<?> rawType = (Class) parameterizedType.getRawType();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                TypeVariable<?>[] typeParameters = rawType.getTypeParameters();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                  resolvedTypes.put(typeParameters[i], actualTypeArguments[i]);
                }
                if (!rawType.equals(baseClass)) {
                  type = rawType.getGenericSuperclass();
                }
              }
            }
            // finally, for each actual type argument provided to baseClass, determine (if possible)
            // the raw class for that type argument.
            Type[] actualTypeArguments;
            if (type instanceof Class) {
              actualTypeArguments = ((Class) type).getTypeParameters();
            } else {
              actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            }
            List<Class<?>> typeArgumentsAsClasses = new ArrayList<>();
            // resolve types by chasing down type variables.
            for (Type baseType : actualTypeArguments) {
              while (resolvedTypes.containsKey(baseType)) {
                baseType = resolvedTypes.get(baseType);
              }
              typeArgumentsAsClasses.add(getClass(baseType));
            }
            return typeArgumentsAsClasses;
    }

}
