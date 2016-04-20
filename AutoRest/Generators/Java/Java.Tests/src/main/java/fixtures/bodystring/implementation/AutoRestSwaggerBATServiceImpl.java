/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring.implementation;

import fixtures.bodystring.AutoRestSwaggerBATService;
import fixtures.bodystring.Strings;
import fixtures.bodystring.Enums;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.AutoRestBaseUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the AutoRestSwaggerBATService class.
 */
public final class AutoRestSwaggerBATServiceImpl extends ServiceClient implements AutoRestSwaggerBATService {
    /**
     * The URL used as the base for all cloud service requests.
     */
    private final AutoRestBaseUrl baseUrl;

    /**
     * Gets the URL used as the base for all cloud service requests.
     *
     * @return The BaseUrl value.
     */
    public AutoRestBaseUrl getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * Gets the Strings object to access its operations.
     * @return the Strings object.
     */
    public Strings strings() {
        return new StringsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Gets the Enums object to access its operations.
     * @return the Enums object.
     */
    public Enums enums() {
        return new EnumsImpl(this.retrofitBuilder.client(clientBuilder.build()).build(), this);
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATService client.
     */
    public AutoRestSwaggerBATServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestSwaggerBATServiceImpl(String baseUrl) {
        super();
        this.baseUrl = new AutoRestBaseUrl(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATService client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building up an {@link OkHttpClient}
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestSwaggerBATServiceImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder retrofitBuilder) {
        super(clientBuilder, retrofitBuilder);
        this.baseUrl = new AutoRestBaseUrl(baseUrl);
        initialize();
    }

    @Override
    protected void initialize() {
        super.initialize();
        this.retrofitBuilder.baseUrl(baseUrl);
    }
}