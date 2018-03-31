package ru.vmm.itsi.balansing.domain;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
class CounterService {

    public CounterService() {
        this.count = new AtomicInteger();
    }

    private AtomicInteger count;

    void incrementCount(){
        count.incrementAndGet();
    }

    int getCount() {
        return count.intValue();
    }
}