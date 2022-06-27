package com.example.almirtask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GreetingService {
    @Autowired GreetingRepository greetingRepository;

    public Greeting getById(String id) {
        return greetingRepository.findById(id).get();
    }

    public Greeting saveOrUpdate(Greeting greeting) {
        return greetingRepository.save(greeting);
    }
}
