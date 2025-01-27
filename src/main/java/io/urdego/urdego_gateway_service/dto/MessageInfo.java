package io.urdego.urdego_gateway_service.dto;

public record MessageInfo<T>(
        String type,
        T payload,
        String userId
) {
}
