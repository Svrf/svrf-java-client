# svrf-client

SVRF API
- API version: 1.0.0

  For more information, please visit [https://github.com/svrf/svrf-api](https://github.com/svrf/svrf-api)

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.svrf.client</groupId>
  <artifactId>svrf-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.svrf.client:svrf-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/svrf-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.svrf.client.*;
import com.svrf.client.auth.*;
import com.svrf.client.model.*;
import com.svrf.client.api.AuthenticateApi;

import java.io.File;
import java.util.*;

public class AuthenticateApiExample {

    public static void main(String[] args) {
        
        AuthenticateApi apiInstance = new AuthenticateApi();
        Body body = new Body(); // Body | 
        try {
            AuthResponse result = apiInstance.appAuthenticatePost(body);
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
*MediaApi* | [**vrSearchGet**](docs/MediaApi.md#vrSearchGet) | **GET** /vr/search | Search Endpoint
*MediaApi* | [**vrTrendingGet**](docs/MediaApi.md#vrTrendingGet) | **GET** /vr/trending | Trending Endpoint


## Documentation for Models

 - [APIKey](docs/APIKey.md)
 - [Body](docs/Body.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Media](docs/Media.md)
 - [MediaFiles](docs/MediaFiles.md)
 - [MediaImages](docs/MediaImages.md)
 - [MediaStereo](docs/MediaStereo.md)
 - [MediaVideos](docs/MediaVideos.md)
 - [SuccessResponse](docs/SuccessResponse.md)
 - [AuthResponse](docs/AuthResponse.md)
 - [RateLimitResponse](docs/RateLimitResponse.md)
 - [SearchMediaResponse](docs/SearchMediaResponse.md)
 - [SingleMediaResponse](docs/SingleMediaResponse.md)
 - [TrendingResponse](docs/TrendingResponse.md)


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

