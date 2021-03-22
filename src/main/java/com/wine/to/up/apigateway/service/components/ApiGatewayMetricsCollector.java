package com.wine.to.up.apigateway.service.components;

import com.wine.to.up.commonlib.metrics.CommonMetricsCollector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * This Class expose methods for recording specific metrics
 * It changes metrics of Micrometer and Prometheus simultaneously
 * Micrometer's metrics exposed at /actuator/prometheus
 * Prometheus' metrics exposed at /metrics-prometheus
 *
 */
@Component
public class ApiGatewayMetricsCollector extends CommonMetricsCollector {
    private static final String SERVICE_NAME = "api_gateway";

    public ApiGatewayMetricsCollector() {
        this(SERVICE_NAME);
    }

    private ApiGatewayMetricsCollector(String serviceName) {
        super(serviceName);
    }
}
