package com.example.demotime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.OffsetTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ShiftRepositoryTest {
    
    @Autowired
    private ShiftRepository shiftRepository;
    
    @Test
    void findAll() {
        Shift shift = new Shift(OffsetTime.parse("10:15:30+00:00"), OffsetTime.parse("11:25:30+00:00"));

        shiftRepository.saveAndFlush(shift);

        List<Shift> all = shiftRepository.findAll();

        assertEquals(1, all.size());
    }

}
