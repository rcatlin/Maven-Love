Maven-Love
==========

A simple java project using [Maven](http://maven.apache.org/) and [Http-Request](https://github.com/kevinsawicki/http-request).

[Http-Request](http://github.com/kevinsawicki/http-request) is defined as a dependency in the `pom.xml` file and installed via Maven.

##Instructions

Maven must be installed on your environment. Follow the step-by-step instructions on installing Maven here: http://maven.apache.org/download.cgi

##The "how" and the "what"

####Create a new Maven project

`mvn archetype:generate -D groupId=com.ryancatlin.request -D artifactId=request -DarchetypeArtifactId=maven-archetype-quickstart -D interactiveMode=false`

####Add a dependency

```java
    <dependency>
      <groupId>com.github.kevinsawicki</groupId>
      <artifactId>http-request</artifactId>
      <version>5.6</version>
    </dependency>
```

####Use that dependency

In `src/main/java/com/ryancatlin/request/App.java`, add the following:

```java
import com.github.kevinsawicki.http.*;

public class App 
{
    public static void main( String[] args )
    {
        String quotesUrl = "http://www.iheartquotes.com/api/v1/random";
        HttpRequest request = HttpRequest.get(quotesUrl);

        int code = request.code();
        if (code == 200) {
            String body = request.body();
            System.out.println(body);
        } else {
            System.out.println("Unsuccessfull." + " " + code);
        }
    }
}
```

####Execute

`mvn exec:java -D exec.mainClass="com.ryancatlin.request.App"`

Output of running the above command:

```
[INFO] Scanning for projects...
[INFO] 
[INFO] Using the builder org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder with a thread count of 1
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building request 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] >>> exec-maven-plugin:1.2.1:java (default-cli) @ request >>>
[INFO] 
[INFO] <<< exec-maven-plugin:1.2.1:java (default-cli) @ request <<<
[INFO] 
[INFO] --- exec-maven-plugin:1.2.1:java (default-cli) @ request ---
Anything is good if it's made of chocolate.

[fortune] http://iheartquotes.com/fortune/show/46485

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.679 s
[INFO] Finished at: 2014-04-19T15:21:41-05:00
[INFO] Final Memory: 6M/265M
[INFO] ------------------------------------------------------------------------
```


####Laugh at how easy that was.

That was pretty dang easy.


