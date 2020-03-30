# kotlin-quarkus-test
Testing out Kotlin [data-science libraries](https://kotlinlang.org/docs/reference/data-science-overview.html) 
with [Quarkus](https://quarkus.io/).

## Libraries

* [krangl](https://github.com/holgerbrandl/krangl)
* [krangl in 10min](https://krangl.gitbook.io/docs/getting-started/10_minutes)


## Compilation

Use Maven 3 to compile the code:

```
mvn clean install
```

## Execution

Once compiled, you can execute the example Main class like this:

```
java -jar target/kqt-0.0.1-SNAPSHOT-jar-with-dependencies.jar /some/where/iris.txt
```

You can download the Iris dataset from 
[here](https://raw.githubusercontent.com/holgerbrandl/krangl/master/src/main/resources/krangl/data/iris.txt).
