/*
package io.urdego.urdego_gateway_service.controller;

import io.urdego.urdego_gateway_service.dto.MessageInfo;
import io.urdego.urdego_gateway_service.feign.game.dto.GameServiceFeignClient;
import io.urdego.urdego_gateway_service.feign.notification.NotificationServiceFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class WebSocketController {

    private final NotificationServiceFeignClient notificationServiceFeignClient;
    private final GameServiceFeignClient gameServiceFeignClient;
    private final SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/message")
    @SendTo("/urdego/sub")
    public void handleMessage(MessageInfo message) {
        switch (message.type()) {
            case "알림 전송 요청":
                // 알림 서비스로 메시지 전달 각각 UserId
                notificationServiceFeignClient.sendNotification(message.payload());
                break;

            case "안읽은 알림 불러오기":
                // 알림 서비스로 메시지 전달
                notificationServiceFeignClient.sendNotification(message.payload());
                break;

            case "JOIN_ROOM":
                // 방에 넣어버리는 메서드
                gameServiceFeignClient.processGameEvent(message.payload());
                break;
            case "START_GAME":
                // 게임 생성 및 시작 메서드

                break;
//            case "CHAT":
//                // 메시지를 직접 브로드캐스트
                 //  notificationServiceFeignClient.sendNotification(message.payload());
//                messagingTemplate.convertAndSend("/urdego/sub/" + message.payload().userId(), message);
//                break;
            default:
                throw new IllegalArgumentException("Unsupported message type: " + message.type());
        }
    }

    @MessageMapping("/message")
    @SendTo("/urdego/sub/{userId}")
    public void handleMessage2(MessageInfo message, @DestinationVariable String userId) {
        
    }
}
*/
