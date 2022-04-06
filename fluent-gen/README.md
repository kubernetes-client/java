# Instructions for rebuilding fluents

## Step zero
Start from a totally clean environment (eg. a clean VM if you can), clone everything.

## Step one
`mvn -Pfluent-gen install`

## Step two
```
cd fluent-gen; ./generate.sh
```

## Step four
Comment the above modules back into the pom.xml

## Step five
`mvn install`