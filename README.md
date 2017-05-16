# HBase Demo

```
mvn compile
```

```
mvn test
```
or

```
mvn exec:java -Dexec.mainClass="io.yunplus.Hbase" -Dexec.args="100"
```

```
cd /home/project/demo/hbase-demo && git pull && mvn compile && mvn exec:java -Dexec.mainClass="io.yunplus.Hbase" -Dexec.args="100"
```

```
mvn exec:exec -Dexec.executable="java" -Dexec.args="-Xmx1024m -classpath %classpath io.yunplus.Hbase 10000"
```