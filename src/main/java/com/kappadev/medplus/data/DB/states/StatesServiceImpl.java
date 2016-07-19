package com.kappadev.medplus.data.DB.states;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tburzynski
 */
@Service
public class StatesServiceImpl implements StatesService {

    @Autowired
    private StatesRepository statesRepository;

    @Override
    public List<States> getAllStates() {
        return statesRepository.findAll();
    }

}
