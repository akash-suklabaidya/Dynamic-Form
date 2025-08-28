//package com.example.api_gateway.config; // Or your correct package
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class GatewayConfig {
//
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("form-service-route", r -> r.path("/api/forms/**")
//                        .filters(f -> f.rewritePath("/api/forms/(?<segment>.*)", "/api/v1/forms/${segment}"))
//                        .uri("lb://form-service"))
//                .build();
//    }
//}