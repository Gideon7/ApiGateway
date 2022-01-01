/**
 * 
 */
package com.gateway.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

/**
 * @author Giddytech
 * FallbackController to send fallback messages in case a service fails using hystrix
 *
 */
@RestController
public class FallbackController {
	@RequestMapping("/paymentFallback")
	public Mono<String> paymentServiceFallback(){
		return  Mono.just("Payment Service is taking too long to respond or is down. Please try again later");
	}
}
