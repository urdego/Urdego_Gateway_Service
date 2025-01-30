/*
package io.urdego.urdego_gateway_service.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                // 알림 서비스로 라우팅
                .route("notification-websocket-route", r -> r.path("/ws/notifications/**")
                        .uri("ws://notification-service:8081")) // 알림 서비스 URI

                // 게임 서비스로 라우팅
                .route("game-websocket-route", r -> r.path("/ws/games/**")
                        .uri("ws://game-service:8082")) // 게임 서비스 URI

                // 기타 WebSocket 요청 처리 (필요하면 추가)
                .build();
    }
}*/
