package io.kubernetes.client.fluent;

import java.util.Optional;
import java.util.ArrayList;
import java.lang.String;
import java.lang.reflect.GenericArrayType;
import java.util.LinkedHashMap;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.Class;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
public final class Visitors{
  private Visitors() {
    //Utility Class
  }
  
  
  public static <T>Visitor<T> newVisitor(Class<T> type,Visitor<T> visitor) {
    return new DelegatingVisitor<T>(type, visitor);
  }
  
  protected static <T>List<Class> getTypeArguments(Class<T> baseClass,Class<? extends T> childClass) {
    Map<Type, Type> resolvedTypes = new LinkedHashMap<Type, Type>();
        Type type = childClass;
        // start walking up the inheritance hierarchy until we hit baseClass
        for (Class cl = getClass(type); cl != null && cl != Object.class
            && !baseClass.getName().equals(cl.getName()); cl = getClass(type)) {
          if (type instanceof Class) {
            Class c = (Class) type;
            Optional<Type> nextInterface = baseClass.isInterface() ? getMatchingInterface(baseClass, c.getGenericInterfaces())
                : Optional.empty();
            if (nextInterface.isPresent()) {
              type = nextInterface.get();
            } else {
              // there is no useful information for us in raw types, so just keep going.
              type = ((Class) type).getGenericSuperclass();
            }
          } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type t = parameterizedType.getRawType();
            if (t instanceof Class) {
              Class<?> rawType = (Class) parameterizedType.getRawType();
    
              Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
              TypeVariable<?>[] typeParameters = rawType.getTypeParameters();
              for (int i = 0; i < actualTypeArguments.length; i++) {
                resolvedTypes.put(typeParameters[i], actualTypeArguments[i]);
              }
    
              if (!baseClass.equals(rawType)) {
                type = rawType.getGenericSuperclass();
              }
            } else {
              break;
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
        List<Class> typeArgumentsAsClasses = new ArrayList<Class>();
        // resolve types by chasing down type variables.
        for (Type baseType : actualTypeArguments) {
          while (resolvedTypes.containsKey(baseType)) {
            baseType = resolvedTypes.get(baseType);
          }
          typeArgumentsAsClasses.add(getClass(baseType));
        }
        return typeArgumentsAsClasses;
  }
  
  private static String getRawName(Type type) {
    return type instanceof ParameterizedType ? ((ParameterizedType) type).getRawType().getTypeName() : type.getTypeName();
  }
  
  private static Class<?> getClass(Type type) {
    if (type instanceof Class) {
          return (Class) type;
        } else if (type instanceof ParameterizedType) {
          return getClass(((ParameterizedType) type).getRawType());
        } else if (type instanceof GenericArrayType) {
          Type componentType = ((GenericArrayType) type).getGenericComponentType();
          Class<?> componentClass = getClass(componentType);
          if (componentClass != null) {
            return Array.newInstance(componentClass, 0).getClass();
          } else {
            return null;
          }
        } else {
          return null;
        }
  }
  
  private static <T>Optional<Type> getMatchingInterface(Class<?> targetInterface,java.lang.reflect.Type... candidates) {
    if (candidates == null || candidates.length == 0) {
          return Optional.empty();
        }
        Optional<Type> match = Arrays.stream(candidates).filter(c -> getRawName(c).equals(targetInterface.getTypeName()))
            .findFirst();
        if (match.isPresent()) {
          return match;
        } else {
          for (Type candidate : candidates) {
            if (candidate instanceof Class) {
              Class c = (Class) candidate;
              Optional<Type> next = getMatchingInterface(targetInterface, c.getGenericInterfaces());
              if (next.isPresent()) {
                return Optional.of(c);
              }
            }
          }
          return Optional.empty();
        }
  }
  

}