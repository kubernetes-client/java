# Instructions for rebuilding fluents

## Step zero
Start from a totally clean environment (eg. a clean VM if you can), clone everything.

## Step one
Comment out the existing fluent module from the pom.xml

```xml
...
<!--
  <module>fluent</module>
  <module>spring</module>
  <module>e2e</module>
  <module>examples</module>
-->
...
```

## Step two
`mvn install`

## Step three
```
cd fluent-gen; ./generate.sh
```

## Step four
Comment the above modules back into the pom.xml

## Step five
`mvn install`