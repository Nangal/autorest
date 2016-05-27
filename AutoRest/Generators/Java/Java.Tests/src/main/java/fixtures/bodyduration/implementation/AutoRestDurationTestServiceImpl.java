/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyduration.implementation;

import fixtures.bodyduration.AutoRestDurationTestService;
import fixtures.bodyduration.Durations;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the AutoRestDurationTestService class.
 */
public final class AutoRestDurationTestServiceImpl extends ServiceClient implements AutoRestDurationTestService {

    /**
     * The Durations object to access its operations.
     */
    private Durations durations;

    /**
     * Gets the Durations object to access its operations.
     * @return the Durations object.
     */
    public Durations durations() {
        return this.durations;
    }

    /**
     * Initializes an instance of AutoRestDurationTestService client.
     */
    public AutoRestDurationTestServiceImpl() {
        this("https://localhost");
    }

    /**
     * Initializes an instance of AutoRestDurationTestService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestDurationTestServiceImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestDurationTestService client.
     *
     * @param restClient the pre-configured {@link RestClient} object
     */
    public AutoRestDurationTestServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.durations = new DurationsImpl(restClient().retrofit(), this);
    }
}