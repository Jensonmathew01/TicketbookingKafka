package com.ust.TicketBookingKafka.Config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

        @KafkaListener(topics = "ticket-bookings", groupId = "ticket-booking-group")
        public void consumeTicketBookingMessage(String message) {
            // Process the received message and update the database accordingly
            // For example, update the ticket and train availability in the MySQL database
        }

}
