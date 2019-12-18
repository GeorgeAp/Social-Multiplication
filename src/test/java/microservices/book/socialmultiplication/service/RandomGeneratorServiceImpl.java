package microservices.book.socialmultiplication.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomGeneratorServiceImpl implements RandomGeneratorService{
    @Override
    public int generateRandomFactor(){
        final int MINIMUM_FACTOR = 11;
        final int MAXIMUM_FACTOR = 99;

        return new Random().nextInt((MAXIMUM_FACTOR - MINIMUM_FACTOR) + 1) + MINIMUM_FACTOR;
    }
}
