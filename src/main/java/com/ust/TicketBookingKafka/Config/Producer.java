package com.ust.TicketBookingKafka.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
@Component
public class Producer {



        private static final String TOPIC = "ticket-bookings";

        @Autowired
        private KafkaTemplate<String, String> kafkaTemplate;

        public void sendTicketBookingMessage(String message) {
            kafkaTemplate.send(TOPIC, message);
        }
    }

