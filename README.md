# svrf-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AuthenticateApi;

import java.io.File;
import java.util.*;

public class AuthenticateApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        

        AuthenticateApi apiInstance = new AuthenticateApi();
        
        Body body = new Body(); // Body | 
        
        try {
            InlineResponse2001 result = apiInstance.appAuthenticatePost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticateApi#appAuthenticatePost");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.svrf.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticateApi* | [**appAuthenticatePost**](docs/AuthenticateApi.md#appAuthenticatePost) | **POST** /app/authenticate | Authenticate application
*MediaApi* | [**vrIdGet**](docs/MediaApi.md#vrIdGet) | **GET** /vr/{id} | Media by ID Endpoint
*MediaApi* | [**vrSearchqqGet**](docs/MediaApi.md#vrSearchqqGet) | **GET** /vr/search?q&#x3D;{q} | Search Endpoint
*MediaApi* | [**vrTrendingGet**](docs/MediaApi.md#vrTrendingGet) | **GET** /vr/trending | Trending Endpoint


## Documentation for Models

 - [APIKey](docs/APIKey.md)
 - [BasicResponse](docs/BasicResponse.md)
 - [Body](docs/Body.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [InlineResponse404](docs/InlineResponse404.md)
 - [Media](docs/Media.md)
 - [MediaFiles](docs/MediaFiles.md)
 - [MediaImages](docs/MediaImages.md)
 - [MediaStereo](docs/MediaStereo.md)
 - [MediaVideos](docs/MediaVideos.md)
 - [RateLimitResponse](docs/RateLimitResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### XAppToken

- **Type**: API key
- **API key parameter name**: x-app-token
- **Location**: HTTP header






## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

api@svrf.com

