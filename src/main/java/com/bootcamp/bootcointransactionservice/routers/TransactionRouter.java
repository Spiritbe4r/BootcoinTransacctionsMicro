package com.bootcamp.bootcointransactionservice.routers;

import com.bootcamp.bootcointransactionservice.handlers.TransactionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class TransactionRouter {
  @Bean
  public RouterFunction<ServerResponse> routes(TransactionHandler handler) {

    return route(POST("/api/bootcoin-transaction"), handler::createTransaction)
          .andRoute(GET("/api/bootcoin-transaction"), handler::findAll)
          .andRoute(GET("/api/bootcoin-transaction/{id}"), handler::findTranctionById)
          .andRoute(DELETE("/api/bootcoin-transaction/{id}"), handler::delete);
  }
}
